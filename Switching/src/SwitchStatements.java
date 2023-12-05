
public class SwitchStatements {
	public enum Day {SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;}
	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			switch(i) {
//			
//			case 1: 
//				System.out.println("one");
//				break;
//			
//			case 2:
//				System.out.println("two");
//				break;
//			default : 
//				System.out.println("number");
//			}
//			if (i == 4) {
//				break;
//			}
//		int num = 0;
//		while (true) {
//			System.out.println("before" + num);
//			if (num == 3) {
//				num++;
//				continue;
//			}
//			if(num == 7) {
//				break;
//			}
//			System.out.println("After" + num);
//			num++;
//		}
		
//		String food = "apple";
//		
//		switch(food) {
//		case "apple": 
//		case "banana":
//		case "tomato":
//			System.out.println("fruit");
//			break;
//		case "carrot":
//		case "peas":
//		case "broccoli" :
//			System.out.println("veggies");
//			break;
//		default:
//			System.out.println("not a fruit or veggie");
//		}
		
		int num2 = 6;
		String food =  num2 > 5 ? "carrot" : "apple";
		System.out.println(food);
		
		int numLetters = 0;
	    Day day = Day.WEDNESDAY;
	    switch (day) {
	        case MONDAY:
	        case FRIDAY:
	        case SUNDAY:
	            numLetters = 6;
	            break;
	        case TUESDAY:
	            numLetters = 7;
	            break;
	        case THURSDAY:
	        case SATURDAY:
	            numLetters = 8;
	            break;
	        case WEDNESDAY:
	            numLetters = 9;
	            break;
	        default:
	            throw new IllegalStateException("Invalid day: " + day);
	    }
	    System.out.println(numLetters);
	}
}