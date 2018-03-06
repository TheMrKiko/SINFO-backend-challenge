package mbiosinfo.app.backend.repository;

import org.springframework.stereotype.Repository;

import mbiosinfo.app.backend.bean.Root;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Repository
public interface VehiclesRepository /*extends CrudRepository<Root, Long>*/ {

}
