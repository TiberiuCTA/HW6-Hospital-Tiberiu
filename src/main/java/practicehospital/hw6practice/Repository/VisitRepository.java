package practicehospital.hw6practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practicehospital.hw6practice.Model.Specialty;
import practicehospital.hw6practice.Model.Visit;

import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {

    List<Visit> findAll();
    List<Visit> findAllByPatient_Cnp(String cnp);
    List<Visit> findAllByDoctor_Specialty(Specialty specialty);

}
