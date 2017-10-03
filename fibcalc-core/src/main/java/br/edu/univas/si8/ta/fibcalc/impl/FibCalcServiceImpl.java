package br.edu.univas.si8.ta.fibcalc.impl;



import br.edu.univas.si8.ta.fibcalc.lib.FibCalcImpl;
import br.edu.univas.si8.ta.gibcalc.api.FibCalcService;
import br.edu.univas.si8.ta.gibcalc.api.Result;


public class FibCalcServiceImpl implements FibCalcService{

	
	
	@Override
	public Result fibcalc(int num) {
		int fib = FibCalcImpl.fibonacci(num);
		return new Result().withNum(num).withFib(fib);
	}

	
}