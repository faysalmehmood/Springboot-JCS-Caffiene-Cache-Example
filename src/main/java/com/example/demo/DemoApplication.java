package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.setBanner((environment, sourceClass, out) -> {
			System.out.println(" +-+ +-+ +-+\n" +
					" |i| |2| |c|\n" +
					" +-+ +-+ +-+");
		});
		application.setBannerMode(Banner.Mode.CONSOLE);
		application.run (args);
	}

}
