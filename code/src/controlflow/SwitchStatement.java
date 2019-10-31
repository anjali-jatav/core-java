package controlflow;

public class SwitchStatement {

	public static void main(String[] args) {
		byte a = 30;
		final int b = 40;
//		b=40;
		final int c = 50;
		switch (WeekDays) {
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
		}
		case b: {
			System.out.println("Ambe");
			break;
		}
		case c: {
			System.out.println("Hii");
			break;
		}
		/**
		 * default:{ System.out.println("Jatav"); break; }
		 **/
		}
		System.out.println("Hello");

	}

	enum WeekDays {
		SUN, MON, TUE;
	}

}
