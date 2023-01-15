package ro.mycode.manageshoponline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.manageshoponline.service.ProductService;

@SpringBootApplication
public class ManageShopOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageShopOnlineApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner (ProductService productService){
		return  args -> {
			productService.getAllProducts().forEach(System.out::println);
		};
	}
}
