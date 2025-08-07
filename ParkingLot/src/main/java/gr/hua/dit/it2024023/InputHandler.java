package gr.hua.dit.it2024023;
import java.util.Scanner;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class InputHandler 
{     //User inputs and try-catch Exceptions of invalid inputs.
    
    Scanner scanner = new Scanner(System.in);
    public String returnName()
    {
        System.out.print("Enter your full name: "); 
        String name= scanner.nextLine();
        return name;
    }
    
    public String returnLicencePlate()
    {
        System.out.print("Enter your licence plate: "); 
        String licencePlate= scanner.nextLine();
        return licencePlate;
    }
    
    public String returnPhone()
    {
        System.out.print("Enter your phone number: "); 
        String phone= scanner.nextLine();
        return phone;
    }
    
    public int returnSpace()
    {
        int space=0;
        boolean validInput;
        do{//try-catch invalid input
            System.out.print("Enter the type of your vehicle (Type (1) for motorcycles and cars, Type (2) for trucks: ");
            try{
                space= scanner.nextInt();
                scanner.nextLine();
                validInput=true;
            }catch (Exception e)
            {
                System.out.println("Invalid input, please enter a valid integer");
                scanner.nextLine(); 
                validInput=false;
            }
        }while (!validInput);
        return space;
    }
    
    public int returnFuelType()
    {
        int type=0;
        boolean validInput;
        do{//try-catch invalid input
            System.out.print("Enter the fuel type of your vehicle (Type (1) Diesel/Gasoline, Type (2) for Electric: ");
            try{
                type= scanner.nextInt();
                scanner.nextLine();
                validInput=true;
            }catch (Exception e)
            {
                System.out.println("Invalid input, please enter a valid integer!");
                scanner.nextLine(); 
                validInput=false;
            }
        }while (!validInput);
        return type;
    }
    
    public int returnSize()
    {
        int size=0;
        boolean validInput;
        do{
            System.out.print("Enter the size of your truck (in meters): ");
            try{
                size = scanner.nextInt(); 
                scanner.nextLine();
                validInput=true;
            }catch (Exception e)
            {
                System.out.println("Invalid input. Please enter a valid integer!");
                scanner.nextLine();
                validInput=false;
            }
            }while(!validInput);
        return size;
    }
    
    public int returnPurpose()
    {
        int purpose=0;
        boolean validInput;
        do{
            System.out.print("Enter the purpose of use (1 : Food Transportation , 2: Object Transportation, 3: Delivery: ");
            try{
                purpose = scanner.nextInt(); 
                scanner.nextLine();
                if ((purpose <1)||(purpose>3))
                {
                    System.out.println("Invalid input. Please enter a valid integer!");
                    validInput=false;
                }else
                {
                    validInput=true;
                }

            }catch (Exception e)
            {
                System.out.println("Invalid input. Please enter a valid integer!");
                scanner.nextLine();
                validInput=false;
            }
        }while(!validInput);
        return purpose;
    }
}