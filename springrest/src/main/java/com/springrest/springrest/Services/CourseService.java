package com.springrest.springrest.Services;

import com.springrest.springrest.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {

    public List<Course> getcourse();

    public Course getcoursebyId(long id);

    public  Course addCourse(Course course);

    public Course updateCourse(Course course);

    public List<Course> DeleteCourse(long id);



}
