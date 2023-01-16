package api.proyectoapi.Model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codigo;
    private String nombre;

    private String bronce;
    private String negro;
    private String champang;
    private String blanco;
    private String madera;
    private String nogal;
}
