package com.example.tablecreation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tablecreation.dao.contactDAO;
import com.example.tablecreation.entity.contact;
import com.example.tablecreation.mapper.contactModelMapper;
import com.example.tablecreation.model.ResponseModel;
import com.example.tablecreation.model.contactModel;
import com.example.tablecreation.model.contactModelWithId;

@Service
public class contactServiceImpl implements contactService{
	@Autowired
	public contactDAO contactdao;
	
	@Autowired
	public contactModelMapper contactmap;
	
	@Override
	public List<contact> getallDetails(){
		return contactdao.getAllDetails();
	}
	@Override
	public Optional<contact> getallDetailsById(Long id){
		return contactdao.getAllDetailsbyId(id);
	}
	@Override
	public ResponseModel saveAllDetails(contactModel Contactmodel) {
		contact Contact =  contactmap.contactModeltoEntity(Contactmodel);
		return contactdao.saveDetails(Contact);
	}
	@Override
	public ResponseModel CreateDetails(contactModel Contactmodel) {
		contact contact = contactmap.contactModeltoEntity(Contactmodel);
		return contactdao.createDetails(contact);
	}
	@Override
	public ResponseModel updateDetails(contactModelWithId conmodwithid) {
		return contactdao.updateDetails(conmodwithid);
	}
	@Override
	public ResponseModel DeteleDetails(Long id) {
		return contactdao.deleteDetails(id);
	}
}