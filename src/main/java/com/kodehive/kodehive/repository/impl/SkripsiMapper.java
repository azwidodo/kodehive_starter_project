package com.kodehive.kodehive.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kodehive.kodehive.model.SkripsiModel;

public class SkripsiMapper implements RowMapper<SkripsiModel> {
	

	@Override
	public SkripsiModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		SkripsiModel skripsi = new SkripsiModel();
		
		skripsi.setId(rs.getInt("id"));
		skripsi.setJudul(rs.getString("judul"));
		skripsi.setNilai(rs.getInt("nilai"));
		skripsi.setTahun(rs.getInt("tahun"));
		
		return skripsi;
	}
	
	

}
