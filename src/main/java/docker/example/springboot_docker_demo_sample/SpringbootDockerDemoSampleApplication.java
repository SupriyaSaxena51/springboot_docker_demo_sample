package docker.example.springboot_docker_demo_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoSampleApplication {
	@GetMapping("/welcome")
	public String welcome() {
		 return "Spring boot Docker demo application" ;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoSampleApplication.class, args);
	}

}
