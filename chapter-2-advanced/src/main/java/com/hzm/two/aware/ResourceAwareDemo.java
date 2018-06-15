package com.hzm.two.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Locale;

@Component
public class ResourceAwareDemo implements ResourceLoaderAware, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, MessageSourceAware, ApplicationEventPublisherAware{

    private ResourceLoader resourceLoader;
    private BeanFactory beanFactory;
    private String name;
    private ApplicationContext applicationContext;
    private MessageSource messageSource;
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void show(){
        Resource resource = resourceLoader.getResource("classpath:common/test.txt");
        Object reSourceAwareDemo = beanFactory.getBean("resourceAwareDemo");
        String applicationName = applicationContext.getApplicationName();
        String default_i18n_message = messageSource.getMessage("0001", null, "default i18n message", Locale.CHINA);
        try {
            System.out.println(IOUtils.toString(resource.getInputStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(reSourceAwareDemo.getClass());
        System.out.println(applicationName);
        System.out.println(default_i18n_message);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        this.name = s;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
