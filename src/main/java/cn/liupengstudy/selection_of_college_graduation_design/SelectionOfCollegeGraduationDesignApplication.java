package cn.liupengstudy.selection_of_college_graduation_design;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;



@SpringBootApplication
@EnableAutoConfiguration //exclude表示自动配置时不包括Multipart配置
@ComponentScan(basePackages = {"cn.liupengstudy.selection_of_college_graduation_design"})
@MapperScan(value = "cn.liupengstudy.selection_of_college_graduation_design.mapper")
public class SelectionOfCollegeGraduationDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelectionOfCollegeGraduationDesignApplication.class, args);
    }

    /**
     * 显示声明CommonsMultipartResolver为mutipartResolver
     */
    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        //resolver.setDefaultEncoding("UTF-8");
        //resolveLazily属性启用是为了推迟文件解析，以在在UploadAction中捕获文件大小异常
        resolver.setResolveLazily(true);
        resolver.setMaxInMemorySize(40960);
        resolver.setMaxUploadSize(3 * 1024 * 1024);//上传文件大小 3M 3*1024*1024
        return resolver;
    }

}

// http://localhost:8080/swagger-ui.html