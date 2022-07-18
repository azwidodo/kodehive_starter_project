package com.kodehive.kodehive.quiz2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "q2_judul_skripsi")
public class Q2JudulSkripsiModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String judul;
	private int tahun;
	private int nilai;
	private int mahasiswa_id;
	private int kategori_id;
}
