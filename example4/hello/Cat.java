package example4.hello;

public class Cat {
	private double weight;
	private String gender;
	// public String gender;

	public void setGender(String s) {
		gender = s;
	}

	public void setWeight(double w) {
		weight = w;
	}

	public String getGender() {
		return gender;
	}

	public double getWeight() {
		return weight;
	}

	public String meow() {
		System.out.println("meow meow meow");
		return "";
	}
}



