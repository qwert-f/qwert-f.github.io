package hello;

public class Cat {
		private double weight;
		private String gender;
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
			return "meow meow meow";
		}
}
