package practicehospital.hw6practice.Mapper;

import org.mapstruct.Mapper;
import practicehospital.hw6practice.DTO.DoctorDTO;
import practicehospital.hw6practice.Model.Doctor;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorDTO toDoctorDTO(Doctor Doctor);
}
