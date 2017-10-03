package br.edu.univas.si8.ta.fibcalc.lib;

public class Result {

	 private static int lo;
	 private static int hi;
	
	
	public static int getLo() {
		return lo;
	}


	public static void setLo(int lo) {
		Result.lo = lo;
	}


	public static int getHi() {
		return hi;
	}


	public static void setHi(int hi) {
		Result.hi = hi;
	}


	public static int fibonacci(int n) {
	      lo = 0;
	      hi = 1;
	      for (int i = 0; i < n; i++) {
	          hi = lo + hi;
	          lo = hi - lo;
	      }
	      return lo;
	  }	
	
}
