package com.rahul.Medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Medical.entity.Admin;
import com.rahul.Medical.entity.Appointment;
import com.rahul.Medical.repository.AppointmentRepository;

@Service
public class AppointmentServiceImplementation  {

	private AppointmentRepository appointmentRepository;

	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AppointmentServiceImplementation( AppointmentRepository obj)
	{
		appointmentRepository=obj;
	}
	
	
	public void save(Appointment app)
	{
		
		appointmentRepository.save(app);
	}
	
	
	public List<Appointment> findAll() {
		return appointmentRepository.findAll();
	}


	
}
