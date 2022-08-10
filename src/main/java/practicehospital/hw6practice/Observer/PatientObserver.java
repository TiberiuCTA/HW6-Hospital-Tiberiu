package practicehospital.hw6practice.Observer;

import java.util.Observable;
import java.util.Observer;

public class PatientObserver implements Observer {
    public void update(Observable e, Object arg){
        System.out.println("You have a new patient");
    }

}
