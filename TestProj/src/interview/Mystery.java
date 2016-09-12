package interview;

public class Mystery{
	
	public int count(StringBuilder str){

		int c=0;	
		StringBuilder s=str;					// count the number of operations
		for(int i=0;i<s.length();i++){

			if(s.charAt(i)==(s.charAt(s.length()-1-i)))
				continue;
			else{

				if((int)s.charAt(i)>(int)s.charAt(s.length()-1-i)){

					c+=(int)s.charAt(i)-(int)s.charAt(s.length()-1-i);
				}
				else{

					c+=(int)s.charAt(s.length()-1-i)-(int)s.charAt(i);
				}
			}
		}
		return c;
	}
	public void changes(String[] arr){

		for(String s: arr){

			StringBuilder sb=new StringBuilder(s);
			if(sb.equals(sb.reverse()))
				System.out.println("0");
			else{

				System.out.println(count(sb));
			}
		}
	}
	public static void main(String arg[]){

		Mystery m=new Mystery();
		String[] arr={"abc","aba","rahul"};
		m.changes(arr);
	}
}
