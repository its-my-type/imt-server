package com.example.imt.common.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
@EnableWebMvc
class SwaggerConfigurer {

    private fun apiInfo(): ApiInfo? = ApiInfoBuilder()
        .title("It's my type API docs")
        .version("imt-v1-220417")
        .build()

    @Bean
    fun api(): Docket = Docket(DocumentationType.OAS_30)
        .useDefaultResponseMessages(true)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.example.imt"))
        .paths(PathSelectors.any())
        .build()
}
