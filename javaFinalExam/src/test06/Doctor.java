package test06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
	private String id;
	private String special;
	private List<Patient> patients;
	
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
		patients = new ArrayList<>();
	}
	
	public void addPatient(Patient a) {
		this.patients.add(a);
	}

	@Override
	public String toString() {
		return "의사: " + name + ", " + id + ", "
	+ special + "\n담당환자 : \n" + patients ;
	}
	
}
