package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow, tomorrowLand, prueba1, prueba2;
		today = new Date(20, 3, 2018);
		tomorrow = new Date(20, 1, 2018);
		tomorrowLand = new Date(20, 1, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		//Comprobación inicial del método del mismo año, isSameYear;

		prueba1 = new Date(2, 7, 2015);
		prueba2 = new Date(24, 7, 2015);

		System.out.println(prueba1 + " isSame " + prueba2 + "? " + prueba1.isSame(prueba2));
		//Comprobación del método de la misma fecha (día, mes, año), isSame;

		System.out.println("Mes? (prueba1): "+prueba1.getMonthName());
		System.out.println("Mes? (prueba2): "+prueba2.getMonthName());
		//Comprobación del método de los meses, getMonthName();
	
		System.out.println("El día es correcto?? "+prueba1.isDayOfMonthOK());
		//Comprobación del método de la revision de los dias, isDayOfMonthOK();
		
		System.out.println("¿Estación del mes?: "+prueba1.getMonthSeason());
		//Comprobación de las estaciones con el método getMonthSeason();

		System.out.println("¿Días que faltan hasta el final del mes?: "+tomorrow.daysLeft());
		//Comprobación de los días que faltan hasta el final del mes, método daysLeft();
		
		System.out.println("¿Meses con los mismos días?: "+tomorrow.sameMonthsDays());
		//Comprobación de los meses que tienen los mismos días, método sameMonthsDays();
		
		System.out.println("¿Meses que faltan hasta el final del año?: "+tomorrow.monthsLeft());
		//Comprobación de los meses que faltan, método monthsLeft();
		
		System.out.println("¿Días hasta el inicio del año?: "+tomorrowLand.daysSinceFirstDay());
	//Comprobación de los días que van desde el actual hasta el primero del año, método daysSinceFirstDay();
		
		System.out.println("Intentos para generar una fecha aleatoria igual: "+prueba1.attemptsRandomDateDo());
		//System.out.println("Método propio para imprimir la fecha"+prueba1.printDate());
		//Comprobación de los meses que faltan, método monthsLeft();

		System.out.println(prueba1.printDate());
		System.out.println(prueba1.aDate());
		//Comprobación de los meses que faltan, método monthsLeft();
	}

}
