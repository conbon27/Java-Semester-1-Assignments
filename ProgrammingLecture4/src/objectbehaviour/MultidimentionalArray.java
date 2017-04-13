package objectbehaviour;

public class MultidimentionalArray {

	public static void main(String[] args) {
			int [] [] a2d = new int [4] [2];
			
			for(int i=0; i < a2d.length; i++){
				for(int j=0; j < a2d[i].length; j++){
					a2d[i][j]=(int)(Math.random()*10);
				}
			}
			
			for(int i=0; i < a2d.length; i++) {
				for(int j=0; j < a2d[i].length; j++) {
					System.out.print(a2d[i][j] + "");
				}
			System.out.println();
			}
	}
}
