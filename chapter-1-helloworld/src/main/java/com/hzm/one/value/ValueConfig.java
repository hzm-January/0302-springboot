package com.hzm.one.value;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


@Configuration
@ComponentScan(value = "com.hzm.one.value")
@PropertySource(value = "classpath:common/config.properties")
public class ValueConfig {

    /**
     * 注入普通字符串
     */
    @Value("Laugh with I cry")
    private String stringValue;

    /**
     * 注入操作系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String systemValue;

    /**
     * 注入表达式运算结果
     */
    @Value("#{T(java.lang.Math).random()*100.0}")
    private String expressionValue;

    /**
     * 注入其他Bean属性
     */
    @Value("#{anotherService.another}")
    private String fromAnotherValue;

    /**
     * 注入文件资源
     */
    @Value("classpath:common/test.txt")
    private Resource fileValue;

    /**
     * 注入网址资源
     */
    @Value("http://www.baidu.com")
    private Resource urlValue;

    /**
     * 注入配置文件
     */
    @Value("${book.name}")
    private String propertiesValue;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(stringValue);
            System.out.println(systemValue);
            System.out.println(expressionValue);
            System.out.println(fromAnotherValue);
            System.out.println(IOUtils.toString(fileValue.getInputStream()));
            System.out.println(IOUtils.toString(urlValue.getInputStream()));
            System.out.println(propertiesValue);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
