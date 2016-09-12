package practice1;

public class GrayCode {

	public void greyCode(int n)
	{
		int totalN = (int) Math.pow(2,n);
		for (int i = 0; i < totalN; i++)
		{
			int greyCode = i ^ (i / 2);
			System.out.println(greyCode);
			
			//intToBinary(greyCode); // Converts the num to binary pattern
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode gc=new GrayCode();
		gc.greyCode(3);
	}

}
