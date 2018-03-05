package mbiosinfo.app.backend;
//http://zetcode.com/articles/springbootresth2/

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mbiosinfo.app.backend.service.VehiclesService;

@SpringBootApplication
public class BackendApplication  /*implements CommandLineRunner*/ {

	@Autowired
	VehiclesService vehiclesServ;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
