package www.api.rest.api.rest.service;


import org.springframework.stereotype.Service;
import www.api.rest.api.rest.entity.Empleado;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {



    @Override
    public List<Empleado> findAll() {
        return List.of(new Empleado(1,"Paco",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Paca",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Paquita",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Paca",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Tito",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Tita",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Titita",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Sandro",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Sandra",22, LocalDate.of(2003, 10, 1)),
                new Empleado(1,"Sandra",22, LocalDate.of(2003, 10, 1))
        );
    }





}
