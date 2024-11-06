package com.braggbnb116.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbnb116.domain.Booking;
import com.braggbnb116.dto.BookingDTO;
import com.braggbnb116.dto.BookingSearchDTO;
import com.braggbnb116.dto.BookingPageDTO;
import com.braggbnb116.dto.BookingConvertCriteriaDTO;
import com.braggbnb116.service.GenericService;
import com.braggbnb116.dto.common.RequestDTO;
import com.braggbnb116.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface BookingService extends GenericService<Booking, Integer> {

	List<Booking> findAll();

	ResultDTO addBooking(BookingDTO bookingDTO, RequestDTO requestDTO);

	ResultDTO updateBooking(BookingDTO bookingDTO, RequestDTO requestDTO);

    Page<Booking> getAllBookings(Pageable pageable);

    Page<Booking> getAllBookings(Specification<Booking> spec, Pageable pageable);

	ResponseEntity<BookingPageDTO> getBookings(BookingSearchDTO bookingSearchDTO);
	
	List<BookingDTO> convertBookingsToBookingDTOs(List<Booking> bookings, BookingConvertCriteriaDTO convertCriteria);

	BookingDTO getBookingDTOById(Integer bookingId);







}




