package com.artyomka.springmvc;

import com.artyomka.springmvc.dto.StudentData;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    @ApiOperation(value = "Student Greeting")
    public String helloStudent() {
        return "Hello Student!";
    }

    @RequestMapping(value = "/greetings/{name}")
    @ApiOperation(value = "Student Greeting by Name")
    public String greetingByName(@PathVariable String name){
        return "Hello " + name;
    }

    @RequestMapping(value = "/student/submit")
    @ApiOperation(value = "Student Grade Feedback")
    public String feedbackAboutGrade(@PathVariable StudentData studentData){
        return "Good job with your grade of " + studentData.getGrade();
    }
}
