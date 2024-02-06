public interface FixedDeposit {
	
	double getMAmount();
	void calculateInterest();
	void getDetails();

}

public class CanaraBank implements FixedDeposit{
	
	Scanner s = new Scanner(System.in);
	String name;
	double principal;
	double period;
	double roi = 8.5;
	double interestAmt;
	
	public void getDetails()
	{
		System.out.println("Enter your name");
		name = s.nextLine();
		System.out.println("Enter the Principal amount");
		principal = s.nextDouble();
		System.out.println("Enter the period of deposit");
		period = s.nextDouble();
	}
	
	public void calculateInterest() {
		
		interestAmt = (principal*period*roi)/100;
		
	}
	
	public double getMAmount() {
		
		double totalBalance;
		totalBalance = principal+interestAmt;
		return totalBalance;
	}
	
}

public class SBI implements FixedDeposit{
	
	Scanner s = new Scanner(System.in);
	String name;
	double principal;
	double period;
	double roi = 8.75;
	double interestAmt;
	
	public void getDetails()
	{
		System.out.println("Enter your name");
		name = s.nextLine();
		System.out.println("Enter the Principal amount");
		principal = s.nextDouble();
		System.out.println("Enter the period of deposit");
		period = s.nextDouble();
	}
	
	public void calculateInterest() {
		
		interestAmt = (principal*period*roi)/100;
		
	}
	
	public double getMAmount() {
		
		double totalBalance;
		totalBalance = principal+interestAmt;
		return totalBalance;
	}

}
public class TestBank {

	public static void main(String[] args) {
		
		double mAmount;
		SBI s = new SBI();
		CanaraBank cb = new CanaraBank();
		
		s.getDetails();
		s.calculateInterest();
		mAmount = s.getMAmount();
		System.out.println("Dear "+s.name+" your Maturity Amount in SBI Bank is "+mAmount);
		
		cb.getDetails();
		cb.calculateInterest();
		mAmount = cb.getMAmount();
		System.out.println("Dear "+s.name+" your Maturity Amount in Canara Bank is "+mAmount);
		
	}

}
//4b ----

public abstract class Solid {
	
	double r, h;
	abstract void surfaceArea();
	abstract void volume();
	void readRadius()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextDouble();

	}
	
	void readHeight()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height");
		h=sc.nextDouble();

	}
	
}

public class Cone extends Solid{
	
		
	void surfaceArea()
	{
		double area = (3.14 * r)*(r * Math.sqrt(r*r + h*h));	
		System.out.println("Surface area of cone is "+area);
	}
	
	
	void volume()
	{
		double volume = 3.14 * r * r * (h/3);
		System.out.println("Volume of cone is "+volume);
	}

}
public class Cylinder extends Solid {
	
	
	
	void surfaceArea()
	{
		//System.out.println(r+" "+h);
		double area = 3.14 * r * r * h;
		System.out.println("Surface area of cylinder is " +area);
	}
	
	void volume()
	{
		double volume = (2 * 3.14 * r * h) + (2 * 3.14 * r * r);
		System.out.println("Volume of cylinder is "+volume);
	}
}


public class Sphere extends Solid {
	
		
	void surfaceArea()
	{
		double area = 4 * 3.14 * r * r;
		System.out.println("Surface area of sphere is  "+area);
	}
	
	void volume()
	{
		double volume  = 4.0/3 * 3.14 * r * r * r;
		System.out.println("Volume of sphere is "+volume);
	}
	
}

public class MySolid {
	
	public static void main(String args[]) {
		
		Solid s=new Cylinder();
		s.readRadius();
		s.readHeight();
		s.surfaceArea();
		s.volume();

		s=new Cone();
		s.readRadius();
		s.readHeight();
		s.surfaceArea();
		s.volume();
		
		s=new Sphere();
		s.readRadius();
		s.surfaceArea();
		s.volume();


		
	}

}

