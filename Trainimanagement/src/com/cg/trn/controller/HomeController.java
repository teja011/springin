package com.cg.trn.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.trn.bean.Trainee;
import com.cg.trn.service.ITraineeService;
@Controller
public class HomeController {
	@Autowired
	ITraineeService isr;
	
	
	
	public ITraineeService getIsr() {
		return isr;
	}

	public void setIsr(ITraineeService isr) {
		this.isr = isr;
	}

	@RequestMapping("loginaction")
	public String validateUser(Model model,@RequestParam("username") String username,
			@RequestParam("password") String password)
{	
		if(username.equals("tejas") && password.equals("tejas"))
		{
		model.addAttribute("successMsg",
				"Welcome to Home Page");
		model.addAttribute("username", username);
		//System.out.println("in display date method. ..");
		LocalDate date = LocalDate.now();
		model.addAttribute("successMsg",date);
		
		return "option";
		}
		else
		{
			model.addAttribute
			("errorMsg", "Invalid Username/Password");
			return "Error";
		}
	}
	
	@RequestMapping("addtraini")
	public String gettraini(Model model)
	{
		Trainee trainee = new Trainee();
		model.addAttribute("traineeBean", trainee);
		return "register";
	}
	@RequestMapping("registeruser")
	public String  addTrainee(Model model,@ModelAttribute("traineeBean")@Valid Trainee trainee,BindingResult result)
	
			{
		trainee = isr.addTrainee(trainee);
		model.addAttribute("trainee",trainee);
		model.addAttribute("SuccessMsg","Trainee Added");
				return "Success";
		
		
			}
}
