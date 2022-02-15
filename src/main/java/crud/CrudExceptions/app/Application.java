package crud.CrudExceptions.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"crud.CrudExceptions.content.persona.infrastucture.controller",
		"crud.CrudExceptions.content.persona.application",
		"crud.CrudExceptions.content.persona.infrastucture.repository.jpa"
})

@EnableJpaRepositories(basePackages = {"crud.CrudExceptions.content.persona.infrastucture.repository.jpa"})

@EntityScan("crud.CrudExceptions.content.persona.domain")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
