package com.mtm.party.mobile.config;


import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.ant;

/**
 * @Author: yihan.hu
 * @Date: 2018/10/27
 * @Description:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiger {
    @Bean
    public Docket restApi(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .groupName("ShopApplication")
                .forCodeGeneration(false)
            //最终调用的接口后会和paths拼接在一起
                .pathMapping("/")
                .select()
                .paths(Predicates.and(ant("/**"), Predicates.not(ant("/error"))))
                .build().apiInfo(apiApiInfo());
    }
    private ApiInfo apiApiInfo() {
        return new ApiInfoBuilder()
                .title("party")//大标题
                .description("Service Platform's REST API, all the applications could access the Object model data via JSON.")//详细描述
                .version("1.0")//版本
                .termsOfServiceUrl("NO terms of service")
                //.contact(new Contact("chenglong.tian", "", "chenglong.tian@percent.cn"))//作者
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }

}
