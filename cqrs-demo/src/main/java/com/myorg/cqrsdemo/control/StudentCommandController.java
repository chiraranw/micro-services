package com.myorg.cqrsdemo.control;

import com.myorg.cqrsdemo.model.Student;
import com.myorg.cqrsdemo.service.StudentCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command/v1")
public class StudentCommandController {

    @Autowired
    private StudentCommandService studentCommandService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Student create(@RequestBody Student student) {
        return this.studentCommandService.create(student);
    }
    /**
     * Plus other methods depending on the app requirements
     * */

}
