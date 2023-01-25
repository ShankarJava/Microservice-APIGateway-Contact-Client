package org.sfw.boot.micro.service.services;

import java.util.List;

import org.sfw.boot.micro.service.entity.Contact;

public interface ContactService {
	public List<Contact> getContact(Long userID);
}
