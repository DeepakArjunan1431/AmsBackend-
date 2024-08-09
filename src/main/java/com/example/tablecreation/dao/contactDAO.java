package com.example.tablecreation.dao;

import java.util.List;
import java.util.Optional;

import com.example.tablecreation.entity.contact;
import com.example.tablecreation.model.ResponseModel;
import com.example.tablecreation.model.contactModelWithId;

public interface contactDAO {

	List<contact> getAllDetails();


	Optional<contact> getAllDetailsbyId(Long id);


	ResponseModel saveDetails(contact Contact);


	ResponseModel createDetails(contact Contact);


	ResponseModel updateDetails(contactModelWithId conmodwithid);


	ResponseModel deleteDetails(Long id);

}