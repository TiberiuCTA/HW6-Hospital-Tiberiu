package practicehospital.hw6practice.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practicehospital.hw6practice.DTO.PatientDTO;
import practicehospital.hw6practice.Mapper.PatientMapper;
import practicehospital.hw6practice.Model.Doctor;
import practicehospital.hw6practice.Model.Patient;
import practicehospital.hw6practice.Model.Specialty;
import practicehospital.hw6practice.Model.Visit;
import practicehospital.hw6practice.Repository.PatientRepository;
import practicehospital.hw6practice.Repository.VisitRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientService {

    final PatientRepository patientRepository;
    final PatientMapper patientMapper;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
    public Patient getPatientById(Integer id){
        System.out.println(patientRepository.findById(id).get());
        return patientRepository.findById(id).get();
    }

    public List<PatientDTO> getAllPatientsDTO(){
        return patientRepository.findAll().stream()
                .map(patientMapper::toPatientDTO)
                .collect(Collectors.toList());
    }
    public PatientDTO getPatientDTOById(Integer id){
        return patientMapper.toPatientDTO(patientRepository.getById(id));
    }

    public List<Patient> getAllByDoctor(Doctor doctor){
        return patientRepository.getAllByDoctor(doctor);
    }

    public List<PatientDTO> getAllDTOByDoctor(Doctor doctor){
        return patientRepository.getAllByDoctor(doctor).stream()
                .map(patientMapper::toPatientDTO)
                .collect(Collectors.toList());
    }

    public Patient getByCnp(String cnp){
        return patientRepository.getByCnp(cnp);
    }

    public PatientDTO getByCnpDTO(String cnp){
        return patientMapper.toPatientDTO(patientRepository.getByCnp(cnp));
    }

    public void savePatient(Patient patient){
        patientRepository.save(patient);
    }
}
