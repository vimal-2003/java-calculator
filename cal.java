import java.util.*;
import java.lang.*;
public class calculator {
	static float sum(float a , float b){
		float s = a + b ;
		return s;
	}

	
	float sb(float a , float b ){
		float s = a - b;
		return s;
	}

	
	float pro(float a , float b){
		float p = a * b ;
		return p;
	}
	
	float div(float a , float b){
		return a/b;
	}
	
	float sqrt(float a){
		return (float) Math.sqrt(a);
	}
	float curt(float a){
		return (float) Math.cbrt(a);
		}
	void trig(){
		System.out.println("ENTER THE OPERATION\n1. SINE\n2. COS\n3. TAN\n4. COSEC\n5. SEC\n6. COT");
		Scanner in = new Scanner(System.in);
		int	 t = in.nextInt();
		System.out.println("ENTER THE ANGLE IN RADIANS");
		float a = in.nextFloat(); 
		switch(t)
		{
		case 1 : System.out.print("SIN( "+a);
				 System.out.print(" ) = " +Math.sin(a));
				 break;
	    case 2 : System.out.print("COS( "+a);
	    	     System.out.print(" ) = "+Math.cos(a));
	    		 break;
 		case 3 : System.out.print("TAN( "+a);
 			     System.out.print(" ) = "+Math.tan(a));
 				 break;
	    case 4 : System.out.println("COSEC "+a);
	    		 System.out.print( 1.0/Math.sin(a));
	    		 break;
	    case 5 : System.out.println(+1.0/Math.cos(a));
	    		 break;
	    case 6 : System.out.println(+1.0/Math.tan(a));
	    		 break;
	    default :System.out.println("WARNING! SELECT CORRECT OPTION");
		 		 break;
		}
	}

	
	double ln(float a){
		return Math.log(a);
	}
	float pw(float m , float n){
		return (float) Math.pow(m , n);
	}
	double nroot(float x , float y){
		return Math.pow(x , 1.0/y);
	}
	public static void main(String[] args) {
		System.out.println("ENTER THE OPERATION");
		System.out.println("1. SUM\n2. MINUS\n3. PRODUCT\n4. DIVISION\n5. SQUARE_ROOT\n6. CUBE_ROOT\n7. TRIGONOMETRIC_OPERATION");
		System.out.println("8. LOG\n9. POWER\n10. Nth UNDER_ROOT");
		System.out.println("ENTER YOUR CHOICE");
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		calculator cc = new calculator();
		switch(c)
		{
		case 1 : System.out.println("ENTER THE TWO NUMBERS TO BE ADDED");
				 float a1 = in.nextFloat();
				 float a2 = in.nextFloat();
				 double ss = cc.sum( a1 , a2);
				 System.out.println(ss);
				 break;
		case 2 : System.out.println("ENTER THE TWO NUMBERS TO BE SUBSTRACTED");	
				 float s1 = in.nextFloat();
				 float s2 = in.nextFloat();
				 double su = cc.sb( s1 ,s2);
				 System.out.println(su);
				 break;
		case 3 : System.out.println("ENTER THE TWO NUMBERS TO BE MULTIPLIED");	
				 float m1 = in.nextFloat();
				 float m2 = in.nextFloat();
				 double mm = cc.pro(m1 ,m2);
				 System.out.println(mm);
				 break;		
		case 4 : System.out.println("ENTER THE TWO NUMBERS TO BE DIVIED");	
				 float d1 = in.nextFloat();
				 float d2 = in.nextFloat();
				 double dd =cc.div( d1 , d2);
				 System.out.println(dd);
				 break;	
		case 5 : System.out.println("ENTER THE  NUMBER WHOSE SQUARE ROOT TO BE CALCULATED");	
				 float r = in.nextFloat();
				 double sr = cc.sqrt(r);
				 System.out.println(sr);
				 break;
		case 6 : System.out.println("ENTER THE NUMBER WHOSE CUBE ROOT IS TO BE FOUND");	
				 float cr = in.nextFloat();
				 double cu = cc.curt( cr );
				 System.out.println(cu);
				 break;
		case 7 : cc.trig();
				 break;
		case 8 : System.out.println("ENTER THE NUMBER WHOSE LOG IS TO BE FOUND");
				 float l = in.nextFloat();
				 double ll =cc.ln(l);
				 System.out.println(+ll);
		         break;
		case 9 : System.out.println("ENTER THE VALUES OF m AND n IN m^n");
		         float m = in.nextFloat();
		         float n = in.nextFloat();
		         double pp = cc.pw(m, n);  
		         System.out.println(+pp);
		         break;
		case 10: System.out.println("ENTER THE NUMBER AND THEN ITS Nth UNDER ROOT");
				 float n1 = in.nextFloat();
			     float n2 = in.nextFloat();
			     double nn = cc.nroot(n1, n2);
			     System.out.println("n1 ^n2 = " +nn);
			     break;
		default :System.out.println("WARNING !ENTER CORRECT CHOICE");
				 break;     
		}
	}
}
