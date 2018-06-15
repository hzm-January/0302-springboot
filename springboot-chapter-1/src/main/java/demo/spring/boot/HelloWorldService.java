package demo.spring.boot;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String sayHello(String hello){
        return "Hello "+hello+" !";
    }
}
