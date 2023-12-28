package com.serviciosFacturacion.servicios.models;

import javax.persistence.*;

@Entity
@Table(name = "categoria_iva")
public class IvaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(columnDefinition = "bigint default 0")
    private Long id_categ_iva  ;

    @Column
    private String nomb_categ_iva;

    @Column
    private double valor;

    public Long getId_categ_iva() {
        return id_categ_iva;
    }

    public void setId_categ_iva(Long id_categ_iva) {
        this.id_categ_iva = id_categ_iva;
    }

    public String getNomb_categ_iva() {
        return nomb_categ_iva;
    }

    public void setNomb_categ_iva(String nomb_categ_iva) {
        this.nomb_categ_iva = nomb_categ_iva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
