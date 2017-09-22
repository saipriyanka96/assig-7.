package implicit;
//implicit type is a automatic type conversion by the compliers.
//package is a grouping of related types providing access
//protection and name space management.
public class Implicit {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//taking the a class implicit type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=10;//we are taking byte data type and initialized the variable as 15 
		int y=20;//and another variable of integer data type which is greater than 
		//byte data type
		System.out.println("x:"+x+"\n y:"+y);
		x=(byte)y;
		//here we are converting integer value into byte
		System.out.println("int to byte:"+x);
		y=x;//value of int is equal to byte
		System.out.println("byte to int:"+y);
		int z=30;//we are taking another integer
		float a=z;//and float value. integer value is equal to float
		System.out.println("int to float:"+z);
		short b=(short)a;//taking another value in short and converting it from integer to short
		System.out.println("float to short:"+b);
	}

}
