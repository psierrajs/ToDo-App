package com.example.ToDo.App;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
