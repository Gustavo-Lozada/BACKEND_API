package api.proyectoapi.Controller;

import api.proyectoapi.Infraestructure.ProductoRepositorio;
import api.proyectoapi.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    ProductoRepositorio productoRepositorio;

    @GetMapping("/productos")
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> getProductos()
    {
        return productoRepositorio.findAll();
    }

    //generate a post method to save a new person
    @PostMapping("/guardarproducto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto saveProducto (@RequestBody Producto producto)
    {

        return productoRepositorio.save(producto);
    }

    //generate a put method to update a person
    @PutMapping("/actualizarproducto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto updateProducto(@RequestBody Producto producto)
    {
        return productoRepositorio.save(producto);
    }

    //generate a delete method to delete a person
    @DeleteMapping("/eliminarproducto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteproducto(@PathVariable int id)
    {
        productoRepositorio.deleteById(id);
    }}
