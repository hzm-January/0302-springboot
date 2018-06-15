package demo.spring.boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRun {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloConfig.class);
        UseHelloWorldService useHelloWorldService = (UseHelloWorldService) applicationContext.getBean(UseHelloWorldService.class);
        System.out.println(useHelloWorldService.sayHello("WOrld"));
        applicationContext.close();
    }

}
