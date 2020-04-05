package controlflow;

public class SwitchStatement {

	public static void main(String[] args) {
		byte a = 30;
		final byte b=40;
//	    b=40;
		final byte c = 50;
		switch (-128) { 
//		System.out.println("bhaiya");
		 
	
		case 10: {
			System.out.println("bhaiya");
			break;
		}
		case -128: {
			System.out.println("Anjali");
			break;
		}
//			case -129:{
//				System.out.println("Shail");
//				break;
//			}
		case 30: {
			System.out.println("Anu");
			System.out.println("Dubey");
			break;
		}
		default: {
			System.out.println("sagar");
//			break;// it will execute case b also when default case run.
		}
		case (b): {
			System.out.println("Ambe");
			break;
		}
		case c: {
			System.out.println("Hii");
			break;
		}
		
		  /**default:{ System.out.println("Jatav"); break; }*/
		 
		}
//		System.out.println("Hello");

	}

	/*enum WeekDays {
		SUN, MON, TUE;
	}*/

}
