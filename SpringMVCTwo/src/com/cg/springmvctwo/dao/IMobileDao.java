package com.cg.springmvctwo.dao;

import java.util.List;

import com.cg.springmvctwo.dto.Mobile;

public interface IMobileDao {
	
	public void addMobile(Mobile mobile);
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);
	public void updateMobile(int mobId, double price);
	

}
