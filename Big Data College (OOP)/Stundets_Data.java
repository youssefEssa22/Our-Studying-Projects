package Java_Programming;
import java.util.Scanner;
public class Stundets_Data extends Data{

     Scanner input =new Scanner(System.in);

    //Data Feilds of Section 15 G8 :

    Data C1 = new Data ("Mustafa Hussien" , 1, getType_Section());
    Data C2 = new Data ("Abdelrahman Waleed" ,2 , getType_Section());
    Data C3 = new Data("Youssef Mamdouh" , 3, getType_Section());
    Data C4 = new Data ("Ahmed Magdy" , 4, getType_Section());
    Data C5 = new Data ("Nada Mohamed" , 5, getType_Section());
    Data C6 = new Data("Yahia Mohamed", 6, getType_Section());
    Data C7 = new Data ("Mahmoud Hassan" ,7 , getType_Section());
    Data C8 = new Data ("Ganna Tarek" , 8, getType_Section());
    Data C9 = new Data ("Marium Hossam" , 9, getType_Section());
    Data C10 = new Data ("Wael Ayman" ,10, getType_Section());
    Data C11 = new Data ("Thomas Nabil" ,11 , getType_Section());
    Data C12 = new Data ("Menna Mohamed" , 12 , getType_Section());
    Data C13 = new Data ("Habiba Ahmed" , 13 , getType_Section());
    Data C14 = new Data ("Mohamed Ahmed" , 14 , getType_Section());
    Data C15 = new Data ("Mohamed Saleh" , 15 , getType_Section());
    Data C16 = new Data ("Adham Mahomud" , 16 , getType_Section());
    Data C17 = new Data ("Ezz Eldien" , 17 , getType_Section());
    Data C18 = new Data ("Ahmed Abdelrahman" , 18 , getType_Section());
    Data C19 = new Data ("Youssef Ashraf" , 19 , getType_Section());
    Data C20 = new Data ("Nabil Adel" , 20 , getType_Section());
    Data C21 = new Data ("Marim Mohamed" , 21 , getType_Section());
    Data C22 = new Data ("Youssef Sherif" , 22, getType_Section());
    Data C23 = new Data ("Mlisia Mkram" , 23 , getType_Section());
    Data C24 = new Data ("Omar Hazem" , 24 , getType_Section());
    Data C25 = new Data ("Mohamed Hamed" , 25 , getType_Section());

    Data X1 [] = {C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22,C23,C24,C25} ;
    // Store Data in Arrays
    // int X2 [] = {C1.Id,C2.Id,C3.Id,C4.Id,C5.Id,C6.Id,C7.Id,C8.Id,C9.Id,C10.Id,C11.Id,C12.Id,C13.Id,C15.Id,C16.Id,C17.Id,C18.Id,C19.Id,C20.Id,C21.Id,C22.Id,C23.Id,C24.Id,C25.Id} ;
    // Store Id in Arrays
   
   void Display_Data_Sec15 ()
   {
      System.out.println("\t ANU Computer Science Data   ");
      System.out.println("---------------------------------------------------------------------------");
      for (int i = 0 ;i < X1.length;++i)
      {
        System.out.println("Name => :" + X1[i].getName() + " Id => :" + X1[i].getId() + " Type_Computer_Section => :" + X1[i].getType_Section());
        System.out.println();
        System.out.println("___________________________________________________________________________________________________________");
      }
      System.out.println("---------------------------------------------------------------------------");
   }

    void Check_Id_Sec_15 () { 

    try {

      System.out.println("Enter The Id To Check for Sec 15 (1 <=>25):");
      int y1= input.nextInt();

        for (int i = 0 ; i <X1.length; ++i)
        {
          if (y1 != X1[i].getId()) {continue;}
          if (y1 == X1[i].getId())
          {
            System.out.println("The Id exists in our data :");
            System.out.println("The Data for this ID :");
            System.out.println("Name => :" + X1[i].getName() + "\n" + " Id => :" + X1[i].getId() + "\n" + " Type_Computer_Section => :" + X1[i].getType_Section());
            break ; // different between return and break 
          } 
        }
       }
        catch (Exception e) {System.out.println("Invalied Input");}
     }
 }