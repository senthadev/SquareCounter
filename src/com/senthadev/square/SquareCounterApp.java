package com.senthadev.square;

public class SquareCounterApp {

	public long calculateSquares(int n){
		long count = 1;
		for(int i=n; i>= 2; i--){
			count += (long)(i*i);
		}
		return count;
	}
	
	public static void main(String args[]){
		SquareCounterApp app = new SquareCounterApp();
		System.out.println("n=1 ->" + app.calculateSquares(1));
		System.out.println("n=2 ->" + app.calculateSquares(2));
		System.out.println("n=3 ->" + app.calculateSquares(3));
		System.out.println("n=4 ->" + app.calculateSquares(4));
		System.out.println("n=10 ->" + app.calculateSquares(10));
		System.out.println("n=100 ->" + app.calculateSquares(100));
	}
}
