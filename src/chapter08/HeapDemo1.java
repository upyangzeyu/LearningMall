package chapter08;

/**
 *  -Xms10m -Xmx10m
 * @program: JVMPtoject
 * @create: 2021-04-28
 **/
public class HeapDemo1 {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
