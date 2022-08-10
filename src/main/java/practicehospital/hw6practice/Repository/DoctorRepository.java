package practicehospital.hw6practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practicehospital.hw6practice.Model.Doctor;

import java.util.List;

@Repository

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findAll();
    Doctor getDoctorById(Integer id);
}
