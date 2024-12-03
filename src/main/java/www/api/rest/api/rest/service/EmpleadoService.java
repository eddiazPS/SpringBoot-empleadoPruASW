package www.api.rest.api.rest.service;



import www.api.rest.api.rest.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    List<Empleado> findAll();
}
