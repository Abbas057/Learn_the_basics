package java_basics;


public class Math_functions {

	public static void main(String[] args) {
		
	int x= 10,a=2,b=6, y=9;
	//	1. Basic Arithmetic Operations
		
		System.out.println(Math.abs(x));    // Absolute value (|x|)
		System.out.println(Math.max(a, b) ); // Maximum of two numbers
		System.out.println(Math.min(a, b));  // Minimum of two numbers
		
	// 2. Rounding Functions
		
		System.out.println(Math.ceil(x));   // Smallest integer >= x  (rounds up)
		System.out.println(Math.floor(x) );// Largest integer <= x   (rounds down)
		System.out.println(Math.round(x) ); // Rounds to nearest integer
		System.out.println(Math.rint(x) );  // Returns closest double value to x (ties to even)
		
	//	3. Power and Roots
		
		System.out.println(Math.pow(a, b));   // a^b (a raised to power b)
		System.out.println(Math.sqrt(x));     // Square root of x
		System.out.println(Math.cbrt(x));     // Cube root of x

	//	4. Exponential and Logarithmic Functions
		System.out.println(Math.exp(x));    // e^x (exponential)
		System.out.println(Math.log(x));    // Natural log (base e)
		System.out.println(Math.log10(x));  // Log base 10
		System.out.println(Math.log1p(x));  // log(1 + x) accurately for small values of x
		
	//	5. Trigonometric Functions
		
		System.out.println(Math.sin(x));
		System.out.println(Math.cos(x));
		System.out.println(Math.tan(x));

		System.out.println(Math.asin(x));  // Inverse sine
		System.out.println(Math.acos(x));  // Inverse cosine
		System.out.println(Math.atan(x));  // Inverse tangent
		System.out.println(Math.atan2(y, x)); // Returns angle between x-axis and (x, y)

	//	6. Hyperbolic Functions
		
		System.out.println(Math.sinh(x));
		System.out.println(Math.cosh(x));
		System.out.println(Math.tanh(x));

	//	7. Random Numbers
		
		System.out.println(Math.random());   // Returns a random double between 0.0 and 1.0
		
	//	8. Special Constants
		
		System.out.println(Math.PI);    // π = 3.14159...
		System.out.println(Math.E);     // e = 2.718...


		


		

		

	}

}
