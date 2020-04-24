package lets.code.now;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class MyappOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyappOauth2Application.class, args);
	}

}
