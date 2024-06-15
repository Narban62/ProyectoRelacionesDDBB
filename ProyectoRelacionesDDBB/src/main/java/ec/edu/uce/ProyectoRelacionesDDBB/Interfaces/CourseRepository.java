package ec.edu.uce.ProyectoRelacionesDDBB.Interfaces;

import ec.edu.uce.ProyectoRelacionesDDBB.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}
