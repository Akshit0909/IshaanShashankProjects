package com.springrest.springrest.Services;


import com.springrest.springrest.Entity.Course;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    List <Course> list;

    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Course(12,"java","Oak world"));
        list.add(new Course(22,"Dot Net","microsoft world"));
        list.add(new Course(32,"c++","pointer world"));

        //this.courseDao = courseDao;
    }

    @Override
    public List<Course> getcourse() {
        List l = new ArrayList<>();
        l.add(new Course(12,"java","Oak world"));
        l.add(new Course(22,"Dot Net","microsoft world"));
        l.add(new Course(32,"c++","pointer world"));
        return list;
       // return courseDao.findAll();
    }

    @Override
    public Course getcoursebyId(long id) {
        Course c = null;
            for(Course course:list) {
             if(course.getId()==id) {
                      c=course;
                      break; } }
        return c;
        //return courseDao.getOne(id);
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
       // return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
       list.forEach(i->{
           if(i.getId()== course.getId()){
                 i.setTitle(course.getTitle());
               i.setDescription(course.getDescription());
           }
       });
       return course;
        //courseDao.save(course);
       // return course;
    }

    @Override
    public List<Course> DeleteCourse(long id) {
        Course c = null;
        for(Course course:list) {
            if(course.getId()==id) {
                list.remove(id);
            }
                 }
        return list;
    }


}
