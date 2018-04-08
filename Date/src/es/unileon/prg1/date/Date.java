package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}

	public int getDay(){
		return this.day;
	}

	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	
	boolean isSameMonth(Date another){
		if ( this.month == another.getYear() ){
			return true;
		}
		return false;
	}

	boolean isSameDay(Date another){
		if ( this.day== another.getDay() ){
			return true;
		}
		return false;
	}
	
	boolean isSame(Date another){
		if (( this.day == another.getDay())&&( this.month == another.getMonth())&&( this.year == another.getYear())){
			return true;
		}
		return false;
	}

	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public String getMonthName(){
		String name;
	
		switch(month){
			case 1:
				name = "Enero";
			break;
	
			case 2:
				name = "Febrero";
			break;
		
			case 3:
				name = "Marzo";
			break;
		
			case 4:
				name = "Abril";
			break;
		
			case 5:
				name = "Mayo";
			break;
	
			case 6:
				name = "Junio";
			break;
		
			case 7:
				name = "Julio";
			break;
		
			case 8:
				name = "Agosto";
			break;
		
			case 9:
				name = "Septiembre";
			break;
	
			case 10:
				name = "Octubre";
			break;
		
			case 11:
				name = "Noviembre";
			break;
			
			case 12:
				name = "Diciembre";
			break;

			default:
				name = "Mes incorrecto";
		}
		return name;
	}
	boolean isDayOfMonthOK(){
		if ((this.month == 1)||(this.month == 3)||(this.month == 5)||(this.month == 7)||(this.month == 8)||(this.month == 10)||(this.month == 12)){
			if ((this.day >0)&&(this.day <=31)){
				return true;
			}
		}

		else if ((this.month == 4)||(this.month == 6)||(this.month == 9)||(this.month == 11)){
			if ((this.day >0)&&(this.day <=30)){
				return true;
			}
		}

		else if (this.month == 2){
			if ((this.day >0)&&(this.day <=28)){
				return true;
			}
		}
		return false;
	}

	public String getMonthSeason(){
		String season;
	
		switch(month){
			case 1:
			case 2:	
				season = "Invierno (Hemisferio Norte) / Verano (Hemisferio Sur)"; 
			break;
			case 3:
				if(this.day <=20){
					season = "Invierno (Hemisferio Norte) / Verano (Hemisferio Sur)"; 
				}
				else{
					season = "Primavera (Hemisferio Norte) / Otoño (Hemisferio Sur)"; 
				}
			break;
		
			case 4:
			case 5:
				season = "Primavera (Hemisferio Norte) / Otoño (Hemisferio Sur)"; 
			break;
	
			case 6:
				if(this.day <=20){
					season = "Primavera (Hemisferio Norte) / Verano (Hemisferio Sur)"; 
				}
				else{
					season = "Verano (Hemisferio Norte) / Invierno (Hemisferio Sur)"; 
				}
			break;
		
			case 7:
			case 8:
				season = "Verano (Hemisferio Norte) / Invierno (Hemisferio Sur)"; 
			break;
		
			case 9:
				if(this.day <=20){
					season = "Verano (Hemisferio Norte) / Invierno (Hemisferio Sur)"; 
				}
				else{
					season = "Otoño (Hemisferio Norte) / Primavera (Hemisferio Sur)"; 
				}
			break;
	
			case 10:
			case 11:
				season = "Otoño (Hemisferio Norte) / Primavera (Hemisferio Sur)"; 
			break;
			
			case 12:
				if(this.day <=20){
					season = "Otoño (Hemisferio Norte) / Primavera (Hemisferio Sur)"; 
				}
				else{
					season = "Invierno (Hemisferio Norte) / Verano (Hemisferio Sur)"; 
				}
			break;

			default:
				season = "Mes incorrecto, estación imposible";
		}
		return season;
	}

	public String monthsLeft(){
		StringBuffer months;
		months = new StringBuffer();
		for(int i = this.month; i<=12; i++){
			months.append("\n");
			months.append(this.getMonthName());
			this.month=this.month+1;
		}
		return months.toString();
	}

	public String printDate(){
		String date = new String ("");
		date = (getDay()+"/"+getMonth()+"/"+getYear());
		return date;
	} 
	
	public String daysLeft(){
		StringBuffer days;
		days = new StringBuffer();
			if ((this.month == 1)||(this.month == 3)||(this.month == 5)||(this.month == 7)||(this.month == 8)||(this.month == 10)||(this.month == 12)){
				for(int i = this.day; i<=31; i++){
					days.append("\n");
					days.append(this.day+"/"+this.month+"/"+this.year);
					this.day=this.day+1;
				}
			}
			else if ((this.month == 4)||(this.month == 6)||(this.month == 9)||(this.month == 11)){
				for(int i = this.day; i<=30; i++){
					days.append("\n");
					days.append(this.day+"/"+this.month+"/"+this.year);
					this.day=this.day+1;
				}
			}
			else if (this.month == 2){
				for(int i = this.day; i<=28; i++){
					days.append("\n");
					days.append(this.day+"/"+this.month+"/"+this.year);
					this.day=this.day+1;
				}
			}
		return days.toString();
	}

	public String sameMonthsDays(){
		StringBuffer sameMonths;
		sameMonths = new StringBuffer();
		if ((this.month == 1)||(this.month == 3)||(this.month == 5)||(this.month == 7)||(this.month == 8)||(this.month == 10)||(this.month == 12)){
			sameMonths.append("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
		}

		else if ((this.month == 4)||(this.month == 6)||(this.month == 9)||(this.month == 11)){
			sameMonths.append("Abril, Junio, Septiembre y Noviembre");
		}

		else if (this.month == 2){
			sameMonths.append("Solo Febrero tiene 28 días");
		}
		return sameMonths.toString();
	}
		
	public int daysSinceFirstDay(){
		int daysSinceFirstDay = 0;
		if(this.month == 1){
			daysSinceFirstDay = this.day;
		}
		else if(this.month == 2){
			daysSinceFirstDay = 31 + this.day;
		}
		else if(this.month == 3){
			daysSinceFirstDay = 31 + 28 + this.day;
		}
		else if(this.month == 4){
			daysSinceFirstDay = 31 + 28 + 31 + this.day;
		}
		else if(this.month == 5){
			daysSinceFirstDay = 31 + 28 + 31 + 30 + this.day;
		}
		else if(this.month == 6){
			daysSinceFirstDay = 31 + 28 + 31 + 30 + 31 + this.day;
		}
		else if(this.month == 7){
			daysSinceFirstDay = 31 + 28 + 31 + 30 + 31 + 30 + this.day;
		}
		else if(this.month == 8){
			daysSinceFirstDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + this.day;
		}
		else if(this.month == 9){
			daysSinceFirstDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + this.day;
		}
		else if(this.month == 10){
			daysSinceFirstDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + this.day;
		}
		else if(this.month == 11){
			daysSinceFirstDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + this.day;
		}
		else{
			daysSinceFirstDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + this.day;
		}
		return daysSinceFirstDay;
	}
	
	public int attemptsRandomDate(){
		int counter = 1;
		int dayRandom = (int) (Math.random()*31 + 1);
		int monthRandom = (int) (Math.random()*12 + 1);
		while((dayRandom!=this.day)||(monthRandom!=this.month)){
			counter = counter + 1;
			dayRandom = (int) (Math.random()*31 + 1);
			monthRandom = (int) (Math.random()*12 + 1);
		}
		return counter;
	}
	
	public int attemptsRandomDateDo(){
		int counter = 1;
		int dayRandom = (int) (Math.random()*31 + 1);
		int monthRandom = (int) (Math.random()*12 + 1);
		do{
			counter = counter + 1;
			dayRandom = (int) (Math.random()*31 + 1);
			monthRandom = (int) (Math.random()*12 + 1);
		}
		while((dayRandom!=this.day)||(monthRandom!=this.month));
		return counter;
	}
}





	/*public String getDate(){
		return getDay() + getMonth() + getYear();
	}

*/

	/* Necesario??? public String printDate(){
		return this.day+"/"+this.month+"/"+this.year;
	}
*/
