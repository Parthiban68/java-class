package kgisl;

public class First {
	
	public static void main(String args[]) {
//		System.out.println("poda summar muchi kumar uh albi");
		
		String number [] = {"banan","helloo"};
		
		String word[]= new String[2];
		
		word[0]="apple";
		word[1]="orange";
		
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<word.length; j++) {
				if(word[j] == "apple") {
					System.out.println("it is apple");
				}else {
					System.out.println("not a apple");
				}
				
				System.out.println(word[j]);
			}
			System.out.println(number[i]);
			
		}
		
	}

}
