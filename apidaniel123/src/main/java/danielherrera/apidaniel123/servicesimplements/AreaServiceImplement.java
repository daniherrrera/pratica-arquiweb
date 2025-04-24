package danielherrera.apidaniel123.servicesimplements;

import danielherrera.apidaniel123.entities.Area;
import danielherrera.apidaniel123.repositories.IAreaRepository;
import danielherrera.apidaniel123.servicesinterfaces.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImplement implements IAreaService {
   @Autowired
    private IAreaRepository aR;//hacer ar

    @Override
    public List<Area> List() {
        return aR.findAll();//select*from area
    }

    @Override
    public void insert(Area a) {
        aR.save(a);//insert into area values()
    }

    @Override
    public Area ListId(int id) {
        return aR.findById(id).orElse(new Area());
    }

    @Override
    public void update(Area a) {
        aR.save(a);//update set area
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);//delite from are awhere id=
    }

    @Override
    public List<Area> find(String nombre) {
        return aR.buscarPorNombre(nombre);
    }
}
