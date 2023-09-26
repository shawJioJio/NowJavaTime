public class StatementTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("x =" + x );
        System.out.println("y =" + y );
        //对x和y的值进行修改
        x++;
        y = 2 * x +y ;
        x = x * 10;
        System.out.println("x =" + x );
        System.out.println("y =" + y );
    }
}
