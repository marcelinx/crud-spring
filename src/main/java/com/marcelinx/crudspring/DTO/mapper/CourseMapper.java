package com.marcelinx.crudspring.DTO.mapper;

import org.springframework.stereotype.Component;

import com.marcelinx.crudspring.DTO.courseDTO;
import com.marcelinx.crudspring.enums.Category;
import com.marcelinx.crudspring.model.Course;

@Component
public class CourseMapper {

    public courseDTO toDTO(Course course) {
        if (course == null) {
            return null;
        }
        return new courseDTO(course.getId(), course.getName(), course.getCategory().getValue());
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
        course.setCategory(convertCategoryValue(courseDTO.category()));
        return course;
    }

    public Category convertCategoryValue(String value) {
        if (value == null) {
            return null;
        }
        return switch (value) {
            case "Front-end" -> Category.FRONT_END;
            case "Back-end" -> Category.BACK_END;
            default -> throw new IllegalArgumentException("Categoria inválida: " + value);
        };    
    }
}