package bmi;

public class BMI {
	private double height;
	private double weight;
	private double bmi;
	private String interpretation;
	
	public BMI (double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public BMI (double weight, double height, double bmi, String interpretation) {
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.interpretation = interpretation;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double weight, double height) {
		this.bmi = weight/(height*height);
	}
	public String getInterpretation() {
		return interpretation;
	}
	public void setInterpretation(double bmi) {
		if(bmi<18.5) {
			this.interpretation="Underweight";
		}else if (bmi<25.0) {
			this.interpretation="Normal";
		}else if(bmi<30) {
			this.interpretation="Overweight";
		}else {
			this.interpretation="Obese";
		}
	}
}
