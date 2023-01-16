package api.proyectoapi.Controller;

import api.proyectoapi.Infraestructure.EmpresaRepositorio;
import api.proyectoapi.Model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class EmpresaController {

    @Autowired
    EmpresaRepositorio empresaRepositorio;

    @GetMapping("/empresas")
    @ResponseStatus(HttpStatus.OK)
    public List<Empresa> getEmpresas()
    {
        return empresaRepositorio.findAll();
    }

    //generate a post method to save a new person
    @PostMapping("/guardarempresa")
    @ResponseStatus(HttpStatus.CREATED)
    public Empresa saveEmpresa(@RequestBody Empresa empresa)
    {

        return empresaRepositorio.save(empresa);
    }
    //generate a get method to get a person by id

    //generate a get method to get a person by id
    @GetMapping("/empresas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Empresa getEmpresa(@PathVariable int id)
    {
        return empresaRepositorio.findById(id).orElse(null);
    }

}
