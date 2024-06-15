package ec.edu.uce.ProyectoRelacionesDDBB.Controller;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.DepartmentRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Department;
import ec.edu.uce.ProyectoRelacionesDDBB.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }
}