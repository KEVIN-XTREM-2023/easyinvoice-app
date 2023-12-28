package com.serviciosFacturacion.servicios.models;

import javax.persistence.*;

@Entity
@Table(name = "categoria_producto")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(columnDefinition = "bigint default 0")
    private Long id_categ ;

    @Column
    private  String nom_categ;
    @Column
    private  String descrip_categ;
    @Column
    private  Long parent_id ;

    public Long getId_categ() {
        return id_categ;
    }

    public void setId_categ(Long id_categ) {
        this.id_categ = id_categ;
    }

    public String getNom_categ() {
        return nom_categ;
    }

    public void setNom_categ(String nom_categ) {
        this.nom_categ = nom_categ;
    }

    public String getDescrip_categ() {
        return descrip_categ;
    }

    public void setDescrip_categ(String descrip_categ) {
        this.descrip_categ = descrip_categ;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }
}
