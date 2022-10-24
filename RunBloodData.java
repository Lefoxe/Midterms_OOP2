import java.util.Scanner;
public class RunBloodData{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter patient's Blood Type: ");
	String bled = sc.nextLine();
	if ((bled.equals("A")||bled.equals("B"))||(bled.equals("AB")||bled.equals("O"))){
		System.out.print("Enter patient's Rhesus Factor: ");
		String rees = sc.nextLine();
		if (rees.equals("+")||rees.equals("-")){
			BloodData obj1 = new BloodData();
			obj1.setBloodType(bled);
			obj1.setRhFactor(rees);
			obj1.display();
			System.out.println(" is added to the blood bank.");
		}
		else{
			System.out.println("Invalid Rhesus Factor.");
		}
	}
	
	else if (bled.isEmpty()){
		System.out.print("Enter the patient's Rhesus Factor: ");
		String rees = sc.nextLine();
		if (rees.isEmpty()){
			BloodData obj2 = new BloodData();
			obj2.display();
			System.out.println(" is added to the blood bank.");
		}
		else{
			System.out.println("Invalid Response.");
		}
		}
	else{
		System.out.println("Invalid Blood Type.");
	}

	}
	
}