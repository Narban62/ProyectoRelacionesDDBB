package ec.edu.uce.ProyectoRelacionesDDBB.Services;

import ec.edu.uce.ProyectoRelacionesDDBB.Interfaces.AdministrativeStaffRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.Model.AdministrativeStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativeStaffService {
    @Autowired
    private AdministrativeStaffRepository administrativeStaffRepository;

    public List<AdministrativeStaff> findAllStaff() {
        return administrativeStaffRepository.findAll();
    }

    public AdministrativeStaff saveStaff(AdministrativeStaff staff) {
        return administrativeStaffRepository.save(staff);
    }
}