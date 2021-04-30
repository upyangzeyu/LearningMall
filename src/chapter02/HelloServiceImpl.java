package chapter02;

/**
 * @program: JVMPtoject
 * @create: 2021-04-26
 **/
public class HelloServiceImpl implements HelloService{

    @Override
    public void test(String param) {
        System.out.println(param + "----------哈哈哈");
    }

}
