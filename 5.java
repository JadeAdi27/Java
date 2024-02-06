public class One extends Thread {
	
	public void run()
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(1000);
				System.out.println("Good morning");
				i++;
			}
		}
			
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

	}
}

public class Two extends Thread {
	
	
	public void run()
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(2000);
				System.out.println("Hello");
				i++;
			}
		}
			
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
      }
}
public class Three extends Thread {
	
	public void run()
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(3000);
				System.out.println("Welcome");
				i++;
			}
		}
			
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

	}
}
	}
}

public class MyThread {

	public static void main(String[] args) {
		
		One t1=new One();
		Two t2=new Two();
		Three t3=new Three();
		
		t1.start();
		t2.start();
		t3.start();
		
		}
		
}
//5b ---

public class IO 
{
	public static void main(String args[]) throws IOException, FileNotFoundException
	{
		char c;
		int i;
		FileInputStream fin = new FileInputStream("Test1.txt");
		FileOutputStream fout = new FileOutputStream("Test1.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");
		do{
			c = (char) br.read();
			if(c != 'q') fout.write(c);
		  } while(c != 'q');
		System.out.println("Contents of the file are");
		do{
			i = fin.read();
			if(i != -1) System.out.print((char) i);
		  } while(i != -1);
			
		fin.close();
		fout.close();
	}

}
