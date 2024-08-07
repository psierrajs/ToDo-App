package com.example.ToDo.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ToDo.App.service.ToDoService;




@Controller
public class ToDoController {
	
	@Autowired
	private ToDoService service;

	@GetMapping({"/","viewToDoList"})
	public String viewAllToDoItems(Model model, @ModelAttribute("message") String message) {
		model.addAttribute("list", service.getAllToDoItems());
		model.addAttribute("msg", message);
		
		return "ViewToDoList";
	}
	
	@PostMapping("/updateToDoStatus/{id}")
	public String updateToDoStatus(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		if(service.updateStatus(id)) {
			redirectAttributes.addFlashAttribute("message", "Update Successful");
			return "redirect:/viewToDoList";
		}
		redirectAttributes.addFlashAttribute("message", "Update Failed");
		return "redirect:/viewToDoList";
		
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
