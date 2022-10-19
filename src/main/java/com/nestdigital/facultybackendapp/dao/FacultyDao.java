package com.nestdigital.facultybackendapp.dao;

import com.nestdigital.facultybackendapp.Model.FacultyModel;
import org.springframework.data.repository.CrudRepository;

public interface FacultyDao extends CrudRepository<FacultyModel,Integer> {
}
