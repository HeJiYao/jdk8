import org.junit.jupiter.api.Test;

/**
 * @author He_Ji_Yao
 */
public class JavaTest {
    @Test
    public void Test1(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0){
                sum++;
                System.out.print(String.format("奇数有%d\t",i));
            }
            if (sum % 5 ==0) {
                System.out.println();
            }
        }
        System.out.println(String.format("奇数总共有%d个",sum));
    }
    @Test
    public void Test2(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum++;
                System.out.print(String.format("偶数有%d\t",i));
            }
            if (sum % 5 ==0) {
                System.out.println();
            }
        }
        System.out.println(String.format("偶数总共有%d个",sum));
    }
    @Test
    public void Test3(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                sum++;
                System.out.print(String.format("余3等于0的有%d\t",i));
            }
            if (sum % 5 ==0) {
                System.out.println();
            }
        }
        System.out.println(String.format("余3等于0的总共有%d个",sum));
    }
}
