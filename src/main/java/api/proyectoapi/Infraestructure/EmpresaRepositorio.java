package api.proyectoapi.Infraestructure;

import api.proyectoapi.Model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepositorio extends JpaRepository<Empresa, Integer> {
}
