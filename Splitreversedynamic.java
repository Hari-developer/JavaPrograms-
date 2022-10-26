
public class Splitreversedynamic {

	public static void main(String[] args) {
		
		String s="shambia";
		
		String x="";
		System.out.println(s.length()%2);
		
		if(s.length()%2!=0)
		{
			char y=s.charAt(s.length()/2);
			System.out.println(y);
			//System.out.println(s.length()+1);
			
		}
		String a=s.substring(0,s.length()/2);
		String b=s.substring(s.length()/2+1,s.length());
		
		int j=b.length()-1;
		for(int i=a.length()-1;i>=0;i--)
		{
			x=x+a.charAt(i)+b.charAt(j);
			j--;
		}
		
		System.out.println("Required output :"+" "+ s.charAt(s.length()/2)+x);
		
		
		
		
	}

}
