package org.base;

public class SystemExit {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i==2) {
				System.exit(0);
				
			}
			System.out.println(i);
			
		}		
	}

}
