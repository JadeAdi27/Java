import java.util.Scanner;
public class EmployeeSalary {
	
	public static void main(String[] args) {
		
		String name,id;
		double bSalary, DA, HRA, PF, IT,grossIncome, netIncome, deductions;
		double CCA = 250, PT = 100;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name of the employee");
		name = s.nextLine();
		System.out.println("Enter Employee ID");
		id = s.nextLine();
		System.out.println("Enter basic salary");
		bSalary = s.nextDouble();
		
		DA = (0.4)*bSalary;
		HRA = (0.2)*bSalary;
		PF = (0.1)*bSalary;
		
		grossIncome = bSalary + DA + HRA+CCA;
		IT = (0.1)*grossIncome;
		deductions = PF+PT+IT;
		netIncome = grossIncome - deductions;
	
System.out.println("The Gross income of employee "+name+" with ID "+id+" is "+grossIncome);
System.out.println("The Net income of employee "+name+" with ID "+id+" is "+netIncome);
		s.close();	

	}

}
////next 1b
public class QuadraticEquation {

	int a, b, c;
	double root1, root2, d;		
	Scanner s = new Scanner(System.in);	
	
	void input()
	{
		System.out.println("Quadratic equation is in the form : ax^2 + bx + c");
        System.out.print("Enter a:");
        a = s.nextInt();
        System.out.print("Enter b:");
        b = s.nextInt();
        System.out.print("Enter c:");
        c = s.nextInt();

	}
	
	void discriminant() {
		
		d= (b*b)-(4*a*c);
	}
	
	void calculateRoots() {
		if(d>0)
		{
			System.out.println("Roots are real and unequal");
			root1 = ( - b + Math.sqrt(d))/(2*a);
			root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("First root is:"+root1);
			System.out.println("Second root is:"+root2);
		}

		else if(d == 0)
        {
            System.out.println("Roots are real and equal");
            root1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Root:"+root1);
        }

		else
        {
            System.out.println("No real solutions. Roots are imaginary");
        }

	}
	
}
public class TestQE {

	public static void main(String[] args) {
		
		QuadraticEquation qe = new QuadraticEquation();
		qe.input();
		qe.discriminant();
		qe.calculateRoots();
	}

}
