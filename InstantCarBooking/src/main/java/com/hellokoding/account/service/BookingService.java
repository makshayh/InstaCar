package com.hellokoding.account.service;

import java.util.List;

import com.hellokoding.account.model.Booking;


public interface BookingService {

	List<Booking> getBooking();

	void save(Booking submitconfirmation);

}
