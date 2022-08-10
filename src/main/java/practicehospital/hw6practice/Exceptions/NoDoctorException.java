package practicehospital.hw6practice.Exceptions;

public class NoDoctorException extends Exception{
    public NoDoctorException(){
        super("Doctor doesn't exist");
    }

}
