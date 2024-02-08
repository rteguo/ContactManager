package com.contact.manager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contact.manager.model.Address;
import com.contact.manager.model.Contact;
import com.contact.manager.model.ContactRepository;

@Controller
public class ContactController {
	@Autowired
	ContactRepository contrep;
	
	@RequestMapping("/displaycontact")
	public ModelAndView displayData(@ModelAttribute("contobj") Contact listcont)
	{
		System.out.println("nb contact = " + contrep.findAll().size());
		System.out.println(" Contact :" + contrep.findAll().get(0).getAddresscontact().getBlock());
		return new ModelAndView ("ContactDisplay", "data", contrep.findAll().get(0));
	}
	@RequestMapping("/addcontact")
	public ModelAndView getFormContact()
	{
		return new ModelAndView("ContactForm", "contobj", new Contact());
	}
	@RequestMapping("/addcontactprocess")
	public ModelAndView getData(@ModelAttribute("contobj") Contact e)
	{
		contrep.save(e);
		System.out.println("Save contact :" + e.getFirstname());
		return new ModelAndView ("ContactDisplay", "data", contrep.findAll().get(0));
	}
	
	@GetMapping("/deleteacontact/{id}")
	public ModelAndView deleteData(@PathVariable int id)
	{
		Contact conttodel = null;
		System.out.println("Contact id = "+id);
		Optional<Contact> cont = contrep.findById(id);
		if(cont.isPresent())
		{
			conttodel = cont.get();
			contrep.delete(conttodel);
			System.out.println("Successful delete address id = "+id);
		}
		return new ModelAndView("AddressDisplay", "data", contrep.findAll().get(0) ); 
	}
	@GetMapping("/updatecontact/{id}")
	public ModelAndView editData(@PathVariable int id)
	{
		
		return new ModelAndView("ContactEdit", "data", contrep.findById(id).get() );
	}
	@RequestMapping("/updatecontact/editcontactprocess")
	public ModelAndView updateData(@ModelAttribute("data") Contact c)
	{
		System.out.println("Update Contact " + c.getFirstname());
		contrep.save(c);
		return new ModelAndView("ContactDisplay", "data", contrep.findAll().get(0) );
	}
	

}
