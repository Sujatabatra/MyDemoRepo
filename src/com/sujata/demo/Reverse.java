package com.sujata.demo;

public class Reverse {

	private int number,reverse;

	private int generateReverse(){
		int rev=0;
		while(number!=0){
			int remainder=number%10;
			rev=rev*10+remainder;
			number=number/10;
		}
		return rev;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		reverse=generateReverse();
		return reverse;
	}

	
}
