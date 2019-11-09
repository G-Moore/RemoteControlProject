public class RemoteControlApp {

	public static void main(String[] args) {
		java .util.Scanner sc = new java.util.Scanner(System.in);
		turnOn();
		String power = sc.next();

		while (!power.equalsIgnoreCase("ON")) {
			turnOn();
			power = sc.next();
		}

		System.out.println("Please enter the button number.");
		String button = "";
		do {
			button = sc.next();
			if (button.equalsIgnoreCase("OFF")) {
				off();
				break;
			}
			switch (button) {
				case "0":				
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					pressButton();
					break;
				default:
					System.out.println("Command not recognized.");
					break;
			}
		} while (!button.equalsIgnoreCase("OFF"));
		sc.close();
	}

	public static void turnOn() {
		System.out.print("To begin, turn on the remote control. ");
	}

	public static void turningOn() {
		System.out.println("TURNING ON...");
	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}

	public static void off() {
		System.out.println("TURNING OFF...");

	}
}