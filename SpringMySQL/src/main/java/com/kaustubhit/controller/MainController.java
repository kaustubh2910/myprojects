package com.kaustubhit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import com.kaustubhit.bo.AppUsers;
import com.kaustubhit.bo.AppUsersRepo;


@RestController
public class MainController {
	@Autowired
	AppUsersRepo appRepo;	
	@Autowired
	ApplicationContext context;
	
	@RequestMapping("/")
	public ModelAndView doHome() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("lists",appRepo.findAll());
			return mv;
	}	
					
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView doSave(@RequestParam("pm_id") String pm_id,@RequestParam("pm_name") String pm_name,@RequestParam("pm_price") String pm_price) {
		ModelAndView mv = new ModelAndView("redirect:/");
		AppUsers users;
		if(!pm_id.isEmpty()) {
			System.out.println("updating..... "+pm_id);
			users = (AppUsers)appRepo.findOne(Integer.parseInt(pm_id));
		} else {
			System.out.println("saving.....");
			users = new AppUsers();
		}
		users.setPm_name(pm_name);
		users.setPm_price(pm_price);
		appRepo.save(users);		
		return mv;
	}	
	@RequestMapping(value="/delete/{pm_id}",method=RequestMethod.GET)
	public ModelAndView doDelete(@PathVariable("pm_id") int pm_id) {
		ModelAndView mv = new ModelAndView("redirect:/");
		appRepo.delete(pm_id);	
		return mv;
	}	
	@RequestMapping(value="/view/{pm_id}",method=RequestMethod.GET)
	public ModelAndView doView(@PathVariable("pm_id") int pm_id) {
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("lists",appRepo.findOne(pm_id));
		return mv;
	}
	@RequestMapping(value="/edit/{pm_id}",method=RequestMethod.GET)
	public ModelAndView doEdit(@PathVariable("pm_id") int pm_id) {
		ModelAndView mv = new ModelAndView("edit");
		mv.addObject("lists",appRepo.findOne(pm_id));
		return mv;
	}
}
