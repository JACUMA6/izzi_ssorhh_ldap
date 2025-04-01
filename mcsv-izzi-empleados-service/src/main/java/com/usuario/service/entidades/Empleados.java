package com.usuario.service.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Empleados {

	@Id
	private int idSSFF;

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

	public Empleados() {
	}

	public int getIdSSFF() {
		return idSSFF;
	}

	public void setIdSSFF(int idSSFF) {
		this.idSSFF = idSSFF;
	}

	public String getDescMotvo() {
		return descMotvo;
	}

	public void setDescMotvo(String descMotvo) {
		this.descMotvo = descMotvo;
	}

	public String getIdSubmotivo() {
		return idSubmotivo;
	}

	public void setIdSubmotivo(String idSubmotivo) {
		this.idSubmotivo = idSubmotivo;
	}

	public String getDescSubMotvo() {
		return descSubMotvo;
	}

	public void setDescSubMotvo(String descSubMotvo) {
		this.descSubMotvo = descSubMotvo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getaPaterno() {
		return aPaterno;
	}

	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getaMaterno() {
		return aMaterno;
	}

	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCurpNac() {
		return curpNac;
	}

	public void setCurpNac(String curpNac) {
		this.curpNac = curpNac;
	}

	public int getIdRazonSocial() {
		return idRazonSocial;
	}

	public void setIdRazonSocial(int idRazonSocial) {
		this.idRazonSocial = idRazonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getNumEmplLab() {
		return numEmplLab;
	}

	public void setNumEmplLab(int numEmplLab) {
		this.numEmplLab = numEmplLab;
	}

	public int getIdCodPuesto() {
		return idCodPuesto;
	}

	public void setIdCodPuesto(int idCodPuesto) {
		this.idCodPuesto = idCodPuesto;
	}

	public String getCodPuesto() {
		return codPuesto;
	}

	public void setCodPuesto(String codPuesto) {
		this.codPuesto = codPuesto;
	}

	public String getCiaOutsourcing() {
		return ciaOutsourcing;
	}

	public void setCiaOutsourcing(String ciaOutsourcing) {
		this.ciaOutsourcing = ciaOutsourcing;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getFecIngreso() {
		return fecIngreso;
	}

	public void setFecIngreso(String fecIngreso) {
		this.fecIngreso = fecIngreso;
	}

	public String getIdPlaza() {
		return idPlaza;
	}

	public void setIdPlaza(String idPlaza) {
		this.idPlaza = idPlaza;
	}

	public String getDescPlaza() {
		return descPlaza;
	}

	public void setDescPlaza(String descPlaza) {
		this.descPlaza = descPlaza;
	}

	public String getSubNvlFuncional() {
		return subNvlFuncional;
	}

	public void setSubNvlFuncional(String subNvlFuncional) {
		this.subNvlFuncional = subNvlFuncional;
	}

	public int getCveRegion() {
		return cveRegion;
	}

	public void setCveRegion(int cveRegion) {
		this.cveRegion = cveRegion;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getIdDepto() {
		return idDepto;
	}

	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}

	public int getIdCtoTbjo() {
		return idCtoTbjo;
	}

	public void setIdCtoTbjo(int idCtoTbjo) {
		this.idCtoTbjo = idCtoTbjo;
	}

	public String getCtoTrabajo() {
		return ctoTrabajo;
	}

	public void setCtoTrabajo(String ctoTrabajo) {
		this.ctoTrabajo = ctoTrabajo;
	}

	public String getTpoEmpleo() {
		return tpoEmpleo;
	}

	public void setTpoEmpleo(String tpoEmpleo) {
		this.tpoEmpleo = tpoEmpleo;
	}

	public String getNvlFuncional() {
		return nvlFuncional;
	}

	public void setNvlFuncional(String nvlFuncional) {
		this.nvlFuncional = nvlFuncional;
	}

	public String getClaseEmpleado() {
		return claseEmpleado;
	}

	public void setClaseEmpleado(String claseEmpleado) {
		this.claseEmpleado = claseEmpleado;
	}

	public int getIdSsffJI() {
		return idSsffJI;
	}

	public void setIdSsffJI(int idSsffJI) {
		this.idSsffJI = idSsffJI;
	}

	public String getNomEmplJI() {
		return nomEmplJI;
	}

	public void setNomEmplJI(String nomEmplJI) {
		this.nomEmplJI = nomEmplJI;
	}

	public String getEmailJI() {
		return emailJI;
	}

	public void setEmailJI(String emailJI) {
		this.emailJI = emailJI;
	}

	public String getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(String insertionDate) {
		this.insertionDate = insertionDate;
	}
}
