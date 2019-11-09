import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		turnOn();
		String power = sc.next();
	
	
		while (!power.equals("ON")) {
				turnOn();
				power = sc.next();
			} if (power.equals("ON")) {
				turningOn();
			}
	}
	public static void turnOn() {
		System.out.print("To begin, turn on the remote control. ");
	}
	public static void turningOn() {
		System.out.println("TURNING ON...");
	// TODO add pressButton() method
}
}