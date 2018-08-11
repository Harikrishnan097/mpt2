package com.capg.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.spring.dao.IGearDao;
import com.capg.spring.dto.Gear;

public class GearService implements IGearService{

	
	@Autowired
	IGearDao geardao;
	@Override
	public void addList(Gear e) {
		// TODO Auto-generated method stub
		geardao.addList(e);
	}

	@Override
	public List<Gear> showGear() {
		return geardao.showGear();
	}

	@Override
	public void deleteGear(int id) {
		// TODO Auto-generated method stub
		geardao.deleteGear(id);
	}

	@Override
	public Gear searchGear(int id) {
		return geardao.searchGear(id);
	}

	@Override
	public void updateGear(Gear e) {
		// TODO Auto-generated method stub
		geardao.updateGear(e);
	}

}
