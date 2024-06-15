package ec.edu.uce.ProyectoRelacionesDDBB.Interfaces;

import ec.edu.uce.ProyectoRelacionesDDBB.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
