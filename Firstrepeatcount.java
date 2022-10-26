import java.util.HashMap;

public class Firstrepeatcount {

	public static void main(String[] args) {
		
	 String str="sreshambiya";
	char[] c=str.toCharArray();
	 
	 HashMap<Character,Integer> hm=new HashMap<>();
	 int count=0;
	 for(int i=0;i<c.length;i++)
	 {
		
		 if(hm.containsKey(c[i]))
		 {
			 hm.put(c[i],hm.get(c[i])+1);
		 }
		 else
		 {
			 hm.put(c[i], 1);
		 }
	 }
	 System.out.println(hm);
	 for(char charvalue:c)
	 {
		if(hm.get(charvalue)>1) //(charvalue=='a')
		{
			System.out.println("First repeated character String in  "+str+" is "+charvalue+"  occured   "+
		                                      hm.get(charvalue)+"  times");
			break;
		}
	 }
	}

}
