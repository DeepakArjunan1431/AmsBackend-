package com.example.tablecreation.mapper;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.tablecreation.entity.contact;
import com.example.tablecreation.model.contactModel;
@Service
public class contactModelMapper {
	
	public contact contactModeltoEntity(contactModel cm) {
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		contact c = new contact(null,
				cm.getName(),
				cm.getNum(),
				cm.getMailId(),
				cm.getMessage(),
				cm.getAddress(),
				cm.getTerm(),
				cm.getCity(),
				cm.getDob(),
				cm.getEndSubcription(),
				cm.getDateOfJoining(),
				t,
				t,
				false,
				null);
		return c;
		
	}
}
