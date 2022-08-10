package practicehospital.hw6practice.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import practicehospital.hw6practice.Model.Specialty;

@Data
@NoArgsConstructor
public class DoctorDTO {
    private String name;
    private Specialty specialty;
}
