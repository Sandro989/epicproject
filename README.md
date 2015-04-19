# epicproject
This is an epic project.
package convertmiletometer;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ConvertMileToMeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1 Miles = 1609.344 Meter
        Scanner miles = new Scanner(System.in); //get input from pc keyboard
        System.out.println( " Enter the Miles:");// Enter Miles
        double Miles= miles.nextDouble();
        double Meter = Math.round(Miles*1609.344);// 1 Mile = 1609.344M
        System.out.println( " Convert meter is:" + Meter);
   
    }
     
}
