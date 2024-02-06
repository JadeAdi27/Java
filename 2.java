import java.util.Scanner;

class Matrix
{
	int m, n, p, q, sum = 0, i,j,k;
	Scanner in = new Scanner(System.in);
	int First[][] = new int[10][10];
	int Second[][] = new int[10][10];
	int Result[][] = new int[10][10];
	
	void input()
	{
		System.out.println("Enter the number of rows and columns of First matrix");
		m = in.nextInt();
		n = in.nextInt();
		System.out.println("Enter elements of First matrix");
        for (i = 0; i < m; i++)
        {
        	for (j = 0; j < n; j++)
        		First[i][j] = in.nextInt();
        }
        
        	System.out.println("Enter the number of rows and columns of Second matrix");
        	p = in.nextInt();
            q = in.nextInt();
            System.out.println("Enter the elements of second matrix");
        	for (i = 0; i <p; i++)
            {
            	for (j = 0; j <q; j++)
            		Second[i][j] = in.nextInt();
            }
        }
	

    void add()
    {
        for (i = 0; i <m; i++)
        {
           for (j = 0; j<n; j++)
           {
               
               for(k=0;k<p;k++)
                	Result[i][j]=First[i][k]+Second[k][j];
            }        	
         }
        	
     }
        		
     void display()
     {
        for (i = 0; i <p; i++)
        {
             for (j = 0; j <q; j++)
             System.out.print(Result[i][j]+" ");
             System.out.println();
         }
        			
     }
        		
    }
        	
     	
public class Demo
{
	
	public static void main(String args[])
	   {
		Matrix MM=new Matrix();
		MM.input();
		MM.add();
		MM.display();
		
	   }
}

//2b----

public class ComplexNumber {
	
	double real;
	double imag;
	
	ComplexNumber()
	{
		real = 0.0;
		imag = 0.0;
	}
	ComplexNumber(double a)
	{
		real = a;
		imag = 0;
	}
	ComplexNumber(double a, double b)
	{
		real = a;
		imag = b;
	}
	ComplexNumber(ComplexNumber ob)
	{
		real = ob.real;
		imag = ob.imag;
	}
	
	void add(ComplexNumber c1, ComplexNumber c2)
	{
		double realSum = c1.real+c2.real;
		double imagSum = c1.imag+c2.imag;
		System.out.println("Sum is "+realSum+"+i"+imagSum);
	}
	
	void sub(ComplexNumber c1, ComplexNumber c2)
	{
		double realDiff = c1.real-c2.real;
		double imagDiff = c1.imag-c2.imag;
		System.out.println("Difference is "+realDiff+"-i"+imagDiff);
	}


}
public class ComplexNumberRun {

	public static void main(String args[])
	{
		ComplexNumber cn1 = new ComplexNumber();
		ComplexNumber cn2 = new ComplexNumber(10);
		ComplexNumber cn3 = new ComplexNumber(20,30);
		ComplexNumber cn4 = new ComplexNumber(cn3);
		cn1.add(cn1,cn4);
		cn2.sub(cn3,cn2);
	}

}
	    