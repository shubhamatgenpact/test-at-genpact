package com.genpact.day2;

import java.util.Collection;

import java.util.LinkedList;

class A {
	int a;
	int b;

	public A() {

	}

	public A(int a, int b) {
		this.a = this.a;
		this.b = this.b;
	}
}

class B extends A {
	int c;

	public B() {

	}

	public B(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
}

class C extends B {
	int d;

	public C(int d) {
		this.d = d;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
	}

}

/*
person is having account in SBI and in Access bank get the details of SBI get the details of SBI
and Access bank 
*/
