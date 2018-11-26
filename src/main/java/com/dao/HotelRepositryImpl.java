package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Hotel;

@Transactional
@Repository
public class HotelRepositryImpl implements HotelRepositry {
	@Autowired(required=true)
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> listHotels() {
		List<Hotel> hotelList = sessionFactory.getCurrentSession().createQuery("from Hotel").list();
		return hotelList;
	}
	
}
