package com.serviciosFacturacion.servicios.repositories;

import com.serviciosFacturacion.servicios.models.IvaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIVaRepository extends JpaRepository<IvaModel,Long > {
}
