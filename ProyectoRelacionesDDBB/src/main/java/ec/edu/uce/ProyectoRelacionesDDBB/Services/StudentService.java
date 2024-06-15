package ec.edu.uce.ProyectoRelacionesDDBB.Services;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.StudentRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}