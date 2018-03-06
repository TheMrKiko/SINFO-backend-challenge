package mbiosinfo.app.backend;
//http://zetcode.com/articles/springbootresth2/

import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread.State;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import mbiosinfo.app.backend.bean.Root;
import mbiosinfo.app.backend.repository.VehiclesRepository;
import mbiosinfo.app.backend.service.VehiclesService;

@SpringBootApplication
public class BackendApplication  implements CommandLineRunner {

	@Autowired
	VehiclesService vehiclesServ;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<Root> typeReference = new TypeReference<Root>() {};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/dataset.json");
		try {
			Root stateList = mapper.readValue(inputStream, typeReference);
			vehiclesServ.save(stateList);
			System.out.println("States list saved successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
