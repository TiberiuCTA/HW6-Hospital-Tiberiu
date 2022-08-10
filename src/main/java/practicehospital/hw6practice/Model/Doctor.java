package practicehospital.hw6practice.Model;


import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practicehospital.hw6practice.Exceptions.NoDoctorException;
import practicehospital.hw6practice.Repository.DoctorRepository;
import practicehospital.hw6practice.Repository.PatientRepository;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    String name;
    @OneToMany
    @ToString.Exclude
    List<Patient> patientList;
    Specialty specialty;

    public void addPatient(Patient patient) {
        patientList.add(patient);
        System.out.println("All good. Added patient: " + patient + "\nTo doctor: " + this);

    }
}

