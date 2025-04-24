package danielherrera.apidaniel123.controllers;

import danielherrera.apidaniel123.dtos.AreaDTO;
import danielherrera.apidaniel123.entities.Area;
import danielherrera.apidaniel123.servicesinterfaces.IAreaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/areas")
public class AreaController {

    @Autowired
    private IAreaService aS;

    @GetMapping
    public List<AreaDTO> Listar(){

        return aS.List().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,AreaDTO.class);
        }).collect(Collectors.toList());
    }
@GetMapping("/busqueda")
    public List<AreaDTO> buscar(@RequestParam String abuscar){

        return aS.find(abuscar).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,AreaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody AreaDTO dto){
        ModelMapper m= new ModelMapper();
        Area a= m.map(dto,Area.class);
        aS.insert(a);
    }

    @GetMapping("/{id}")
    public AreaDTO buscarId(@PathVariable("id") int id){
        ModelMapper m=new ModelMapper();
        AreaDTO dto=m.map(aS.ListId(id),AreaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody AreaDTO dto){
        ModelMapper m= new ModelMapper();
        Area a= m.map(dto,Area.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
public void eliminar(@PathVariable("id") int id){
        aS.delete(id);
}
}
