
public class MInmax {

	static public  void  main  (String[] args) //yes, in java,There is no Specific  rule for  order of specifiers.
	{
	    int arr[]= {10,20,380,40,50};
	    
	    int max=0;
	    int min=arr[0];
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(min>arr[i])
	    	{
	    		min=arr[i];
	    	}
	     if(arr[i]>max)
	     {
	    	 max=arr[i];
	     }
	    }
	    System.out.println("minimum"+" "+min);
	    System.out.println("Maximum"+" "+max);
	}

}
