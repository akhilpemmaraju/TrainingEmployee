package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.*;
import com.example.demo.repo.EmployeeDAL;
import com.example.demo.repo.EmployeeDALImp;
import com.example.demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class EmployeeController {
	
	private final FileService fileService;
	
	@Autowired
	private EmployeeDAL emprepo;

	 
	@Autowired
	public EmployeeController(FileService fileService) {
		this.fileService = fileService;
	}
	
	@PostMapping("/employees")
	public void create(@RequestBody Employee emp) {
		emprepo.save(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return emprepo.findAll();
		
	}
 
	@PostMapping(value = "/api/files")
	@ResponseStatus(HttpStatus.OK)
	public void handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		fileService.storeFile(file);
	}
 

	
}
