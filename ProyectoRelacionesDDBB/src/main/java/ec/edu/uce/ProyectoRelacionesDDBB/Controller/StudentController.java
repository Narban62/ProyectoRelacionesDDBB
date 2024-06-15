package ec.edu.uce.ProyectoRelacionesDDBB.Controller;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.StudentRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Student;
import ec.edu.uce.ProyectoRelacionesDDBB.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}