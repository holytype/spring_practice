package kh.mclass.demo1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(Demo1Application.class, args);
//		String[] beansNameArr = appContext.getBeanDefinitionNames();
		System.out.println("======");
//		for(String bean : beansNameArr) {
//			System.out.println(bean);
//		}
		//Arrays.stream(appContext.getBeanDefinitionNames()).forEach(System.out::println);		
		System.out.println("gen<<");
		Arrays.stream(appContext.getBeanDefinitionNames()).filter(s->s.contains("demo")).forEach(System.out::println);
		
		System.out.println("======");
	}

}
