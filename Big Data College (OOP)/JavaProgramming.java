package Java_Programming;
import java.util.Scanner;
public class JavaProgramming {
public static void main(String[] args) { 
 
 // Only Calling Mehods ::

  Data Z = new Data();  // for private and small data 
  Stundets_Data Z1 = new Stundets_Data();  // for calling any data
  Students_Data2 Z2 = new Students_Data2(); // for calling any data
  All_G8_Students Z3 = new All_G8_Students(); // for calling any data


   Scanner input = new Scanner(System.in);

   try {

    System.out.println("Do You want Check your System Data ? \n press 1 ==>Yes - 2 ==>No");
    int x = input.nextInt();

    switch (x) {
      case 1:
       { System.out.println("Enter your number Section : " + "\n (15 or 16)");
         int x1 = input.nextInt();
         switch (x1) {
          case 15:
          {Z1.Check_Id_Sec_15();
          System.out.println();
          }
           break;
          case 16:

          {Z2.Check_Id_Sec_16();
          System.out.println();
          }
            break;
         }

         System.out.println("Enter your Group Number : \n (1 <=> 10)"); // Assume only 8 as only we made for
         int x2 = input.nextInt();
         switch (x2) {
          case 8:
          System.out.println("Your Subjects :");
          Z3.G8_Info_Section15_Subjects();
          System.out.println();
          System.out.println("Your Doctors :");
          Z3.G8_Info_Section15_Doctors();
          break;
          case 1: case 2:case 3:case 4:case 5:case 6:case 7:case 9:case 10:

          System.out.println("Ops ! That's System doesn't exist !!");

        // Not Complete Data As only for G8
         
           default: // Not Complete Data As only for G8
           break;  // Not Complete Data As only for G8
         }
       }
        break;
         case 2: {System.out.println("Ok now You Exit our System !");}
        break;
    }

    System.out.println();
    Z3.Addition_Subjects_name();

   }
   catch (Exception e) 
   {System.out.println("Invalied Input");}

   finally {input.close();}
  
 }
}

