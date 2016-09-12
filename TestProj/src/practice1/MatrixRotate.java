package practice1;

public class MatrixRotate {

	public void rotate(int[][] m){
		
		int[][] matrix=m;
		int n=matrix.length;
		int size=n-1;
		int i=0,j=0;
		while(i<n && j<n && size>0){
			
			int[] temp=new int[size];
			for(int k=0;k<size;k++){
				
				temp[k]=matrix[i][j+k+1];
				matrix[i][j+k+1]=matrix[i+size-1-k][j];
				matrix[i+size-1-k][j]=matrix[size+i][j+size-1-k];
				matrix[size+i][j+size-1-k]=matrix[i+1+k][size+j];
				matrix[i+1+k][size+j]=temp[k];
			}
			size-=2;
			i++;
			j++;
		}
		System.out.println("=================");
		for(int x=0;x<n;x++){

			for(int y=0;y<n;y++)
				System.out.print(matrix[x][y]);
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m ={{1,2,3},{4,5,6},{7,8,9}};
		new MatrixRotate().rotate(m);
	}

}
