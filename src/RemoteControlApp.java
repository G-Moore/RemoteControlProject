public class RemoteControlApp {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		turnOn();
		String power = sc.next();
		// Initiate user interaction, loop until "ON" provided
		while (!power.equalsIgnoreCase("ON")) {
			turnOn();
			power = sc.next();
		}
		// Prompt to enter a number and initiate until "OFF" provided
		turningOn();
		System.out.print("Please enter the button number. ");
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
					System.out.print("Command not recognized. ");
					break;
			}
		} while (!button.equalsIgnoreCase("OFF"));
		sc.close();
	}

	// Initial prompt and instructions
	public static void turnOn() {
		System.out.print("To begin, turn on the remote control." + " \n    Enter \" ON \" to power remote. ");
	}

	// Activates when "ON" provided
	public static void turningOn() {
		System.out.println("TURNING ON...");
	}

	// Activates when button number provided
	public static void pressButton() {
		System.out.print("BOOP! ");
	}

	public static void off() {
		System.out.println("TURNING OFF...");

	}
}