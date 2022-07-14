package com.kodehive.kodehive.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.kodehive.model.MahasiswaModel;
import com.kodehive.kodehive.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {
	
	JdbcTemplate jdbc;
	
	@Override
	public int insert(MahasiswaModel model) {
		var query = "INSERT INTO t_mahasiswa(name, gender, alamat, spp) "
					+ "VALUES (?, ?, ?, ?)";
		
		return jdbc.update(query, new Object[] {model.getName(), model.getGender(), 
				model.getAlamat(), model.getSpp()});
	}

}
