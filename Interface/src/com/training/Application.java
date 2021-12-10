package com.training;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.model.Professor;
import com.training.model.Student;

public class Application {

		public static void printResult(Conditional condition) {
			
			System.out.println(condition.test());
			
		}
	public static void printValues(Function[] objects) {
		for(Function eachFunction : objects) {
			   System.out.println(eachFunction.apply(50));
		}
	}
	public static void main(String[] args) {

			Function usdToInr = new CurrencyConverter();
			Function celTofar = new TempeConverter();
			
			Function[] functions = {usdToInr,celTofar};
			
			printValues(functions);
			Student ram = new Student(100,60);
			Professor kanna = new Professor(202,"mca");
			printResult(kanna);
			printResult(ram);
			
	}

}
