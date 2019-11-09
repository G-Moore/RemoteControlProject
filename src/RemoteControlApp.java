import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		turnOn();
		String power = sc.next();

		while (!power.equals("ON")) {
			turnOn();
			power = sc.next();
		}
		if (power.equals("ON")) {
			turningOn();
		}
		System.out.println("Please enter the button number.");
		String button = "";
		do {
			button = sc.next();
			if (button.equals("OFF")) {
				off();
			break;
			}
			switch (button) {
				case "0":
					pressButton();
					break;
				case "1":
					pressButton();
					break;
				case "2":
					pressButton();
					break;
				case "3":
					pressButton();
					break;
				case "4":
					pressButton();
					break;
				case "5":
					pressButton();
					break;
				case "6":
					pressButton();
					break;
				case "7":
					pressButton();
					break;
				case "8":
					pressButton();
					break;
				case "9":
					pressButton();
					break;
				default:
					System.out.println("Command not recognized.");
					break;
			}
		} while (!button.equals("OFF"));


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