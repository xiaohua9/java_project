package mytest;
//以往运行一个方法需要在主方法中直接或间接调用，才能执行，
//现在通过测试单元，junit可以实现不需要主方法而运行，使得每一个方法的测试变得更加灵活
import com.Calc;
import org.junit.Test;

public class CalcTest {
    @Test
    public void testAdd(){
        Calc calc=new Calc();
        calc.add(7,9);
    }
}
