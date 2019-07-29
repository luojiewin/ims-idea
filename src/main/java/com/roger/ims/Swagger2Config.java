package com.roger.ims;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**  
* @Title: Swagger2Config  
* @Description: swwager配置文件
* @author roger  
* @date 2019年7月17日  
*/  
@Configuration
public class Swagger2Config {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.roger.ims.controller")).paths(PathSelectors.any()).build();
	}

	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("XX系统API文档")
				.description("").version("1.0").build();
	}
}
