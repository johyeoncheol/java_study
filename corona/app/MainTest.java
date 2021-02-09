package lab.ssafy.corona.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lab.ssafy.corona.medical.CDC;
import lab.ssafy.corona.medical.Hospital;
import lab.ssafy.corona.medical.NotCoronaException;
import lab.ssafy.corona.person.Patient;

public class MainTest {
	
	public static void main(String[] args) throws NotCoronaException {
		// ���� ����
		Hospital univHospital = new Hospital("���к���", 15, "001", 50, 10);
		Hospital localHospital = new Hospital("���׺���", 3, "901", 10, 2);
		
		// ȯ�� ����
		Patient p1 = new Patient("ȯ��1", 42, "010-1111-1111", "ȣ����", "001", true);
		Patient p2 = new Patient("ȯ��2", 30, "010-2222-2222", "����", "901", true);
		
		// ���� Collection
		List<Hospital> hospitalList = new ArrayList<Hospital>();
		hospitalList.add(univHospital);
		hospitalList.add(localHospital);
		
		// ȯ�� Collection
		Set<Patient> patientList = new HashSet<Patient>();
		patientList.add(p1);
		patientList.add(p2);
		
		CDC cdc = new CDC("��������û", 200, hospitalList, patientList);
		cdc.about();
		
		// ������ cdc ����
		univHospital.setCdc(cdc);
		localHospital.setCdc(cdc);
		
		 //���� üũ check
		Patient p3 = new Patient("ȯ��3", 33, "010-3333-3333", "��", "001", false);
		try {
			univHospital.addPatient(p3);
		}catch(NotCoronaException e) {
			System.out.println("����Ϸ��� ȯ�ڴ� Corona ȯ�ڰ� �ƴմϴ�.");
		}
		
		cdc.printPatientList();
		
		// ȯ�� ����Ʈ csv ���� ���
		String filePath = "c:"+File.separator+"SSAFY";
		String fileName = "CoronaPatientList.csv";
		
		try (				
			BufferedWriter writer = 
			new BufferedWriter(
				new OutputStreamWriter(
					new FileOutputStream(filePath+File.separator+fileName), "MS949"));
		){
			for( Patient p : patientList ) {
				writer.write(p.getName() + "^" + p.getAge() + "^" + p.getPhone());
				writer.newLine();
			}
			writer.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}