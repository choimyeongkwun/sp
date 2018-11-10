package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.Service.awsService;
import com.bdi.sp.vo.AWSTEST;

@Controller
public class awsController {

	@Autowired
	private awsService as;
	
	@GetMapping(value="/awss")
	public @ResponseBody List<AWSTEST> selectAWSList(){
		return as.selectAWSList();
	}
	@GetMapping(value="/awss/{atnum}")
	public @ResponseBody AWSTEST selectAWS(@PathVariable int atnum){
		return as.selectAWS(atnum);
	}
	
}
