import hello.Cat;
import world.Dog;
import java.util.*;

public class Animal {
	public static void main(String args[]) {
		Cat helloKity = new Cat();
		helloKity.setWeight(10);
		helloKity.setGender("Male");
		System.out.print("\nCat gender:"+helloKity.getGender()+'\n');
		System.out.print("Cat weight:"+helloKity.getWeight()+" pound");
		System.out.print('\n'+helloKity.meow()+'\n');

		Dog dog[] = new Dog[6];
		for(int i=0;i<dog.length;i++) {
			int randomNumber = (int)(Math.random() * (6 + 1 -1) + 1);
			dog[i] = new Dog();
			dog[i].setAge(randomNumber);
			System.out.print("\n");	// in order to beauty output
			if (randomNumber % 2 == 0) {
				dog[i].setGender("Male");
				System.out.printf("dog %d gender is:"+dog[i].getGender()+'\n',i+1);
			}
			else {
				dog[i].setGender("Female");
				System.out.printf("dog %d gender is:"+dog[i].getGender()+'\n',i+1);
			}
			System.out.printf("dog %d age is:"+dog[i].getAge()+" month\n",i+1);
			System.out.print(dog[i].bark(randomNumber)+'\n');
		}
	}
}
