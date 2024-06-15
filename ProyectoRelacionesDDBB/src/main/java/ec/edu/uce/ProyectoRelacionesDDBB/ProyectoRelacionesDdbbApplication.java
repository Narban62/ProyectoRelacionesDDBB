package ec.edu.uce.ProyectoRelacionesDDBB;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.*;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ProfessorRepository professorRepository;

	@Autowired
	private AdministrativeStaffRepository administrativeStaffRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		studentRepository.deleteAll();
		professorRepository.deleteAll();
		administrativeStaffRepository.deleteAll();
		departmentRepository.deleteAll();
		courseRepository.deleteAll();
		// Agregar datos a la tabla de estudiantes
		Student student = new Student();
		student.setName("Luis");
		student.setEmail("Luis@mail.test");
		studentRepository.save(student);

		// Agregar datos a la tabla de personal administrativo
		AdministrativeStaff administrativeStaff = new AdministrativeStaff();
		administrativeStaff.setName("Rosa");
		administrativeStaff.setEmail("Rosa@mail.test");
		administrativeStaff.setPosition("Secretary");
		administrativeStaffRepository.save(administrativeStaff);

		// Agregar datos a la tabla de cursos
		Course course = new Course();
		course.setName("Chemistry");
		course.setCredits(6);
		courseRepository.save(course);

		Department department = new Department();
		department.setName("Human Resources");
		departmentRepository.save(department);

		Professor professor = new Professor();
		professor.setName("Jorge");
		professor.setEmail("Jorge@mail.test");
		professorRepository.save(professor);


		System.out.println("Datos iniciales cargados.");
	}
}

