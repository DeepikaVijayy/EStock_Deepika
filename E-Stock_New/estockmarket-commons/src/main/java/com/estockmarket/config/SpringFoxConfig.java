package com.estockmarket.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .securitySchemes(apiKey())
                .securityContexts(Collections.singletonList(securityContext()))
                .select()
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .paths(Predicates.not(PathSelectors.regex("/graphiql.*")))
                .paths(Predicates.not(PathSelectors.regex("/actuator.*")))
                .build();
    }
    
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("/.*")).build();
                }
    
    private List<SecurityReference> defaultAuth(){
        List<SecurityReference> securityReferencesList = new ArrayList<>();
        final AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        final AuthorizationScope[] authorizationScopes = new AuthorizationScope[] {authorizationScope};
        SecurityReference accountId = new SecurityReference("AccountID", authorizationScopes);
        SecurityReference xApiKey = new SecurityReference("XApiKey", authorizationScopes);
        securityReferencesList.add(accountId);
        securityReferencesList.add(xApiKey);
        return securityReferencesList;
    }
    
    private ApiInfo apiInfo() {
    	String apiName = "Stock";
        return new ApiInfoBuilder().title(apiName)
                .description(apiName+" reference for developers")
                .version("1.0").build();
    }
    
    private List<ApiKey> apiKey() {
        List<ApiKey> apiKeyList = new ArrayList<>();
        ApiKey accountId = new ApiKey("AccountID", "accountId", "header");
        ApiKey xApikey = new ApiKey("XApiKey", "x-api-Key", "header");
        apiKeyList.add(accountId);
        apiKeyList.add(xApikey);
        return apiKeyList;
    }
}
