package com.capg.spring.dao;

import java.util.List;

import com.capg.spring.dto.Gear;

public interface IGearDao {

	
	public void addList(Gear e);
	public List<Gear> showGear();
	public void deleteGear(int id);
	public Gear searchGear(int id);
	public void updateGear(Gear e);
}
