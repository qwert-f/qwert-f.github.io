package example4.hello;

import hello.Cat;
public class PersianCat extends Cat {
	public String meow() {
		super.meow();
		System.out.println("I am a Persian cat");
		return "";
	}
}