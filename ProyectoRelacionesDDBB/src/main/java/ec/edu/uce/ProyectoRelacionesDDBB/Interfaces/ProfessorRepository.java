package ec.edu.uce.ProyectoRelacionesDDBB.Interfaces;

import ec.edu.uce.ProyectoRelacionesDDBB.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{
}
