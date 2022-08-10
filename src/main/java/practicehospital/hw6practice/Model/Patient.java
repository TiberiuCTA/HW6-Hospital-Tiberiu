package practicehospital.hw6practice.Model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import practicehospital.hw6practice.Observer.PatientObserver;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends Observable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    String cnp;
    @OneToMany
    List<Visit> visitList = new ArrayList<>();
    @ManyToOne
    Doctor doctor;
}
