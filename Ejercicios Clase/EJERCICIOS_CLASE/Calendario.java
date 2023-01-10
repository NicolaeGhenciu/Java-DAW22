package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Calendario {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	 
	    System.out.print("Enter full year (e.g., 2020): ");
	    int year = input.nextInt();

	   
	    System.out.print("Enter month in number between 1 and 12: ");
	    int month = input.nextInt();

	    
	    System.out.println(printCalendar(year, month)); 
	  }

	  public static String printCalendar(int year, int month) {
		  String head="";
		  String body ="\n";
		  head = printHead(year, month);
		  body = monthBody(year, month);
		  return head+body;
	  }
	  
	  public static int remainderDays(int year,int month) { //numeros de dias del actual año
		  int total =0;
		  for (int m =1; m<month;m++)
			  total += numberOfDays(m,year);
		  return total;
	  }
	  public static int daysUntilYears(int year) { //cuenta y suma los dias de un año
		  int total =0;
		  for (int y =1800; y<year;y++)
			  if (isLeapYear(y))
				  total+=366;
			  else
				  total +=365;
		  return total;
	  }
	  public static String printHead(int year, int month) {  // el head
	    return("         " + getMonthName(month)
	      + " " + year+"\n-----------------------------\n Sunday Monday Tuesday Wednesday Thursday Friday Saturday\n\n ");
	  }
	  
	  public static String monthBody(int year, int month) { 
		  final int START_DAY_FOR_JAN_1_1 = 4; // 1/1/1 fue viernes
		  int totalDays = daysUntilYears(year)+remainderDays(year,month); 
		  int diasemana = ((totalDays+4) % 7);
		  String dias = "";
		  String espacio = "  ";
		  //intentar poner bucle para saber que dia es y que pegue un salto.
		  for (int i =1; i<=numberOfDays(month,year); i++) {
			  for (int a = 0; a<diasemana; a++) {
			  if (i % 7 == 0) 
				  dias += espacio + i + "\t\n\n ";
			  else
				  dias += espacio + i + "\t ";
		  } }
		 
		  return dias;
	  }
	  public static String getMonthName(int month) { // comunica al head el mes.
	    String monthName = "";
	    switch (month) {
	      case 1: monthName = "January"; break;
	      case 2: monthName = "February"; break;
	      case 3: monthName = "March"; break;
	      case 4: monthName = "April"; break;
	      case 5: monthName = "May"; break;
	      case 6: monthName = "June"; break;
	      case 7: monthName = "July"; break;
	      case 8: monthName = "August"; break;
	      case 9: monthName = "September"; break;
	      case 10: monthName = "October"; break;
	      case 11: monthName = "November"; break;
	      case 12: monthName = "December";
	    }

	    return monthName;
	  }

	  public static boolean isLeapYear(int year) { // para saber si un año es bisiesto
		  if(year%400==0 || year%4==0 && year%100!=0)
			  return true;
		  return false;
		  
	  }
	  public static int numberOfDays(int month,int year) { //define el numero de dias de un mes
		  if (month == 2)
			  if(isLeapYear(year))
				  return 29;
			  else
				  return 28;
		  else
			  if (month ==4 || month == 6 || month ==9 || month == 11)
				  return 30;
			  else return 31;
		  
	  }
}