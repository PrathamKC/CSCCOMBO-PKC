import java.util.ArrayList;
import java.util.List;

public class farm {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[5]; // new array size 5
		List<Animal> anim = new ArrayList<>(); // new array list
		
		animals[0] = new Cat(1,2,"Grey");// adding onto array
		anim.add(new Cat(1,2,"Grey")); // adding onto array list
		
		animals[1] = new Cat(2,1,"Orange");
		anim.add(new Cat(2,1,"Orange"));
		
		animals[2] = new Horse(6,12,30);
		anim.add(new Horse(6,12,30));

		animals[3] = new Dog(1,2, false);
		anim.add(new Dog(1,2, false));
		
		animals[4] = new Horse(6,15,25);
		anim.add(new Horse(6,15,25));
		
		
		for(int i = 0; i < animals.length; i++)
		{
			System.out.println(animals[i].getHeight());
		}
				
		for(Animal ani : animals) //For the list
		{
			System.out.println(ani.makeNoise());
		}

//		Animal felix2= new Cat(1.5,1.0,"Grey");
//		
//		if(felix2.equals(felix))
//		{
//			System.out.println("same");
//		}
//		else {
//			System.out.println("diff");
//		}

	}
}