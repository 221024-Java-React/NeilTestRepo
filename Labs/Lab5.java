import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		char playerX = 'x';
		char playerO = 'o';
		public boolean currentPlayer = true;//true when current player is X
	
		char[][] board = new char[3][3];
	
		for(int row = 0; row < board.length; row++ ) {
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = '_';
			}
		}
		
		

	}
	
	//check if the current player has won
	boolean hasWon(char[][] board) {
		
		//checking if row match
		for(int i = 0; i < board.length; i++) {
			if(board[i][0] != '_' && board[i][0] == 
					board[i][1] && board[i][0] == board[i][2]) {
				return true;
			}
		}
		
		//checking if columns match
		for(int i = 0; i < board.length; i++){
			if(board[0][i] != '_' && board[0][i] == 
					board[1][i] && board[0][i] == board[2][i]) {
				return true;
			}
		}
		
		//checking if diagonals match
		if(board[0][0] != '_' && board[0][0] == 
				board[1][1] && board[0][0] == board[2][2]) {
			return true;
		}
		
		if(board[0][2] != '_' && board[0][2] == 
				board[1][1] && board[0][2] == board[2][0]) {
			return true;
		}
		
		return false;
	}
	
	//check if move is valid
	boolean validMv(char[][] board, int a, int b) {
		if(a < 0 || a > 2) {
			return false;
		}
		else if(b < 0 || b > 2) {
			return false;
		}
		
		else if(board[a][b] != '_') {
			return false;
		}
		else
			return true;
	}
	
	//change current player
	boolean chngPlyr(boolean plyr) {
		if(plyr)
			return false;
		else
			return true;
	}

}
