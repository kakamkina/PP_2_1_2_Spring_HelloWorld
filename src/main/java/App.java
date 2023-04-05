import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBean.getMessage());

        HelloWorld helloWorldBeanCopy =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBeanCopy.getMessage());

        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getVoice());

        Cat catBeanCopy =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanCopy.getVoice());

        System.out.println(helloWorldBean.equals(helloWorldBeanCopy));
        System.out.println(catBean.equals(catBeanCopy));


    }
}