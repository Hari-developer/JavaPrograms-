
public class nprime {
	
	public static void main(String args[])
	{
		int value=2;
		int count=0;
		
		
		while(value>0)
		{
			Boolean isprime=true;
			for(int i=2;i<value;i++)
			{
				if(value%i==0)
				{
					isprime=false;
					break;
				}
				else
				{
					System.out.println(value);
					count++;
					
					
					value=value+value;
			    }
				value++;
				if(count==10)
				{
					break;
				}
				
			}
		}
	}

}
