package com.ssm.core.configuration;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//http://localhost/swagger-ui.html
public class SwaggerConfig {
	@Bean
	public Docket restApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.ssm.core.controller")).build();

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("ssm系统接口").description("构建接口测试")
				.termsOfServiceUrl("http://blog.csdn.net/itguangit").version("1.0").build();

	}
}
