import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {
	ArrayList<Long> array = new ArrayList<Long>();
	
	public Fibonacci()
	{
		Long temp = null;
		for(int i = 0; i<80 ; i++)
		{
			if ( i == 0) temp = (long) 0;
			else if ( i == 1) temp = (long) 1;
			else temp = array.get(i-2) + array.get(i-1);
			array.add(temp);
			System.out.println(i + " = " + temp);
		}
		
	}
	
	public boolean isPresent(long e)
	{
		boolean bool; 
		bool = false;
		int position = - 1 ;
		for ( int i = 0 ; i < array.size() ; i++)
		{
			if ( array.get(i) == e ) bool = true;
		}
		return bool;		
	}
	
	public void Melanger()
	{
		Collections.shuffle(array);
	}
	
	public void reTrier()
	{
		Collections.sort(array);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		fib.isPresent(4182);
		fib.isPresent(832040);
		
	}

}
