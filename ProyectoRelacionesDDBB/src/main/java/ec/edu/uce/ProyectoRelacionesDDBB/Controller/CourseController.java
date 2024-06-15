package ec.edu.uce.ProyectoRelacionesDDBB.Controller;
import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.CourseRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Course;
import ec.edu.uce.ProyectoRelacionesDDBB.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }
}