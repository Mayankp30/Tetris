public class DrawSpiral{

	private char[][] board;

	public static void main(String[] args) {
		
		DrawSpiral spiral = new DrawSpiral();
		spiral.start(5);
	}
	public void start(int size){
		board=new char[size][size];
		this.drawTop(0,0,size);
	}
	public void drawTop(int x, int y , int size){
		for (int i=0;i<size ;i++ ) {
				board[x++][y]="&";
			}
		if(--size>0){
			this.drawTop(--x,++y,size);
		}else{
			printboard();
		}		
	}
	public void drawRight(int x, int y , int size){
		for (int i=0;i<size ;i++ ) {
				board[x][y++]="&";
			}
		if(--size>0){
			this.drawRight(--x,--y,size);
		}else{
			printboard();
		}
	}

	public void drawBottom(int x, int y , int size){
		for (int i=0;i<size ;i++ ) {
				board[x--][y]="&";
			}
		if(--size>0){
			this.drawBottom(--x,--y,size);
		}else{
			printboard();
		}
	}	
	public void drawLeft(int x, int y , int size){
		for (int i=0;i<size ;i++ ) {
				board[x][y--]="&";
			}
		if(--size>0){
			this.drawLeft(++x,++y,size);
		}else{
			printboard();
		}
	}
	public void printboard(){
		for(int i=0;i<board.lenth;i++){
			for (char[] grid : board) {
				System.out.print(grid[i]);
			}
			System.out.println();
		}
	}		
	


}