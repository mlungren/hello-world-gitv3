
public class HellowWorld {

	public static void main(String[] args) {
		MyPrinter.print(
				"Welcome to Hello world project in git! I am an awesome professor for 591 :)");
		MyPrinter.print("Tell me your name: ");
		
		MyScanner myScanner = new MyScanner();
		String input = myScanner.getInput();
		MyPrinter.print("Hello " + input + "!");

	}

}
