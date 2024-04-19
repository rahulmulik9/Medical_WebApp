package com.rahul.Medical.service;

import java.util.List;
import com.rahul.Medical.entity.Admin;
import com.rahul.Medical.entity.User;

public interface AdminService {


	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);
	
}
