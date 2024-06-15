package ec.edu.uce.ProyectoRelacionesDDBB.Controller;
import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.ProfessorRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Professor;
import ec.edu.uce.ProyectoRelacionesDDBB.Services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;


    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }
}