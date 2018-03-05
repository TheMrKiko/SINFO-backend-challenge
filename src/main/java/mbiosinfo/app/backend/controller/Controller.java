package mbiosinfo.app.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mbiosinfo.app.backend.service.VehiclesService;

@RestController
public class Controller {

    @Autowired
    private VehiclesService vehiclesService;


    @RequestMapping("/veh/{Id}")
    public Long findveh(@PathVariable Long Id) {
        return Id;
    }
}