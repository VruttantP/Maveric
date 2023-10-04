package com.java.training;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Complex {

	private int real;
	private int imag;

	// Default Constructor

	public Complex() {
		System.out.println("Default constructor called");
		real = 0;
		imag = 0;
	}

	// Parameterised Constructor

	public Complex(int real, int imag) {
		System.out.println("Parameterised constructer called");
		this.real = real;
		this.imag = imag;
	}	

	public void showComplexValues() {
		System.out.println("Complex values are "+real+" "+imag);
	}
	
	public String toString() {
		return "Complex values are "+real+" "+imag;
	}

	public void acceptComplexValues() throws NumberFormatException, IOException {
		
//		BufferedRedaer	//
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Enter values for real");
//		this.real = Integer.parseInt(input.readLine());
//		
//		System.out.println("Enter values for imag");
//		this.imag = Integer.parseInt(input.readLine());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for real");
		this.real = sc.nextInt();
		
		System.out.println("Enter values for imag");
		this.imag = sc.nextInt();
		
//		this.real = Integer.parseInt(JOptionPane.showInputDialog("Enter first value"));
//		this.imag = Integer.parseInt(JOptionPane.showInputDialog("Enter second value"));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Complex c1 = new Complex();
		c1.showComplexValues();
		
		Complex c2 = new Complex(100,200);
		c2.showComplexValues();
		
		Complex c3 = new Complex();
		c3.acceptComplexValues();
		System.out.println(c3);
		
		JOptionPane.showMessageDialog(null, "Values are "+ c3.real +" "+ c3.imag);
//		c3.showComplexValues();
//		System.out.println(c1);
//		c1.showComplexValues();
		//int i;
//		for (int i = 0;i < 10; i ++) {
//			System.out.println("I:"+i);
//		}

	}

}