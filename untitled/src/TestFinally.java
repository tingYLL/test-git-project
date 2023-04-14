/**
 * @version v1.0
 * @Author zhy
 * Description 默认
 */
public class TestFinally {
    public static void main(String[] args) {
        int result = test(10);
        System.out.println(result);
    }

    public static int test(int num){
        try {
            return num;
        } catch (Exception e) {
            return num--;
        } finally {
            System.out.println("test方法调用结束");
            num++;
        }
    }
}
