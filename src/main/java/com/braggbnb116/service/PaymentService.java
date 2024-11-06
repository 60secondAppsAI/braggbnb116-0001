package com.braggbnb116.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbnb116.domain.Payment;
import com.braggbnb116.dto.PaymentDTO;
import com.braggbnb116.dto.PaymentSearchDTO;
import com.braggbnb116.dto.PaymentPageDTO;
import com.braggbnb116.dto.PaymentConvertCriteriaDTO;
import com.braggbnb116.service.GenericService;
import com.braggbnb116.dto.common.RequestDTO;
import com.braggbnb116.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PaymentService extends GenericService<Payment, Integer> {

	List<Payment> findAll();

	ResultDTO addPayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

	ResultDTO updatePayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

    Page<Payment> getAllPayments(Pageable pageable);

    Page<Payment> getAllPayments(Specification<Payment> spec, Pageable pageable);

	ResponseEntity<PaymentPageDTO> getPayments(PaymentSearchDTO paymentSearchDTO);
	
	List<PaymentDTO> convertPaymentsToPaymentDTOs(List<Payment> payments, PaymentConvertCriteriaDTO convertCriteria);

	PaymentDTO getPaymentDTOById(Integer paymentId);







}





