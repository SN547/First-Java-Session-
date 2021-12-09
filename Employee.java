package JavaSessions;

public class Employee {

	public static void main(String[] args) {
		Object ei[] = new Object[5];
		ei[0] = "Swara";
		ei[1] = 28;
		ei[2] = 35000;
		ei[3] = "Active";
		ei[4] = 'F';
		
		for (Object A : ei)
		System.out.println(A);	
		
		System.out.println("-------");
		
		Object ei1[] = new Object[5];
		ei1[0] = "Tanvi";
		ei1[1] = 30;
		ei1[2] = 37000;
		ei1[3] = "Not Active";
		ei1[4] = 'F';
		
		for (Object B : ei1)
			System.out.println(B);
		

	}

}
