--学生表
CREATE TABLE student
(s_id VARCHAR(50) NOT NULL ,
s_name VARCHAR(100) NOT NULL,
s_sex VARCHAR(50) NOT NULL,  
s_birthday DATETIME,         
s_class VARCHAR(50));   
--课程表    
CREATE TABLE coures
(c_id VARCHAR(50) NOT NULL,
c_name VARCHAR(100) NOT NULL,
t_id VARCHAR(100) NOT NULL) ; 
//--------------------------
--成绩表
CREATE TABLE score   
(s_no VARCHAR(50) NOT NULL,
s_id VARCHAR(30) NOT NULL, 
c_id VARCHAR(50) NOT NULL, 
degree INT(10) NOT NULL)  
//--------------------------------
--教师表
CREATE TABLE teacher       
(t_id VARCHAR(30) NOT NULL, 
t_name VARCHAR(40) NOT NULL, 
t_sex VARCHAR(20) NOT NULL, 
t_birthday DATETIME NOT NULL,
prof VARCHAR(60),             
depart VARCHAR(100) NOT NULL)

//由于忘记设置编码了，这里再改下，不然会插入数据错误
ALTER TABLE student CONVERT TO CHARACTER SET utf8;
ALTER TABLE teacher CONVERT TO CHARACTER SET utf8;
ALTER TABLE score CONVERT TO CHARACTER SET utf8;
ALTER TABLE coures CONVERT TO CHARACTER SET utf8;

//以此插入数据
INSERT INTO student VALUES ('108','曾华','男' ,'1977-09-01','95033');
INSERT INTO student (s_id,s_name,s_sex,s_birthday,s_class) VALUES ('105' ,'匡明' 
,'男' ,'1975-10-02','95031');
INSERT INTO student (s_id,s_name,s_sex,s_birthday,s_class) VALUES ('107 ','王丽' 
,'女' ,'1976-01-23','95033');
INSERT INTO student (s_id,s_name,s_sex,s_birthday,s_class) VALUES ('101' ,'李军' 
,'男' ,'1976-02-20','95033');
INSERT INTO student (s_id,s_name,s_sex,s_birthday,s_class) VALUES ('109','王芳' 
,'女' ,'1975-02-10',95031);
INSERT INTO student (s_id,s_name,s_sex,s_birthday,s_class) VALUES ('103' ,'陆君' 
,'男' ,'1974-06-03','95031');
//--------------------------
INSERT INTO coures(c_id,c_name,t_id)VALUES ('3-105' ,'计算机导论',825);
INSERT INTO coures(c_id,c_name,t_id)VALUES ('3-245' ,'操作系统' ,804);
INSERT INTO coures(c_id,c_name,t_id)VALUES ('6-166' ,'数据电路' ,856);
INSERT INTO coures(c_id,c_name,t_id)VALUES ('9-888' ,'高等数学' ,100);
//---------------------------
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (201,103,'3-245',86);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (202,105,'3-245',75);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (203,109,'3-245',68);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (204,103,'3-105',92);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (205,105,'3-105',88);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (206,109,'3-105',76);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (207,101,'3-105',64);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (208,107,'3-105',91);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (209,108,'3-105',78);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (2010,101,'6-166',85);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (2011,107,'6-106',79);
INSERT INTO score(s_no,s_id,c_id,degree)VALUES (2012,108,'6-166',81);
//--------------------------------------
INSERT INTO teacher(t_id,t_name,t_sex,t_birthday,prof,depart) 
VALUES (804,'李诚','男','1958-12-02','副教授','计算机系');
INSERT INTO teacher(t_id,t_name,t_sex,t_birthday,prof,depart) 
VALUES (856,'张旭','男','1969-03-12','讲师','电子工程系');
INSERT INTO teacher(t_id,t_name,t_sex,t_birthday,prof,depart)
VALUES (825,'王萍','女','1972-05-05','助教','计算机系');
INSERT INTO teacher(t_id,t_name,t_sex,t_birthday,prof,depart) 
VALUES (831,'刘冰','女','1977-08-14','助教','电子工程系');

1、 查询student表中的所有记录的s_name s_sex和s_class列。
SELECT s_name,s_sex FROM student

2、 查询教师所有的单位即不重复的depart列。distinct
SELECT DISTINCT depart FROM teacher
3、 查询student表的所有记录。
SELECT * FROM student

4、 查询score表中成绩在60到80之间的所有记录。
SELECT * FROM score WHERE degree BETWEEN 60 AND 80

5、 查询score表中成绩为85，86或88的记录。
SELECT * FROM score WHERE degree IN (85,86,88)

6、 查询student表中“95031”班或性别为“女”的同学记录。
SELECT * FROM student WHERE s_class='95031' OR s_sex='女'

7、 以s_class降序查询student表的所有记录。
SELECT * FROM student ORDER BY s_class DESC

8、 以c_id升序、degree降序查询score表的所有记录。
SELECT * FROM score ORDER BY c_id ASC,degree DESC
	
9、 查询“95031”班的学生人数。
SELECT COUNT(s_id) FROM student WHERE s_class='95031'
10、查询score表中的最高分的学生学号和课程号。
SELECT s_id,c_id ,degree FROM  score ORDER BY degree DESC LIMIT 1

11、查询‘3-105’号课程的平均分。
SELECT AVG(degree) FROM score WHERE c_id='3-105'
12、查询score表中至少有5名学生选修的并以3开头的课程的平均分数。
SELECT AVG(degree) FROM score GROUP BY c_id HAVING COUNT(c_id)>=5 AND c_id LIKE '3%'
13、查询最低分大于70，最高分小于90的s_id列。
SELECT s_id FROM score WHERE degree BETWEEN 70 AND 90
14、查询所有学生的s_name、c_id和degree列。
SELECT s_name,c_id,degree FROM student a LEFT JOIN score b ON a.s_id=b.s_id  
15、查询所有学生的s_id、c_name和degree列。
SELECT a.s_id,c_name,degree FROM student a LEFT JOIN score b ON a.s_id=b.s_id LEFT JOIN coures c ON b.c_id=c.c_id

16、查询所有学生的s_name、c_name和degree列。
SELECT s_name,c_name,degree FROM student a LEFT JOIN score b ON a.s_id=b.s_id LEFT JOIN coures c ON b.c_id=c.c_id
	
17、查询“95033”班所选课程的平均分。
SELECT c_id,AVG(degree) FROM score WHERE score.s_id IN (SELECT student.s_id FROM student WHERE s_class='95033') GROUP BY c_id
18、假设使用如下命令建立了一个grade表：
CREATE TABLE grade(low   INT(3),
		upp   INT(3),
		rank   CHAR(1));
INSERT INTO grade VALUES(90,100,"A");
INSERT INTO grade VALUES(80,89,"B");
INSERT INTO grade VALUES(70,79,"C");
INSERT INTO grade VALUES(60,69,"D");
INSERT INTO grade VALUES(0,59,"E");
ALTER TABLE grade  CONVERT TO CHARACTER SET utf8;
现查询所有同学的s_id、c_id和rank列。
SELECT * FROM grade
SELECT a.s_id,c_id ,degree,CASE 
                         WHEN degree>=90 THEN 'A'
                         WHEN degree>=80 THEN 'B'
                         WHEN degree>=70 THEN 'C'
                         WHEN degree>=60 THEN 'D'
                         ELSE 'E'
                         END AS hhh
                         FROM student a LEFT JOIN score b ON a.s_id=b.s_id ,grade
19、查询选修“3-105”课程的成绩高于“109”号同学成绩的所有同学的记录。
SELECT * FROM  score WHERE degree>(SELECT degree FROM  score WHERE s_id='109' AND c_id='3-105') AND c_id='3-105'

20、查询score中选学一门以上课程的同学中分数为非最高分成绩的记录。
SELECT *FROM  score WHERE s_id IN (SELECT s_id FROM  score GROUP BY s_id HAVING COUNT(s_id)>1)
AND s_no NOT IN
(SELECT s_no FROM  score WHERE s_id IN (SELECT s_id FROM  score GROUP BY s_id HAVING COUNT(s_id)>1) GROUP BY c_id ORDER BY degree)
22、查询和学号为108的同学同年出生的所有学生的s_id、s_name和s_birthday列。
SELECT s_id,s_name,DATE_FORMAT(s_birthday ,'%Y' ) FROM student WHERE DATE_FORMAT(s_birthday ,'%Y' ) =(SELECT DATE_FORMAT(s_birthday ,'%Y' )  FROM student WHERE s_id='108')

23、查询“张旭“教师任课的学生成绩。
SELECT * FROM score WHERE c_id IN (SELECT c_id FROM coures  WHERE t_id IN (SELECT t_id FROM teacher  WHERE t_name='张旭'))
24、查询选修某课程的同学人数多于5人的教师姓名。
SELECT * FROM teacher	WHERE t_id IN
(SELECT t_id FROM coures WHERE c_id IN
(SELECT c_id FROM score GROUP BY c_id HAVING COUNT(s_id)>5))
25、查询95033班和95031班全体学生的记录。
SELECT * FROM student	

26、查询存在有85分以上成绩的课程c_id.
SELECT DISTINCT c_id FROM score WHERE degree>85
27、查询出“计算机系“教师所教课程的成绩表。
SELECT * FROM score WHERE c_id IN
(SELECT c_id FROM coures WHERE t_id IN
(SELECT t_id FROM teacher WHERE depart='计算机系'))
28、查询“计算机系”与“电子工程系“不同职称的教师的Tname和Prof。
SELECT t_name,prof,depart FROM teacher	ORDER BY depart
29、查询选修编号为“3-105“课程且成绩至少高于选修编号为“3-245”的同学的c_id、s_id和Degree,并按Degree从高到低次序排序。
SELECT a.c_id,a.s_id,a.degree FROM score a 
LEFT JOIN (SELECT * FROM score WHERE c_id='3-245') b ON a.s_id=b.s_id WHERE a.c_id='3-105' AND a.degree>b.degree 
ORDER BY a.degree DESC
30、查询选修编号为“3-105”且成绩高于选修编号为“3-245”课程的同学的c_id、s_id和Degree.
SELECT a.c_id,a.s_id,a.degree FROM score a 
LEFT JOIN (SELECT * FROM score WHERE c_id='3-245') b ON a.s_id=b.s_id WHERE a.c_id='3-105' AND a.degree>b.degree 
ORDER BY a.degree DESC
31、查询所有教师和同学的name、sex和birthday.
SELECT s_name,s_sex,s_birthday FROM student
UNION ALL
SELECT t_name,t_sex,t_birthday FROM teacher
32、查询所有“女”教师和“女”同学的name、sex和birthday.
SELECT s_name,s_sex,s_birthday FROM student WHERE s_sex='女'
UNION ALL
SELECT t_name,t_sex,t_birthday FROM teacher WHERE t_sex='女'

33、查询成绩比该课程平均成绩低的同学的成绩表。
SELECT * FROM score a LEFT JOIN 
(SELECT c_id,AVG(degree) avgs FROM score GROUP BY c_id ) b ON a.c_id=b.c_id 
WHERE a.degree<b.avgs

34、查询所有任课教师的t_name和Depart.
SELECT t_name, depart FROM teacher WHERE t_id IN
(SELECT t_id FROM coures)
35  查询所有未讲课的教师的t_name和Depart. 
SELECT t_name, depart FROM teacher WHERE t_id  NOT IN
(SELECT t_id FROM coures)
36、查询至少有2名男生的班号。
SELECT s_class FROM student WHERE s_sex='男' GROUP BY s_class  HAVING COUNT(s_class)>1
37、查询Student表中不姓“王”的同学记录。
SELECT * FROM student WHERE s_name REGEXP '^[^王].*'
38、查询Student表中每个学生的姓名和年龄。
SELECT s_name,2019-YEAR(s_birthday) FROM student

39、查询Student表中最大和最小的s_birthday日期值。
SELECT MAX(s_birthday),MIN(s_birthday) FROM student 
40、以班号和年龄从大到小的顺序查询Student表中的全部记录。
SELECT s_id,s_name,s_sex,s_birthday,s_class,2019-YEAR(s_birthday) age FROM student ORDER BY s_class DESC,age DESC
41、查询“男”教师及其所上的课程。
SELECT * FROM teacher a LEFT JOIN coures b ON a.t_id=b.t_id WHERE t_sex='男'
42、查询最高分同学的s_id、c_id和Degree列。
SELECT * FROM score ORDER BY degree DESC LIMIT 1
43、查询和“李军”同性别的所有同学的s_name.
SELECT s_name FROM student WHERE s_sex=
(SELECT s_sex FROM student WHERE s_name='李军')
44、查询和“李军”同性别并同班的同学s_name.
SELECT * FROM student WHERE s_sex=(SELECT s_sex FROM student WHERE s_name='李军')
AND
s_class=(SELECT s_class FROM student WHERE s_name='李军')
45、查询所有选修“计算机导论”课程的“男”同学的成绩表
SELECT * FROM score WHERE c_id =(SELECT c_id FROM coures WHERE c_name='计算机导论')
AND 
s_id IN (SELECT s_id FROM student WHERE s_sex='男')
