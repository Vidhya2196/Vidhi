public class Helwrd {
	public static void main(String[] args)
	{
		int n=2;
		String str="helloworld";
		
		//System.out.println(str.charAt(7));
		//System.out.println(str.length());
		StringBuffer sb=new StringBuffer(str);		
		
		for(int i=2;i<sb.length();)
		{
			sb.deleteCharAt(i);
			n=n+1;
			i=n;
		}
		System.out.println(sb.toString());
		}
}
