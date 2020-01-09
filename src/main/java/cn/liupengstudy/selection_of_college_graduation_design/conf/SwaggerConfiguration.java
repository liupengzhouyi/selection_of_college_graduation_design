package cn.liupengstudy.selection_of_college_graduation_design.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName SwaggerConfiguration.java
 * @Description TODO
 * @createTime 2020年01月09日 16:47:00
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("资源管理")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.liupengstudy.selection_of_college_graduation_design.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket createMonitorRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("实时监测")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.liupengstudy.selection_of_college_graduation_design"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket createActivitiRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("工作流引擎")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.liupengstudy.selection_of_college_graduation_design.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket createBaseRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("kernel模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.liupengstudy.selection_of_college_graduation_design.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket createComplaintRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("投诉管理")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.liupengstudy.selection_of_college_graduation_design.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("高校毕业选题系统")
                .description("swagger RESTful APIs")
                .termsOfServiceUrl("http://www.test.com/")
                .contact("xiaoymin@foxmail.com")
                .version("1.0")
                .build();
    }
}