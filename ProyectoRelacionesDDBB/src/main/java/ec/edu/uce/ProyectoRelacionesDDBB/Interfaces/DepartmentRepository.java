package ec.edu.uce.ProyectoRelacionesDDBB.Interfaces;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {}
