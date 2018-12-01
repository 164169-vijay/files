package com.vijay.LamdaAssignment;

public class CalculatorJava8 {

	public static void main(String[] args) {
		
		
		arithmetic add=(x,y)->{    return x+y ;    };	
		
	    System.out.println(add.calculation(555, 55));
		
	
	
		arithmetic sub=(x,y)->{    return x-y ;    };
		
		System.out.println(sub.calculation(555, 55));
		
		
		
		arithmetic multi=(x,y)->{    return x*y ;    };
		
		System.out.println(multi.calculation(555, 55));
		
		
		
		arithmetic div=(x,y)->{    return x/y ;    };
		
		System.out.println(div.calculation(555, 55));

	}
	
	interface arithmetic{
		
      public  float	calculation(float a,float b);
		
	}
}
