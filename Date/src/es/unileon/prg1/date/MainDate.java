package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow, lastMethodDate, prueba1, prueba2;
		today = new Date(20, 4, 2018);
		tomorrow = new Date(21, 4, 2018);
		lastMethodDate = new Date(8, 4, 2018); //La usaremos en el último para comprobar que funciona
		
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthIf(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayIf(tomorrow));
		
		//Comprobaciones iniciales del método del mismo año, mes y día, isSameYear(), isSameMonth(), isSameDay();

		prueba1 = new Date(2, 7, 2015);
		prueba2 = new Date(24, 7, 2015); //Simples pruebas para ampliar posibilidades

		System.out.println(prueba1 + " isSame " + prueba2 + "? " + prueba1.isSameIf(prueba2));
		//Comprobación del método de la misma fecha (día, mes, año), isSame();

		//Lo mismo pero sin el if:
		System.out.println(today + " isSameYear " + tomorrow + "? (sin If) " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? (sin If) " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? (sin If) " + today.isSameDay(tomorrow));
		System.out.println(prueba1 + " isSame " + prueba2 + "? (sin If) " + prueba1.isSameIf(prueba2));


		System.out.println("Mes? prueba1: "+prueba1+" : "+prueba1.getMonthName());
		System.out.println("Mes? prueba2: "+prueba2+" : "+prueba2.getMonthName());
		//Comprobación del método de los meses, getMonthName();
	
		System.out.println("El día "+prueba1+" es correcto?? "+prueba1.isDayRight());
		//Comprobación del método de la revision de los dias, isDayOfMonthOK();
		
		System.out.println("¿Estación del mes de "+prueba1+" ?: "+prueba1.getSeasonName());
		//Comprobación de las estaciones con el método getMonthSeason();

		System.out.println("¿Días que faltan hasta el final del mes? "+tomorrow+" : "+tomorrow.getDaysLeftOfMonth());
		//Comprobación de los días que faltan hasta el final del mes, método daysLeft();
		
		System.out.println("¿Meses con los mismos días que "+today+" ?: "+today.getMonthsSameDays());
		//Comprobación de los meses que tienen los mismos días, método sameMonthsDays();
		
		System.out.println("¿Meses que faltan hasta el final del año? para "+today+" : "+today.getMonthsLeft());
		//Comprobación de los meses que faltan, método monthsLeft();
		
		System.out.println("¿Días hasta el inicio del año? para "+prueba1+" : "+prueba1.daysSinceFirstDay());
		//Comprobación de los días que van desde el actual hasta el primero del año, método daysSinceFirstDay();
		
		System.out.println("Intentos para generar una fecha aleatoria igual (while): "+prueba1.attemptsRandomDate());
		//Comprobación del método para generar una fecha aleatoria igual a la dada en el main, este con While;

		System.out.println("Intentos para generar una fecha aleatoria igual (do-while): "+prueba1.attemptsRandomDateDo());
		//Comprobación del método para generar una fecha aleatoria igual a la dada en el main, este con Do-While;
		
		System.out.println("Método que imprime una fecha: "+prueba1.printDate());
		//Comprobación del método que imprime una fecha;

		System.out.println("En 2018, el día "+lastMethodDate+" es "+lastMethodDate.getWeekDay());
		//Comprobación del método que dice qué día de la semana es, getWeekDay();
	}

}
