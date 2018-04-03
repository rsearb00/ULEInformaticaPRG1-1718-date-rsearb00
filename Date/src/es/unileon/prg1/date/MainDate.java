package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow, prueba1, prueba2;
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		//Comprobación inicial del método del mismo año, isSameYear;

		prueba1 = new Date(21, 4, 2015);
		prueba2 = new Date(24, 5, 2015);

		System.out.println(prueba1 + " isSame " + prueba2 + "? " + prueba1.isSame(prueba2));
		//Comprobación del método de la misma fecha (día, mes, año), isSame;

		System.out.println("Mes? (prueba1): "+prueba1.getMonthName());
		System.out.println("Mes? (prueba2): "+prueba2.getMonthName());
		//Comprobación del método de los meses, getMonthName();
	
		System.out.println("El día es correcto?? "+prueba1.isDayOfMonthOK());
		//Comprobación del método de la revision de los dias, isDayOfMonthOK();
		
		System.out.println("¿Estación del mes?: "+prueba1.getMonthSeason());
		//Comprobación de las estaciones con el método getMonthSeason();

		System.out.println("¿Meses que faltan hasta el final del año?: "+prueba1.monthsLeft());
		//Comprobación de los meses que faltan, método monthsLeft();

		System.out.println("Método propio para imprimir la fecha"+prueba1.printDate());
		//Comprobación de los meses que faltan, método monthsLeft();
		
		
	}

}
