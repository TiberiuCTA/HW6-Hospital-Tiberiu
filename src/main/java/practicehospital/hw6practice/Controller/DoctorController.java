package practicehospital.hw6practice.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practicehospital.hw6practice.DTO.DoctorDTO;
import practicehospital.hw6practice.Exceptions.NoDoctorException;
import practicehospital.hw6practice.Model.Doctor;
import practicehospital.hw6practice.Model.Specialty;
import practicehospital.hw6practice.Service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("doctors")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping("/all")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/all?specialty={speciality}")
    public List<Doctor> getAllDoctorsBySpecialty(@RequestParam Specialty specialty, @PathVariable String speciality){
        return doctorService.getAllBySpecialty(specialty);
    }

    @PostMapping("/addPatient/{doctorId}/{patientId}")
    public void addPatient(@PathVariable("doctorId") Integer doctorId,@PathVariable("patientId") Integer patientId)
            throws NoDoctorException {
        doctorService.addPatient(doctorId,patientId);
    }

    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.saveDoctor(doctor);
    }






}
