package practicehospital.hw6practice.Mapper;

import org.mapstruct.Mapper;
import practicehospital.hw6practice.DTO.PatientDTO;
import practicehospital.hw6practice.Model.Patient;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toPatientDTO(Patient patient);
}
