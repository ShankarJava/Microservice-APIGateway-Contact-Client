package org.sfw.boot.micro.service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.sfw.boot.micro.service.entity.Contact;
import org.springframework.stereotype.Service;
@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list=List.of(
			new Contact(1L,"Shankr@gmail.com","Shankar",123L),
			new Contact(2L,"Divya@gmail.com","Divya",124L)
			);
	
	public List<Contact> getContact(Long userID) {
		return list.stream().filter(contact->contact.getUserID().equals(userID)).collect(Collectors.toList());
	}
}
