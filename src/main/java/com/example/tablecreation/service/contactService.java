package com.example.tablecreation.service;

import java.util.List;
import java.util.Optional;

import com.example.tablecreation.entity.contact;
import com.example.tablecreation.model.ResponseModel;
import com.example.tablecreation.model.contactModel;
import com.example.tablecreation.model.contactModelWithId;

public interface contactService {

	List<contact> getallDetails();

	Optional<contact> getallDetailsById(Long id);

	ResponseModel saveAllDetails(contactModel Contactmodel);

	ResponseModel CreateDetails(contactModel Contactmodel);

	ResponseModel updateDetails(contactModelWithId conmodwithid);

	ResponseModel DeteleDetails(Long id);

	
}
