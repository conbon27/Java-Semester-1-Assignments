package ifsandElses;

import java.util.Formatter;

public class ForTable {

	public static void main(String[] args) {
			
		final double PRICE_PER_SQ_FT = 19.00; // €19 per sqft
		double price;
		Formatter formatter = new Formatter(System.out);
		
		for (int i=5; i<=25; i+=5){
			formatter.format ("%8d ", i);
		}
		System.out.println();
		
		for (int width = 11; width <=20; width++){
			System.out.print (" " + width);
			
			for (int length = 5; length <=25; length+=5){
				price = width * length * PRICE_PER_SQ_FT;
				formatter.format ("%8.2f ", price);
				// System.out.format("%8.2f ", price);
		}
		System.out.println(" ");
	}
	formatter.close();
	}
}
