package fr.treeptik.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.treeptik.dao.ToDoDao;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.ToDo;
import fr.treeptik.service.ToDoService;

public class ToDoServiceImpl implements ToDoService {

	private ToDoDao toDoDao;

	@Override
	public void add(ToDo toDo) throws ServiceException {
		try {
			toDoDao.save(toDo);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public List<ToDo> getAll() throws ServiceException {

		List<ToDo> toDos = new ArrayList<>();
		try {
			toDos = toDoDao.findAll();
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}

		return toDos;
	}

	@Override
	public ToDo get(Integer id) throws ServiceException {
		try {
			return toDoDao.findOne(id);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public void delete(Integer id) throws ServiceException {
		try {
			toDoDao.delete(id);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
