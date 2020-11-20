package world;

public class Dog {
		// public int age;
		private int age;
		public String gender;
		// private String gender;
		public void setGender(String s) {
			gender = s;
		}
		public void setAge(int m) {
			age = m;
		}
		public String getGender() {
			return gender;
		}	
		public int getAge() {
			return age;
		}
		public String bark(int m) {
			if(m<=3) {
				return "yap yap yap";
			}
			else {
				return "woof woof woof";
			}
		}
}
