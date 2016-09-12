package practice3;

import java.util.*;

public class Sudoku {

	public boolean isValidSudoku(char[][] board) {
        
		if(board==null)
			return false;
		if(board.length==0)
			return true;
		for(int i=0;i<9;i++)
			if(board.length!=board[i].length)
				return false;
		for(int i=0;i<9;i++){
			
			Set<Character> set=new HashSet<Character>();
			for(int j=0;j<9;j++){
				
				if(!set.add(board[i][j]))
					return false;
			}
			set=new HashSet<Character>();
			for(int j=0;j<9;j++){
				
				if(!set.add(board[j][i]))
					return false;
			}
		}
		for(int block=0;block<9;block++){
			
			Set<Character> set=new HashSet<Character>();
			for(int i=(block/3)*3;i<(block/3)*3+3;i++){
				
				for(int j=(block%3)*3;j<(block%3)*3+3;j++){
					
					if(!set.add(board[i][j])){
						
						return false;
					}
				}
			}
		}
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sudoku s=new Sudoku();
		char[][] board={{'5','3','4','6','7','8','9','1','2'},
                {'6','7','2','1','9','5','3','4','8'},
                {'1','9','8','3','4','2','5','6','7'},
                {'8','5','9','7','6','1','4','2','3'},
                {'4','2','6','8','5','3','7','9','1'},
                {'7','1','3','9','2','4','8','5','6'},
                {'9','6','1','5','3','7','2','8','4'},
                {'2','8','7','4','1','9','6','3','5'},
                {'3','4','5','2','8','6','1','7','9'}};
		System.out.println(s.isValidSudoku(board));
	}

}
