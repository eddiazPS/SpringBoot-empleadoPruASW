package www.api.rest.api.rest.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import www.api.rest.api.rest.entity.Empleado;
import www.api.rest.api.rest.service.EmpleadoService;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    private EmpleadoService employeeService;

    @Autowired
    public EmpleadoRestController(EmpleadoService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/empleados")
    public List<Empleado> findAll() {
        return employeeService.findAll();
    }





}
