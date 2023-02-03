import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		
		int Hours;
		int Distancetravel = 0;
		int Momentum = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("DISTANCE TRAVEL");
		System.out.println("Enter the speed of any vehicle in (mp/h)");
		Momentum = keyboard.nextInt();
		System.out.println("Enter the time of vehicle that travel in hours ");
		Hours = keyboard.nextInt();
        
        System.out.println("Hours                                        Distance Traveled");
        System.out.println("_________________________________________________________________");
        
        for(int i = 0; i < Hours ; i ++){
            Distancetravel++;
            System.out.println(Distancetravel + " time" + "                " + (Distancetravel*Momentum)+ " Miles");
        }
		
		
	}
}
