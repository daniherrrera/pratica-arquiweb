package danielherrera.apidaniel123.repositories;

import danielherrera.apidaniel123.dtos.AreaDTO;
import danielherrera.apidaniel123.entities.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAreaRepository extends JpaRepository<Area,Integer> {
@Query("select a from Area a where a.nameArea like %:n%")
    public List<Area> buscarPorNombre(@Param("n")String n);//buscar
}


//extends= herencia