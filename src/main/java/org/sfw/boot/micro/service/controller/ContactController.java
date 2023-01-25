package org.sfw.boot.micro.service.controller;

import java.util.List;

import org.sfw.boot.micro.service.entity.Contact;
import org.sfw.boot.micro.service.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactService contactService;

	@GetMapping("/user/{userID}")
	public List<Contact> getContacts(@PathVariable("userID") Long id) {
		System.out.println("ContactController");
		return contactService.getContact(id);
	}

}
