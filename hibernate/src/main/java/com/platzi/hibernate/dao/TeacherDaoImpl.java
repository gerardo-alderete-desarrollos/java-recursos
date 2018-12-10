package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.models.Teacher;

public class TeacherDaoImpl implements TeacherDao{
	private PlatziSession platziSession;
	
	public TeacherDaoImpl() {
		platziSession = new PlatziSession();
	}

	public void saveTeacher(Teacher teacher) {
		platziSession.getSession().persist(teacher);
		platziSession.getSession().getTransaction().commit();
	}

	public void deleteTeacherById(Long id) {
		
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public List<Teacher> findAllTeachers() {
		
		return platziSession.getSession().createQuery("from Teacher").list();
	}

	public Teacher findTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher findTeacherByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
