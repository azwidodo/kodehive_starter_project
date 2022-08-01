package com.kodehive.kodehive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data // automatic getter setter with Lombok
@Entity
@Table(name = "T_MAHASISWA") // menentukan nama tabel
public class MahasiswaModel {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "SPP")
	private int spp;
	
	@Column(name = "ALAMAT")
	private String alamat;


	

}
