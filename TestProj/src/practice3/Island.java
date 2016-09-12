package practice3;

public class Island {

	static int arr[][];
	static int count=0;
	public void check(char[][] grid, int a,int b){
		
		if(a>=grid.length || b>=grid[0].length || a<0 || b<0)
			return;
		if(grid[a][b]=='1' && arr[a][b]==-1){
			
			arr[a][b]=0;
			check(grid,a-1,b);
			check(grid,a,b+1);
			check(grid,a+1,b);
			check(grid,a,b-1);
			arr[a][b]=1;
		}
	}
	public int numIslands(char[][] grid) {
    
		if(grid.length==0)
			return 0;
		arr=new int[grid.length][grid[0].length];
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[0].length;j++){
				
				arr[i][j]=-1;
			}
		}
		for(int i=0;i<grid.length;i++){
			
			for(int j=0;j<grid[0].length;j++){
				
				if(grid[i][j]=='1' && arr[i][j]==-1){
					
					count++;
					arr[i][j]=0;
					check(grid,i-1,j);
					check(grid,i,j+1);
					check(grid,i+1,j);
					check(grid,i,j-1);
					arr[i][j]=1;
				}
			}
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Island is=new Island();
		char[][] grid={{'1','1','1','1'},
				{'1','0','0','1'},
				{'1','1','1','1'}};
		grid=new char[1][1];
		grid[0][0]='0';
		System.out.println(is.numIslands(grid));
	}

}
