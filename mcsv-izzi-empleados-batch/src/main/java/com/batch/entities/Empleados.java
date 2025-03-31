package com.batch.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "employees")
public class Empleados {

    @Id
    private Long idSSFF;

    @Column(name="desc_motvo")
    private String descMotvo;

    @Column(name="id_submotivo")
    private String idSubmotivo;

    @Column(name="desc_subMotvo")
    private String descSubMotvo;

    private String nombre;

    @Column(name="a_paterno")
    private String aPaterno;

    @Column(name="a_materno")
    private String aMaterno;

    @Column(name="fecha_nac")
    private String fechaNac;

    private String genero;

    @Column(name="curp_nac")
    private String curpNac;

    @Column(name="id_razon_social")
    private int idRazonSocial;

    @Column(name="razon_social")
    private String razonSocial;

    @Column(name="num_empl_Lab")
    private int numEmplLab;

    @Column(name="id_cod_puesto")
    private int idCodPuesto;

    @Column(name="codigo_puesto")
    private String codPuesto;

    @Column(name="cia_outsourcing")
    private String ciaOutsourcing;

    private String estatus;

    @Column(name="fec_ingreso")
    private String fecIngreso;

    @Column(name="id_plaza")
    private String idPlaza;

    @Column(name="desc_plaza")
    private String descPlaza;

    @Column(name="sub_nvl_funcional")
    private String subNvlFuncional;

    @Column(name="cve_region")
    private int cveRegion;

    private String region;

    @Column(name="id_depto")
    private int idDepto;

    @Column(name="id_cto_tbjo")
    private int idCtoTbjo;

    @Column(name="cto_trabajo")
    private String ctoTrabajo;

    @Column(name="tpo_empleo")
    private String tpoEmpleo;

    @Column(name="nvl_funcional")
    private String nvlFuncional;

    @Column(name="clase_empleado")
    private String claseEmpleado;

    @Column(name="id_ssff_ji")
    private int idSsffJI;

    @Column(name="nom_empl_ji")
    private String nomEmplJI;

    @Column(name="email_ji")
    private String emailJI;

    @Column(name = "insertion_date")
    private String insertionDate;

}
