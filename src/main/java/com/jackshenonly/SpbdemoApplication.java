package com.jackshenonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbdemoApplication.class, args);
	}



//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("我们来观察下：Spring Boot为我们注入了哪些类：");
//			String [] beanNames = ctx.getBeanDefinitionNames();
//			System.out.println("Bean的个数："+ beanNames.length);
//			for(String beanName : beanNames){
//				System.out.println(beanName);
//			}
//
//		};
//	}
}
