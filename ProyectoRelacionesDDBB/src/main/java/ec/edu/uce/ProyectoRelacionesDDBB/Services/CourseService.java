package ec.edu.uce.ProyectoRelacionesDDBB.Services;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.CourseRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}