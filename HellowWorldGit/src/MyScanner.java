import java.util.Scanner;

/**
 * Manages user input.
 * @author lbrandon
 *
 */
public class MyScanner {

	private Scanner scanner;
	
	/**
	 * Gets user input and returns it.
	 * @return user input
	 */
	public String getInput() {
		this.scanner = new Scanner(System.in);
		String input = this.scanner.nextLine();
		this.scanner.close();
		
		return input;
	}
}
