package com.serviciosFacturacion.servicios.repositories;

import com.serviciosFacturacion.servicios.models.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ICustomerRepository extends JpaRepository<CustomerModel, Long> {
    @Query("SELECT c FROM CustomerModel c WHERE c.num_ident = :numIdent")
    Optional<CustomerModel> findByNumIdent(@Param("numIdent") String numIdent);


}
