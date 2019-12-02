
public class HellowWorld {

	public static void main(String[] args) {
		System.out.println(
				"Welcome to Hello world project in git!");
		System.out.println("Tell me your name: ");
		
		MyScanner myScanner = new MyScanner();
		String input = myScanner.getInput();
		System.out.println("Hello " + input + "!");

	}

}
