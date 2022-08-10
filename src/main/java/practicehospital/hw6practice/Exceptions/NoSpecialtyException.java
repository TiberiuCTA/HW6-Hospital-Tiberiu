package practicehospital.hw6practice.Exceptions;

public class NoSpecialtyException extends Exception{
    public NoSpecialtyException(){
        super("Specialty doesn't exist");
    }
}
