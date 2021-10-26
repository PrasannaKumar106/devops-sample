package com.pk.aws.awsintrg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	

@GetMapping("/getData")	
public List<String> getData() {
	
	List<String> allist = new ArrayList();
	allist.add("A");
	allist.add("B");
	allist.add("C");
	
	return allist;
	
}

@GetMapping("/putData")
public String putData(@RequestParam String data) {
	
	
	return "Data :"+data+" has been posted successfully";
	
}
	
}
