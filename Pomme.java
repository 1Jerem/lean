package hello;

public class Pomme {

	public static int prix = 100;
	public static String[] name= {"Pomme","Apple","Mele"};
	
	public static Boolean name(String nametest){
		for(int i=0;i<name.length;i++){
			if(name[i].equals(nametest)){
				return true;
			}
		}
		return false;
		
	}


}
