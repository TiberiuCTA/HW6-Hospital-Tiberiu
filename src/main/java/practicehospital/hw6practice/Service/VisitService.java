package practicehospital.hw6practice.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practicehospital.hw6practice.Model.Specialty;
import practicehospital.hw6practice.Model.Visit;
import practicehospital.hw6practice.Repository.VisitRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitService {
    final VisitRepository visitRepository;

    public List<Visit> getAllVisits(){
        return visitRepository.findAll();
    }

    public List<Visit> getVisitsByCnp(String cnp){
        return visitRepository.findAllByPatient_Cnp(cnp);
    }

    public List<Visit> getVisitBySpecialty(Specialty specialty){
        return visitRepository.findAllByDoctor_Specialty(specialty);
    }

    public void saveVisit(Visit visit){
        visitRepository.save(visit);
    }

}
