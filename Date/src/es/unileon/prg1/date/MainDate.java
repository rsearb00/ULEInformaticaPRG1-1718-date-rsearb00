package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow, prueba1, prueba2;
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		/*prueba1 = new Date(23, 4, 2015);
		prueba2 = new Date(23, 4, 2015);

		System.out.println(prueba1 + " isSame " + prueba2 + "? " + prueba1.isSame(prueba2));
		*/
	}

}
