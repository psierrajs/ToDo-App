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
	
	boolean updateStatus(Long id){
		ToDo todo = getToDoItemById(id);
		todo.setStatus("Completed");
		
		return saveOrUpdateToDoItem(todo);
		
	}
	
	boolean saveOrUpdateToDoItem(ToDo todo){
		ToDo updatedObject = repo.save(todo);
		
		if(getToDoItemById(updatedObject.getId()) != null) {
			return true;
		}
		return false;
	}
	
	boolean deleteToDoItem(Long id){
		repo.deleteById(id);
		
		if(getToDoItemById(id) == null) {
			return true;
		}
		return false;
	}

}
