package com.springrest.springrest.Controller;


import com.springrest.springrest.Entity.Course;
import com.springrest.springrest.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "Akshit";
    }


    @GetMapping("/courses")
    public List<Course> getcourses() {
        List corselist = courseService.getcourse();
        return corselist;
    }


    @GetMapping("/courses/{courseId}")
    public Course getcoursesById(@PathVariable String courseId) {

        return  this.courseService.getcoursebyId(Long.parseLong(courseId));
    }

    //@RequestMapping(value = "/courses", method = RequestMethod.POST)
    @PostMapping(path="/courses" ,consumes="application/json")
    public Course addcourse(@RequestBody Course course)
    {

        return this.courseService.addCourse(course);
    }
    // to update a particular  resource
    @PutMapping("/courses")
    public Course updatecourse(@RequestBody Course course)
    {
       return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<Course> Deletecourse(@PathVariable String courseId)
    {

       List<Course> newl= this.courseService.DeleteCourse(Long.parseLong(courseId));
        //return new ResponseEntity(courseId, HttpStatus.OK);
        return (ResponseEntity<Course>) newl;
    }

}
