package com.myorg.cqrsdemo.control;


import com.myorg.cqrsdemo.model.Student;
import com.myorg.cqrsdemo.service.StudentQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query/v1")
public class StudentQueryController {

    @Autowired
    private StudentQueryService studentQueryService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Student> getAll() {
        return this.studentQueryService.getAll();
    }

    /**
     * Plus other methods depending on the app requirements
     * */
}
