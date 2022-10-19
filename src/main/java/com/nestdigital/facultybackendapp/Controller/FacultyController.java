package com.nestdigital.facultybackendapp.Controller;

import com.nestdigital.facultybackendapp.Model.FacultyModel;
import com.nestdigital.facultybackendapp.dao.FacultyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {

    @Autowired
    private FacultyDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/addfac")
    public String AddFaculty(@RequestBody FacultyModel faculty){
        System.out.println(faculty.toString());
        dao.save(faculty);
    return "{Status:'Success'}";
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/viewfac")
    public List<FacultyModel> ViewFaculty(){
        return (List<FacultyModel>)dao.findAll();
    }
}
