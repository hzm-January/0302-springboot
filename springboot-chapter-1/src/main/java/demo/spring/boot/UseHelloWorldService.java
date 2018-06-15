package demo.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseHelloWorldService {

    @Autowired
    private HelloWorldService helloWorldService;

    public String sayHello(String hello){
        return helloWorldService.sayHello(hello);
    }
}
