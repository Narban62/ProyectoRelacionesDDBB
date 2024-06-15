package ec.edu.uce.ProyectoRelacionesDDBB.Controller;
import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.AdministrativeStaffRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.AdministrativeStaff;
import ec.edu.uce.ProyectoRelacionesDDBB.Services.AdministrativeStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class AdministrativeStaffController {
    @Autowired
    private AdministrativeStaffRepository administrativeStaffRepository;

    @PostMapping
    public AdministrativeStaff createAdministrativeStaff(@RequestBody AdministrativeStaff administrativeStaff) {
        return administrativeStaffRepository.save(administrativeStaff);
    }

    @GetMapping
    public List<AdministrativeStaff> getAllAdministrativeStaff() {
        return administrativeStaffRepository.findAll();
    }
}