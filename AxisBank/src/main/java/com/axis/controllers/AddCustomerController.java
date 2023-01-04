package com.axis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.axis.dao.CustomerDao;
import com.axis.model.Customer;

@Controller
public class AddCustomerController {
	@RequestMapping("/register")
public ModelAndView addCustomer(Customer customer,Model model) {
	ModelAndView mv=new ModelAndView();
	CustomerDao dao=new CustomerDao();
	Customer c= dao.insertIntoDatabase(customer);
	mv.setViewName("home");
	mv.addObject("customer", c);
	return mv;
}
}
