//乘法表
function show(){
				for (var i=1;i<10;i++) {
					for (var j=1;j<=i;j++) {
						document.write(i+"*"+j+"="+(i*j)+"&nbsp&nbsp")
					}
					document.write("<br/>")
				}
			}

//计算销售额
function saleMoney(){
	var price=10;
	var number=3;
	alert("销售额："+price*number);
}
//判断2019年时平年还是闰年
function yearIs(){
	var year=2019;
	if(year/4==0){
		alert(year+"是闰年")
	}else{
		alert(year+"是平年")
	}
}
//输出当前系统时间是星期几
function thisWeek(){
	var date=new Date();
	var thisWeek=date.getDay();
	switch (thisWeek){
		case 1:
			alert("星期一")
			break;
		case 2:
			alert("星期二")
			break;
		case 3:
			alert("星期三")
			break;
		case 4:
			alert("星期四")
			break;
		case 5:
			alert("星期五")
			break;
		case 6:
			alert("星期六")
			break;
		case 7:
			alert("星期日")
			break;
	}
}
//输出六次字符串，每次增大字号
function easy(){
	var tmp=1;
	while (tmp<7){
		document.write("<p style='font-size:"+(tmp*10)+"px'>javascript很容易</p>")
		tmp++;
	}
}
//输出当前系统时间
function showDate(){
	var date=new Date();
	alert(date.getYear()+1900+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日"+date.getHours()+"时"+date.getMinutes()+"分"+date.getSeconds()+"秒");
}
//在页面上输出一个菱形，拆分思想
function rhombus(){
	var rows=5;
	for (var i=0;i<(rows+1)/2;i++) {
		for (var j=(rows+1)/2-i;j>1;j--) {
			document.write("&nbsp");
		}
		for (var k=0;k<2*(i+1)-1;k++) {
			document.write("*");
		}
		document.write("<br/>");
	}
	for (var i=1;i<=(rows-1)/2;i++) {
		for (var j=0;j<i;j++) {
			document.write("&nbsp");
		}
		for (var k=1;k<=(rows-2*i);k++){
			document.write("*");
		}
		document.write("<br/>");
	}
}
//在页面上输出一个菱形，绝对值函数思想
function rhombus2(){
	var height=7;
	for (var i=(height-1)/2;Math.abs(i)<=(height-1)/2;i--) {
		for (var j=1;j<=Math.abs(i);j++) {
			document.write("&nbsp");
		}
		for (var k=1;k<=(height-Math.abs(i)*2);k++) {
			document.write("*");
		}
		document.write("<br />");
	}
}
//在页面上输出对顶三角形
function triangle(){
	var height=5;
	for (var i=5;Math.abs(i)<=height;i-=2) {
		if (i!=-1) {
			for (var j=1;j<=(height-Math.abs(i))/2;j++) {
				document.write("&nbsp");
			}
			for (var k=1;k<=Math.abs(i);k++) {
				document.write("*");
			}
			document.write("<br />");
		}
	}
}

//冒泡排序

function orderM(){
	var arr=[34,21,54,90];
	for (var i=0;i<arr.length-1;i++) {
		for (var j=0;j<arr.length-i-1;j++) {
			if (arr[j]>arr[j+1]) {
				var tmp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
			}
		}
	}
	for (var i=0;i<arr.length;i++) {
		document.write(arr[i]+",");
	}
}
//选择排序
function orderS(){
	var arr=[34,21,54,90];
	for (var i=0;i<arr.length-1;i++) {
		for (var j=i+1;j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				var tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
	}
	for (var i=0;i<arr.length;i++) {
		document.write(arr[i]+",");
	}
}
