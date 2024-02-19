package com.marcelinx.crudspring.DTO.mapper;

import org.springframework.stereotype.Component;

import com.marcelinx.crudspring.DTO.courseDTO;
import com.marcelinx.crudspring.model.Course;

@Component
public class CourseMapper {

    public courseDTO toDTO(Course course) {
        if (course == null) {
            return null;
        }
        return new courseDTO(course.getId(), course.getName(), course.getCategory());
    }

    public Course toEntity(courseDTO courseDTO) {

        if (courseDTO == null) {
            return null;
        }

        Course course = new Course();
        if (courseDTO.id() != null) {
            course.setId(courseDTO.id());
        }
        course.setName(courseDTO.name());
        course.setCategory(courseDTO.category());
        course.setStatus("Ativo");
        return course;
    }
}