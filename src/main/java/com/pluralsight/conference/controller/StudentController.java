package com.pluralsight.conference.controller;
import com.pluralsight.conference.model.Student;
import com.pluralsight.conference.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    // 200 - OK
    // 201 - CREATED
    // 400 - BAD REQUEST
    // 401 - UNAUTHORIZED
    // 500 - INTERNAL SERVER ERROR

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentById(
            @PathVariable("id") int id
    ) {
        return studentService.get(id);
    }

    /**
     * Below is the test
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Student body) {
        studentService.insertStudent(body);
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String pong() {
        return "pong";
    }
}
