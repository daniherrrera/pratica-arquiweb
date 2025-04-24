package danielherrera.apidaniel123.servicesinterfaces;

import danielherrera.apidaniel123.entities.Area;

import java.util.List;

public interface IAreaService {
    public List<Area> List();
    public void insert(Area a);
    public Area ListId(int id);
    public void update(Area a);
    public void delete(int id);
public List<Area> find(String nombre);
}
