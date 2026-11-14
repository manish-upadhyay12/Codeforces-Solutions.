 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	     int no_of_collection = 0;
	    while(n>0){
	        String s  = sc.nextLine();
	       
	        if(s.equals("Tetrahedron")){
	            no_of_collection+=4;
	    }
	    else if(s.equals("Cube")){
	        no_of_collection+=6;
	    }
	    else if(s.equals("Octahedron")){
	        no_of_collection+=8;
	    }
	     else if(s.equals("Dodecahedron")){
	        no_of_collection+=12;
	    }
	    else{
	        no_of_collection+=20;
	
	}
 
	n--;
}
System.out.println(no_of_collection);
	}
}
 
 
 
 
 
 
 
 
 
 
 
 