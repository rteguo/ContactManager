package com.contact.manager.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contact.manager.model.Address;
import com.contact.manager.model.AddressRepository;

@Controller
public class AddressController {

	@Autowired
	AddressRepository addrep;
	@RequestMapping("/displayaddress")
	public ModelAndView displayData()
	{
		System.out.println("Diplay all address, size = " + addrep.findAll().size());
		return new ModelAndView("AddressDisplay", "data", addrep.findAll().get(0) );
	}
	
	@RequestMapping("/addaddress")
	public ModelAndView addData() 
	{
		return new ModelAndView("AddressForm", "addressobj", new Address());
	}
	@RequestMapping("/addaddressprocess")
	public ModelAndView saveData(@ModelAttribute("addressobj") Address a)
	{
		addrep.save(a);
		return new ModelAndView("AddressDisplay", "data", addrep.findAll().get(0) );
	}
	@GetMapping("/deleteaddress/{id}")
	public ModelAndView deleteData(@PathVariable int id)
	{
		Address addtodel = null;
		System.out.println("Address id = "+id);
		Optional<Address> add = addrep.findById(id);
		if(add.isPresent())
		{
			addtodel = add.get();
			addrep.delete(addtodel);
			System.out.println("Successful delete address id = "+id);
		}
		return new ModelAndView("AddressDisplay", "data", addrep.findAll().get(0) ); 
	}
	@GetMapping("/updateaddress/{id}")
	public ModelAndView editData(@PathVariable int id)
	{
		
		return new ModelAndView("AddressEdit", "data", addrep.findById(id).get() );
	}
	@RequestMapping("/updateaddress/editaddressprocess")
	public ModelAndView updateData(@ModelAttribute("data") Address a)
	{
		System.out.println("Update address " + a.getArea());
		addrep.save(a);
		return new ModelAndView("AddressDisplay", "data", addrep.findAll().get(0) );
	}
	
}
