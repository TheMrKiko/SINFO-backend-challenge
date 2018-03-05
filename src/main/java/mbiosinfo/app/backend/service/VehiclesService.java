package mbiosinfo.app.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class VehiclesService {
	
	@Autowired
    private JdbcTemplate jbctemp;

}
