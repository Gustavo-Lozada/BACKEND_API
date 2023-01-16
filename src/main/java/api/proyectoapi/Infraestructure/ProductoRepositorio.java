package api.proyectoapi.Infraestructure;

import api.proyectoapi.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
