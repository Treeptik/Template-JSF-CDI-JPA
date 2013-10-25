package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.model.ToDo;

public interface ToDoDao {

	void delete(Integer id);

	ToDo save(ToDo toDo);

	List<ToDo> findAll();

	ToDo findOne(Integer id);

}
