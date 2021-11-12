package com.olxmasterdata;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class OlxMasterdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxMasterdataApplication.class, args);
	}
	
	@Bean
	public Docket getCustomizedDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.olxmasterdata"))
				.build()
				.apiInfo(buildApiDoc());
	}
	
	private ApiInfo buildApiDoc() {
		return new ApiInfo("MasterData API", "This API helps user to see advertise Categories", "1.0.0", "https://zensar.com/policy", new Contact("Kartik", "/zensar.com", "kartik.patil@zensar.com"), "GPL", "http://gpl.com", new ArrayList<VendorExtension>());
	}

}
