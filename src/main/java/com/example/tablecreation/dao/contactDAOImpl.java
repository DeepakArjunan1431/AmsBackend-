package com.example.tablecreation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.tablecreation.entity.contact;
import com.example.tablecreation.mapper.contactModelMapper;
import com.example.tablecreation.model.ResponseModel;
import com.example.tablecreation.model.contactModelWithId;
import com.example.tablecreation.repository.contactrepository;


@Repository	
public class contactDAOImpl implements contactDAO{
	@Autowired
	contactrepository contactRepo;
	
	@Autowired
	contactModelMapper conmap;
	
	@Override
	public List<contact> getAllDetails(){
		return contactRepo.findAll();
	}
	@Override
	public Optional<contact> getAllDetailsbyId(Long id){
		return contactRepo.findById(id);
	}
	
	@Override
	public ResponseModel saveDetails(contact Contact) {
		ResponseModel responsemodel;
		if(contactRepo.save(Contact)!=null) {
			responsemodel= new ResponseModel(true, "Created the Details Successfully");
		}
		else {
			responsemodel= new ResponseModel(false, "creation Unsuccessful");
		}
		return responsemodel;
	}
	
	@Override
	public ResponseModel createDetails(contact Contact) {
		ResponseModel responsemodel;
		if(contactRepo.save(Contact)!=null) {
			responsemodel = new ResponseModel(true, "Created The Details Successfully");
		} else {
			responsemodel = new ResponseModel(false, "creation Unsuccessful");
		}
		return responsemodel;
	}
	
	@Override
	public ResponseModel updateDetails(contactModelWithId conmodwithid) {
		ResponseModel responsemodel;
		contact Contact = contactRepo.getReferenceById(conmodwithid.getId());
		Contact.setNum(conmodwithid.getNum());
		Contact.setMailId(conmodwithid.getMailId());
		Contact.setMessage(conmodwithid.getMessage());
		Contact.setAddress(conmodwithid.getAddress());
		Contact.setEndSubcription(conmodwithid.getEndSubcription());
		Contact.setCity(conmodwithid.getCity());
		Contact.setDateOfJoining(conmodwithid.getDateOfJoining());
		Contact.setActiveStatus(conmodwithid.getActiveStatus());
		System.out.println(conmodwithid.toString());
		if (contactRepo.save(Contact)!=null) {
			responsemodel = new ResponseModel(true, "Updated SuccessFully");
		}else {
			responsemodel = new ResponseModel(false, "Updation Unsuccessful");
		}
		return responsemodel;
	}
	
	@Override 
	public ResponseModel deleteDetails(Long id) {
		try {
			contact Contact = contactRepo.getReferenceById(id);
			Contact.setIsDeleted(true);
			contactRepo.save(Contact);
			return new ResponseModel(true, "This Id"+Contact.getId()+"is Deleted Successfully");
		} catch(Exception e) {
			return new ResponseModel(false, "Error While Deleting");
		}
	}
	
	
	
	
	
	
	
	
	
}