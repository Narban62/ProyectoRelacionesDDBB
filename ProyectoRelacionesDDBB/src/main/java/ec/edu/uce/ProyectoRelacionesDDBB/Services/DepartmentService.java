package ec.edu.uce.ProyectoRelacionesDDBB.Services;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.DepartmentRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}