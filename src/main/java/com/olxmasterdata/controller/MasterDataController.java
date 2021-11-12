package com.olxmasterdata.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olxmasterdata.dto.MasterData;
import com.olxmasterdata.dto.Status;

@RestController
public class MasterDataController {

	@PostMapping("/hi")
	public ResponseEntity<?> sayHi(){
		return new ResponseEntity<>("HI! Welcome to Springboot Microservices", HttpStatus.OK);
	}
	
	@GetMapping("/advertise/category")
	public ResponseEntity<?> category(){
		MasterData masterData1 = new MasterData();
		masterData1.setId(1);
		masterData1.setCategory("Furniture");
		masterData1.setStatus("Open");
		
		MasterData masterData2 = new MasterData();
		masterData2.setId(2);
		masterData2.setCategory("Cars");
		masterData2.setStatus("Closed");
		
		MasterData masterData3 = new MasterData();
		masterData3.setId(3);
		masterData3.setCategory("Mobiles");
		masterData3.setStatus("Open");
		
		MasterData masterData4 = new MasterData();
		masterData4.setId(4);
		masterData4.setCategory("Real Estate");
		masterData4.setStatus("Closed");
		
		List<MasterData> arrList = new ArrayList<>();
		arrList.add(masterData1);
		arrList.add(masterData2);
		arrList.add(masterData3);
		arrList.add(masterData4);
		
 		return new ResponseEntity<>(arrList, HttpStatus.OK);
	}
	
	@GetMapping("/advertise/status")
	public ResponseEntity<?> status(){
		Status status1 = new Status();
		status1.setId(1);
		status1.setStatus("Open");
		
		Status status2 = new Status();
		status2.setId(2);
		status2.setStatus("Closed");
		
		List<Status> arrList = new ArrayList<>();
		arrList.add(status1);
		arrList.add(status2);
		return new ResponseEntity<>(arrList, HttpStatus.OK);
	}

}
