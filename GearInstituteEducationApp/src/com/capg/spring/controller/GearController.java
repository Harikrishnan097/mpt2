package com.capg.spring.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capg.spring.dto.Gear;
import com.capg.spring.service.IGearService;

@Controller
public class GearController {

	
	@Autowired
	IGearService gearService;
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllGear() {
		
		List<Gear> list=gearService.showGear();
		return new ModelAndView("show","emps",list);
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String myGear(@ModelAttribute("gear") Gear g,Map<String,Object> model) {
		model.put("gear", g);
		return "add_gear";
	}
	
	@RequestMapping(value="/addgear",method=RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("emp") Gear g,BindingResult result,Map<String,Object> model)
	{
		
		
		
		gearService.addList(g);
			return "add_gear";
		    
	
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@ModelAttribute("emp") Gear g) {
		return "delete";
	}
	
	@RequestMapping(value="/delete1",method=RequestMethod.POST)
	public String deleteEmployee(@ModelAttribute("emp") Gear g)
	{
		int id=g.getQuery_id();
		gearService.deleteGear(id);
		return "redirect:/showall";
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updateEmployee(@ModelAttribute("emp") Gear g)
	{
		return "update";
	}
	@RequestMapping(value="/update1",method=RequestMethod.GET)
	public ModelAndView updateDetails(@ModelAttribute("emp") Gear g)
	{
		
		Gear gear= gearService.searchGear(g.getQuery_id());
		return new ModelAndView("update2","empu",gear);
		
	}
	
	@RequestMapping(value="/updateemployee",method=RequestMethod.POST)
	public String update(@ModelAttribute("emp") Gear g)
	{
		gearService.updateGear(g);
		return "redirect:/showall";
		
	}
	
	
}
