package week3.day1;

public class Calculator {
public void add(int a, int b) {
	// TODO Auto-generated method stub
System.out.println(a+b);
}
public void add(int a, int b, int c) {
	// TODO Auto-generated method stub
System.out.println(a+b+c);
}
public void mul(int a, int b) {
	// TODO Auto-generated method stub
System.out.println(a*b);
}
public void mul(int a, int b, double c) {
	// TODO Auto-generated method stub
System.out.println(a*b*c);
}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	calc.add(2, 3);
	calc.add(2, 3, 4);
	calc.mul(2, 4);
	calc.mul(5, 2, 10);
}
}
