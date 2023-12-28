package com.serviciosFacturacion.servicios.models;

import javax.persistence.*;

@Entity
@Table(name = "promocion")
public class PromotionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(columnDefinition = "bigint default 0")
    private Long id_prom ;

    @Column
    private String nom_prom;

    @Column
    private String descrip_prom;

    @Column
    private float porcentaje_desc;

    @Column
    private String tip_prom;

    public Long getId_prom() {
        return id_prom;
    }

    public void setId_prom(Long id_prom) {
        this.id_prom = id_prom;
    }

    public String getNom_prom() {
        return nom_prom;
    }

    public void setNom_prom(String nom_prom) {
        this.nom_prom = nom_prom;
    }

    public String getDescrip_prom() {
        return descrip_prom;
    }

    public void setDescrip_prom(String descrip_prom) {
        this.descrip_prom = descrip_prom;
    }

    public float getPorcentaje_desc() {
        return porcentaje_desc;
    }

    public void setPorcentaje_desc(float porcentaje_desc) {
        this.porcentaje_desc = porcentaje_desc;
    }

    public String getTip_prom() {
        return tip_prom;
    }

    public void setTip_prom(String tip_prom) {
        this.tip_prom = tip_prom;
    }
}
