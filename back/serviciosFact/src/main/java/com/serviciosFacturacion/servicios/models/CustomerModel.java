package com.serviciosFacturacion.servicios.models;


import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(columnDefinition = "bigint default 0")
    private Long id_cliente ;


    @Column
    private int id_tip_dni;

    @Column
    private String num_ident;
    @Column
    private String nomb_cli;
    @Column
    private String apell_cli;
    @Column
    private String email_cli;
    @Column
    private String direc_cli;
    @Column
    private String telef_cli;

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String getNum_ident() {
        return num_ident;
    }

    public void setNum_ident(String num_ident) {
        this.num_ident = num_ident;
    }

    public String getNomb_cli() {
        return nomb_cli;
    }

    public void setNomb_cli(String nomb_cli) {
        this.nomb_cli = nomb_cli;
    }

    public String getApell_cli() {
        return apell_cli;
    }

    public void setApell_cli(String apell_cli) {
        this.apell_cli = apell_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public String getDirec_cli() {
        return direc_cli;
    }

    public void setDirec_cli(String direc_cli) {
        this.direc_cli = direc_cli;
    }

    public String getTelef_cli() {
        return telef_cli;
    }

    public void setTelef_cli(String telef_cli) {
        this.telef_cli = telef_cli;
    }

    public int getId_tip_dni() {
        return id_tip_dni;
    }

    public void setId_tip_dni(int id_tip_dni) {this.id_tip_dni = id_tip_dni;}
}
