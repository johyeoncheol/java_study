package lab.ssafy.corona.medical;

import java.util.List;
import lab.ssafy.corona.person.Patient;

public interface MedicalAction {
	void addPatient(Patient p) throws NotCoronaException;
	void removePatient(Patient p);
}
