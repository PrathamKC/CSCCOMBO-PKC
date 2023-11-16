public class Driver 
{
	public static void main(String[] args)
	{
		Person per = new Person("me", "hi", 12, 22.0);
		per.getNewCar().drive(35);
		System.out.println(per.getNewCar());
//		Car myCar = new Car();
//		
//		Car yourCar = new Car("Red", 42, 22.0, 4, 1);
//		yourCar.setWheels(15, "Alloy");
//		yourCar.setSWheel(12, "Leather");
//		
//		//System.out.println(yourCar.getColor() + " " + yourCar.getMileage() + " " + yourCar.getGas());
//		
//		yourCar.setColor("Green");
//		yourCar.setamtOfGas(30.0);
//		System.out.println(yourCar);
//		yourCar.drive(49);
//		System.out.println(yourCar);
		
		//Person x = new Person("me", "hi", 12, 22.0);
		//System.out.println(x);
	}
}