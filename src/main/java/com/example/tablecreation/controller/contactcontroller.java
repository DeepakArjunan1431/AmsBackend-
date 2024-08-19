package com.example.tablecreation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tablecreation.entity.contact;
import com.example.tablecreation.model.ResponseModel;
import com.example.tablecreation.model.contactModel;
import com.example.tablecreation.model.contactModelWithId;
import com.example.tablecreation.service.contactService;




@RestController
@RequestMapping("/api-v1/contacts")
public class contactcontroller {
	
	@Autowired
	contactService conserv;
	
	@GetMapping("/get-testing")
	public String getContactDetails() {
		return "it is running";
	}
	
	@PostMapping("/post-tesing")
	public String postMethodName(@RequestBody String entity) {
		return entity+"This Method is Working";
	}
	
	@PutMapping("/put-testing/{id}")
	public String putMethodName(@PathVariable String id, @RequestBody String entity) {
		return entity+"This Method is Working";
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteMethodeName(@PathVariable String id) {
		
			if(id!=null) {
				return true;
			} else {
				return false;
			}
		
	}
	@GetMapping("/getcontacts")
	public List<contact> getcontacts() {
		return conserv.getallDetails();
	}
	@GetMapping("/getcontactsbyid/{id}")
	public Optional<contact> getDetailsById(@PathVariable long id){
		return conserv.getallDetailsById(id);
	}
	@PostMapping("/createcontacts")
	public ResponseModel createDetails(@RequestBody contactModel contactmodel) {
		try {
			return conserv.CreateDetails(contactmodel);
		} catch(Exception e) {
			ResponseModel responsemodel = new ResponseModel(true, e.getMessage());
			return responsemodel;
		}
	}
	@PostMapping("/updatecontacts")
	public ResponseModel updateDetails(@RequestBody contactModelWithId conmodwithid) {
		try {
			return conserv.updateDetails(conmodwithid);
		} catch(Exception e) {
			ResponseModel responseModel = new ResponseModel(false, e.getMessage());
			return responseModel;
		}
	}
	@GetMapping("/getAll/skip/{skip}/take/{take}")
	public List<contact> getallcontacts(
			@PathVariable int skip, @PathVariable int take){
		if (skip!=0) {
			skip /= take;
		}
		Pageable paging = PageRequest.of(skip, take);
		return conserv.getallDetails();
	}
	@DeleteMapping("/deleteContacts/{id}")
	public ResponseModel deleteDetails(@PathVariable long id) {
		return conserv.DeteleDetails(id);
	}
	
}
