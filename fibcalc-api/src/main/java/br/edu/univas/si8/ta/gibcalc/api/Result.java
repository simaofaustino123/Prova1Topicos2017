package br.edu.univas.si8.ta.gibcalc.api;

public class Result {

		
		private int num;
		private int fib;
		
		public int getNum() {
			return num;
		}
		
		public void setNum(int num) {
			this.num = num;
		}
		
		public Result withNum (int num) {
			this.num = num;
			return this;
		}
		
		public int getFib() {
			return fib;
		}
		
		public void setFib(int fib) {
			this.fib = fib;
		}
		
		public Result withFib(int fib) {
			this.fib = fib;
			return this;
		}
		
		
	}

