package api.proyectoapi.Model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "empresa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Empresa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String celular;
    private String direccion;
    private String email;
    private String ciudad;
    private String ruc;
}
