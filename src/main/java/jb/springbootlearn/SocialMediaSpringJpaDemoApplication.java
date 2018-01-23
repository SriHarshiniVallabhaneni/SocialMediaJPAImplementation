package jb.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import jb.springbootlearn.socialmedia.SocialMediaController;

@ComponentScan(basePackageClasses = SocialMediaController.class)
@SpringBootApplication
public class SocialMediaSpringJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialMediaSpringJpaDemoApplication.class, args);
	}
}
	