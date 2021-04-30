package chapter02;

/**
 * @program: JVMPtoject
 * @create: 2021-04-24
 **/
public class HelloLoader {

//    public static HelloService helloService = new HelloServiceImpl();

    public static void test(String param){
        HelloService helloService = new HelloServiceImpl();
        helloService.test(param);
        System.out.println("执行了");
    }

    public static void main(String[] args) {
        test("11111");
    }

}
