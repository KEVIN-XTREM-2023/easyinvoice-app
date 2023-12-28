package com.serviciosFacturacion.servicios.repositories;

import com.serviciosFacturacion.servicios.models.PromotionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPromotionRepository  extends JpaRepository<PromotionModel,Long > {

}