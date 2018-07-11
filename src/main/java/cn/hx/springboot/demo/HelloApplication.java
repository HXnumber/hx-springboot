package cn.hx.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {
	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello springboot哈哈哈";
	}
	
	public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
        //close banner
//		SpringApplication application = new SpringApplication(HelloApplication.class);
//        application.setBannerMode(Mode.OFF);
//        application.run(args);
    }
}
