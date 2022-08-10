package practicehospital.hw6practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practicehospital.hw6practice.Model.Doctor;
import practicehospital.hw6practice.Model.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Integer>
{
    List<Patient> findAll();
    Patient getPatientById(Integer id);

    List<Patient> getAllByDoctor(Doctor doctor);

    Patient getByCnp(String cnp);


}
