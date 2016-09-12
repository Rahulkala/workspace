/*
 * Given an integer matrix, find the length of the longest increasing path.

From each cell, you can either move to four directions: left, right, up or down. You may NOT move diagonally or move outside of the boundary (i.e. wrap-around is not allowed).

Example 1:

nums = [
  [9,9,4],
  [6,6,8],
  [2,1,1]
]
Return 4
The longest increasing path is [1, 2, 6, 9].

Example 2:

nums = [
  [3,4,5],
  [3,2,6],
  [2,2,1]
]
Return 4
The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
 * 
 */
package practice3;

import java.util.*;

public class TopologicalSort {

	static int[][] len;
	static int maxval;
	public int cal(int[][] arr, int i,int j, int prev){
		
		if(i>=arr.length || j>=arr[0].length || i<0 || j<0)
			return -1;
		else if(arr[i][j]>prev && len[i][j]==-1){
		
			len[i][j]=0;
			len[i][j]=Math.max(len[i][j], cal(arr,i+1,j,arr[i][j]));
			len[i][j]=Math.max(len[i][j], cal(arr,i-1,j,arr[i][j]));
			len[i][j]=Math.max(len[i][j], cal(arr,i,j+1,arr[i][j]));
			len[i][j]=Math.max(len[i][j], cal(arr,i,j-1,arr[i][j]));
		}
		if(maxval<len[i][j])
			maxval=len[i][j];
		return maxval;
	}
	public int longestPath(int[][] arr){
		
		maxval=0;
		if(arr==null || arr.length==0)
            return 0;
		len=new int[arr.length][arr[0].length];
		for(int[]result:len){
            Arrays.fill(result,-1);
        }
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[0].length;j++){
				
				cal(arr,i,j, Integer.MIN_VALUE);
			}
		}
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[0].length;j++){
				
				System.out.print(len[i][j]);
			}
			System.out.println();
		}
		return maxval+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalSort ts=new TopologicalSort();
		/*
		int[][] arr1={{2,4},{5,6}};
		System.out.println(ts.longestPath(arr1));
		*/
		int[][] arr={{3,4,5},{3,2,6},{2,2,1}};
		//int[][] arr={{9,9,4},{6,6,8},{3,1,1}};
		System.out.println(ts.longestPath(arr));
		/*arr=new int[1][1];
		arr[0][0]=1;
		System.out.println(ts.longestPath(arr));
		*/
	}

}
