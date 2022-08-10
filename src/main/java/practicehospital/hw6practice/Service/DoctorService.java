package practicehospital.hw6practice.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practicehospital.hw6practice.Exceptions.NoDoctorException;
import practicehospital.hw6practice.Model.Doctor;
import practicehospital.hw6practice.Model.Patient;
import practicehospital.hw6practice.Model.Specialty;
import practicehospital.hw6practice.Repository.DoctorRepository;
import practicehospital.hw6practice.Repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DoctorService {


    @Autowired
    final DoctorRepository doctorRepository;
    @Autowired
    final PatientRepository patientRepository;
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void addPatient(Integer doctorId, Integer patientId) throws NoDoctorException{
        Doctor doctor = doctorRepository.getById(doctorId);
        if(doctor == null){
            throw new NoDoctorException();
        }
        else {
            Optional<Patient> patient = patientRepository.findById(patientId);
            if (patient.isPresent()) {
                doctorRepository.findById(doctorId).get().addPatient(patient.get());
                patientRepository.findById(patientId).get().setDoctor(doctor);
                System.out.println("All good. Added patient: " + patient + "\nTo doctor: " + doctor);
            }
        }

    }

    public List<Doctor> getAllBySpecialty(Specialty specialty){
        return getAllBySpecialty(specialty);
    }

    public void saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }





}
