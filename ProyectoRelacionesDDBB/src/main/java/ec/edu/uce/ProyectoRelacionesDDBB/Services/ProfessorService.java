package ec.edu.uce.ProyectoRelacionesDDBB.Services;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.ProfessorRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> findAllProfessors() {
        return professorRepository.findAll();
    }

    public Professor saveProfessor(Professor professor) {
        return professorRepository.save(professor);
    }
}