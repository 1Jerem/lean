package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
	public static void main(String[] args) throws Exception { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stdin;
		int promoCerise=0;
		int promoBanane=0;
		int promoApple=0;
		int promoMele=0;
		int promoPomme=0;
		int fruit=0;
		int reductionCerise = 20;
		int total = 0;
		while( !(stdin=br.readLine()).equals("bye")){
			String[] fruits = stdin.split(",");
			for(int i=0;i<fruits.length;i++){
				
				if(Pomme.name(stdin)){
					if(stdin.equals("Mele")){
						promoMele ++;
						if(promoMele%2 != 0){
							total = total + Pomme.prix - 150;
						}
						else{
							total = total + Pomme.prix;
						}
					}
					else if( stdin.equals("Apple")){
						promoApple++;
						if(promoApple%3 != 0){
							total = total + Pomme.prix;
						}
						else{
							total = total + Pomme.prix;
						}
					}
					else if( stdin.equals("Pomme")){
						promoPomme ++;
						if(promoPomme%4 != 0){
							total = total + Pomme.prix - 100;
						}
						else{
							total = total + Pomme.prix;
						}
						
					}
					
				}
				else if(stdin.equals("Cerise")){
					promoCerise ++;
					if(promoCerise%2 == 0){
						total = total + Cerise.prix - reductionCerise;
					}else{
						total = total + Cerise.prix;
					}
				}
				else if(stdin.equals("Banane")){
					promoBanane ++;
					if(promoBanane%2 != 0){
						total = total + Banane.prix;
					}
				}
				
				if(fruit%5 == 0){
					total = total - 200;
				}
				fruit ++;
			}
			
			System.out.println("> " + total);
	    }
		System.out.println("FIN");
	}
}
