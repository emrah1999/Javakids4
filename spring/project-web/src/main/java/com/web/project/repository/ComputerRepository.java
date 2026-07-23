package com.web.project.repository;

import com.web.project.entity.ComputersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<ComputersEntity,Long> {
    //select * from computers where model = ?1
    List<ComputersEntity> findByModelIgnoreCase(String model);

    //select * from computers where model like %?1%
    List<ComputersEntity> findByModelContaining(String model);

    List<ComputersEntity> findByModelContainingIgnoreCase(String model);

    //select * from computers where brand = ?1
    List<ComputersEntity> findByBrand(String brand);

    List<ComputersEntity> findByBrandIgnoreCaseOrderByIdDesc(String brand);

    Long countByBrandIgnoreCase(String brand);


    //select * from computers where brand = ?1 and model = ?2
    List<ComputersEntity> findByBrandAndModel(String model,String brand);

    //select * from computers where brand = ?1 or model = ?2
    List<ComputersEntity> findByBrandOrModel(String model,String brand);

    //select * from computers where price > ?1
    public List<ComputersEntity> findByPriceGreaterThan(Double price);

    //select * from computers where price between ?1 and ?2
    public List<ComputersEntity> findByPriceBetween(Double priceStart,Double priceEnd);

}
