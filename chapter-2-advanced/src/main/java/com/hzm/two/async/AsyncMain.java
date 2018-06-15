package com.hzm.two.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncMain {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AsyncConfig.class);
        TaskService taskService = applicationContext.getBean(TaskService.class);
        for (int i =0;i<30;i++){
            taskService.executeAsyncTask(i);
            taskService.executeAsyncTask2(i);
        }
        applicationContext.close();

    }

}
