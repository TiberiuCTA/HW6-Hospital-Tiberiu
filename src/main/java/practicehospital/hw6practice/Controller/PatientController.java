package practicehospital.hw6practice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practicehospital.hw6practice.DTO.PatientDTO;
import practicehospital.hw6practice.Model.Patient;
import practicehospital.hw6practice.Model.Specialty;
import practicehospital.hw6practice.Model.Visit;
import practicehospital.hw6practice.Service.PatientService;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("/{cnp}")
    public Patient getPatientByCnp(@PathVariable String cnp){
        return patientService.getByCnp(cnp);
    }

    @PostMapping("/addPatient")
    public void addPatient(@RequestBody Patient patient){
        patientService.savePatient(patient);
    }

    @GetMapping("/dto/cnp/{cnp}")
    public PatientDTO getPatientDTObyCnp(@PathVariable String cnp){
        return patientService.getByCnpDTO(cnp);
    }
}
