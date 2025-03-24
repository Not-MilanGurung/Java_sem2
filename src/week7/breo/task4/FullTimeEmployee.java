package week7.breo.task4;

class FullTimeEmployee extends Employee {

	public double calculateSalary(){
		return 20000.0;
	}

	public double calculateSalary(double basicSalary) {
		return basicSalary * 12.0;
	}

	public double calculateSalary(double basicSalary, double bonus){
		return (basicSalary + bonus) * 12.0;
	}
	
}

class PartTimeEmployee extends Employee {
	public double calculateSalary(){
		return 5000.0;
	}

	public double calculateSalary(double basicSalary){
		return basicSalary;
	}
}
