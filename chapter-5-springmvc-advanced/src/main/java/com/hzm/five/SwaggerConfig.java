package com.hzm.five;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Package: com.hzm.five
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/2 19:34
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Value("com.hzm.five")
    private String swaggerBasicPackage;

    @Bean
    public Docket buildDocket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(buildApiInf()).select()
                .apis(RequestHandlerSelectors.basePackage("com.hzm.five")).paths(PathSelectors.any()).build();
    }


    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder().title("Spring MVC Demo")
                .termsOfServiceUrl("https://www.baidu.com")
                .description("Spring MVC My Demo")
                .contact(new Contact("hzm", "https://www.baidu.com", "houzm@pssyun.com"))
                .version("1.0").build();
    }
}
