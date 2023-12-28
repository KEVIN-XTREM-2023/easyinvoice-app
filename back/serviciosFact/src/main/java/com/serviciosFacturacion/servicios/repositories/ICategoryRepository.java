package com.serviciosFacturacion.servicios.repositories;

import com.serviciosFacturacion.servicios.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryModel,Long > {
}
