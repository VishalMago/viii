package com.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel implements Serializable {

	public Hotel() {
		super();
	}

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelid;
	private String hotelname;
	private String address;
	private int hotelrating;
	private String phoneno;
	private String hotelimage;
	private int price;

	public Hotel(int hotelid, String hotelname, String address, int hotelrating, String phoneno, String hotelimage,
			int price) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		this.address = address;
		this.hotelrating = hotelrating;
		this.phoneno = phoneno;
		this.hotelimage = hotelimage;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getHotelrating() {
		return hotelrating;
	}

	public void setHotelrating(int hotelrating) {
		this.hotelrating = hotelrating;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getHotelimage() {
		return hotelimage;
	}

	public void setHotelimage(String hotelimage) {
		this.hotelimage = hotelimage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
