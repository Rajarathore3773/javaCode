package com.zensar.test;
class Demo1{
	public int sum(int a,int b) {
		return a*b;
	}
}
public class Demo extends Demo1{
	public  int sum(int a,int b) {
		return super.sum(a, b);
	}
	public  int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String []arg) {
		Demo1 d=new Demo();
		System.out.println(d.sum(2,4));
	}

}
