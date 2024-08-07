package com.example.ToDo.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ToDo.App.service.ToDoService;




@Controller
public class ToDoController {
	
	@Autowired
	private ToDoService service;

	@GetMapping({"/","viewToDoList"})
	public String viewAllToDoItems(Model model) {
		model.addAttribute("list", service.getAllToDoItems());
		
		return "ViewToDoList";
	}
	
	@PostMapping
	public String updateToDoStatus() {
		
	}

	@GetMapping
	public String addToDoItem() {
		
	}
	
	@PostMapping
	public String saveToDoItem() {
		
	}
	
	@GetMapping
	public String editToDoItem() {
		
	}
	
	@PostMapping
	public editSaveToDoItem() {
		
	}
	
	@GetMapping
	public deleteToDoItem() {
		
	}
}
