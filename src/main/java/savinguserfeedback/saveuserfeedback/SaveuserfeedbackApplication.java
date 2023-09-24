package savinguserfeedback.saveuserfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="savinguserfeedback.saveuserfeedback")

@EntityScan(basePackages="savinguserfeedback.saveuserfeedback")
@EnableJpaRepositories(basePackages="savinguserfeedback.saveuserfeedback")

public class SaveuserfeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveuserfeedbackApplication.class, args);
	}

}
