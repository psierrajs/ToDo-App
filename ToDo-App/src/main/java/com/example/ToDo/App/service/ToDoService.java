package com.example.ToDo.App.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDo.App.ToDo;
import com.example.ToDo.App.repo.IToDoRepo;

@Service
public class ToDoService {
	
	@Autowired
	IToDoRepo repo;
	public List<ToDo> getAllToDoItems(){
		ArrayList<ToDo> todoList = new ArrayList<>();
		repo.findAll().forEach(todo -> todoList.add(todo));
		
		return todoList;
	}
	
	public ToDo getToDoItemById(Long id){
		return repo.findById(id).get();
		
	}
	
	boolean updateStatus(){
		
		
	}
	
	boolean saveOrUpdateToDoItem(){
		
	}
	
	boolean deleteToDoItem(){
		
	}

}