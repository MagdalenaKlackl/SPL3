
public class Taschenrechner {

	public static void main(String[] args) {
		int zahl1 = Integer.parseInt(args[0]);
		int zahl2 = Integer.parseInt(args[2]);

		
		if (args[1].equals("+")) {
			int addieren = zahl1 + zahl2;
			System.out.println(addieren);
		}
	

		if (args[1].equals("-")) {
			int subtrahieren = zahl1 - zahl2;
			System.out.println(subtrahieren);
		}
	
		if (args[1].equals("*")) {
			int mal = zahl1 * zahl2;
			System.out.println(mal);
		}
	
	
		if (args[1].equals("/")) {
			int dividieren  = zahl1 / zahl2;
			System.out.println(dividieren);
		}
	}
	

}
