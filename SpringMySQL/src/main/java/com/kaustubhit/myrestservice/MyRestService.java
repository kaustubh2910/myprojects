package com.kaustubhit.myrestservice;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaustubhit.bo.AppUsers;
import com.kaustubhit.bo.AppUsersRepo;

@RestController
public class MyRestService {
	@Autowired
	AppUsersRepo appRepo;
	ObjectMapper mapper = new ObjectMapper();

	@GET
	@RequestMapping("/service")
	@Produces(MediaType.APPLICATION_JSON)
	public String getProducts() throws Exception{
		System.out.println("inside my rest service.....");
		List<AppUsers> productData = (List<AppUsers>) appRepo.findAll();
		String jsonInString = mapper.writeValueAsString(productData);
		System.out.println("appRepo.findAll() >>>> "+jsonInString);
		return jsonInString;		
	}
	@GET
	@RequestMapping("/service1")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getProducts(@RequestParam int pm_id) throws Exception{
		System.out.println("pm_id "+pm_id);
		System.out.println("inside my rest service.....");
		AppUsers productData = appRepo.findOne(pm_id);
		String jsonInString = mapper.writeValueAsString(productData);
		System.out.println("appRepo.findAll() >>>> "+jsonInString);
		return jsonInString;		
	}
		
}
