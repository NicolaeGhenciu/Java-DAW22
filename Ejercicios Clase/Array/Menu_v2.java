package Array;

import java.util.Scanner;

public class Menu_v2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[]elements = null;// randomValues();  ;
		int op;
		do{
			op = menu();
			switch(op){
			case 1: elements = introElements();
			        break;
			case 2: System.out.println("Number of elements: ");
					int x = input.nextInt();
				    elements = randomValues(x);
	                break;       
			case 3: System.out.println(printArray(elements));
			        break;
			case 4: int sum = sumElements(elements);
			        System.out.println("The sum of all elements is :"+sum);
	                break;      
			case 5: //int largest = largestElement(elements);
	                System.out.println("The largest element is :"+largestElement(elements));
                    break;      
			case 6: //int largest = largestElement(elements);
                     System.out.println("The smallerest position  is :"+smallestPosition(elements)+ " with the value:"
                    		 +elements[smallestPosition(elements)]);
                     break;    
			case 7: shufflingArray(elements);
					break;
			case 8: shiftingArray(elements);
			        break;
			case 9: break;        
			default : System.out.println("No option, please enter a number between 1 to 9");        
			}
		} while (op!=9);
	}

	public static void shiftingArray(int[] elem){
		 int aux = elem[0];
	     for (int i = 0; i < elem.length-1; i++){
				
				elem[i] = elem[i+1];
				
			}
		 elem[elem.length-1] = aux;
	   
	 }  
	public static void shufflingArray(int[] elem){
		 
	     for (int i = 0; i < elem.length; i++){
				int r = (int)(Math.random()*elem.length);
				int aux = elem[i];
				elem[i] = elem[r];
				elem[r] = aux;
			}
	   
	 }  
	public static int smallestPosition(int[] elem){
		 int smallest = 0;
	     for (int i = 1; i < elem.length; i++){
				if (elem[smallest] < elem[i])
					smallest = i;
				
			}
	    return smallest;
	 }  
	public static int largestElement(int[] elem){
		 int largest = elem[0];
	     for (int i = 1; i < elem.length; i++){
				if (largest < elem[i])
					largest = elem[i];
				
			}
	    return largest;
	 }  
	 public static int sumElements(int[] elem){
		 int sum =0;
	     for (int i = 0; i < elem.length; i++){
				sum+= elem[i];
				
			}
	    	return sum;
	 }  	
	public static int[] introElements(){
		Scanner input = new Scanner(System.in);
		int[] elem = new int[12];
		for (int i = 0; i < elem.length; i++){
			System.out.print( "Enter the value:"+i+" : ");
			elem[i] = input.nextInt();
		}
		return elem;
	}
	public static  int[] randomValues(int n){
		int[] elem = new int[n];
		for (int i = 0; i < elem.length; i++){
			
			elem[i] = (int)(Math.random()*100)+1;
		}
		return elem;
	}
	public static  int[] randomValues(){
		int[] elem = new int[12];
		for (int i = 0; i < elem.length; i++){
			
			elem[i] = (int)(Math.random()*100)+1;
		}
		return elem;
	}
    public static String printArray(int[] elem){
    	String report ="";
    	for (int i = 0; i < elem.length; i++){
			report += "Value "+i+" : "+ elem[i]+"\t";
			if (i%5 == 0) report += "\n";
			
		}
    	return report;
	}
    public static void addSeven(int [] elem){
		
		for (int i = 0; i < elem.length; i++){
			
			elem[i] += 7;
		}
		
	}
	public static int menu(){ // aqui hacmos el menu.
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("-----Menu de opciones------");
		System.out.println("1 .- Initializing arrays with input values ");
		System.out.println("2 .- Initializing arrays with random values");
		System.out.println("3 .- Printing arrays ");
		System.out.println("4 .- Summing all elements ");
		System.out.println("5 .- Finding the largest element ");
		System.out.println("6 .- Finding the smallest index of the largest element");
		System.out.println("7 .- Random shuffling");
		System.out.println("8 .- Shifting elements");
		System.out.println("9 .- Exit ");
		System.out.println("Intro an option : "); 
		int op = input.nextInt();
		return op;
						
		
	}
}
