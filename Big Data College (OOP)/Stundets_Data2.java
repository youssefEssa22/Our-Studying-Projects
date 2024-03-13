package Java_Programming;
import java.util.Scanner;
public class Students_Data2 extends Data{

     Scanner input = new Scanner(System.in);

   // Data Feilds of Section 16 G8 :

     Data C26 =new Data("Youssef Yasser", 26 , getType_Section());
     Data C27 =new Data("Moahmed Essam",27 , getType_Section());
     Data C28 =new Data("Ammar Hussien",28 , getType_Section());
     Data C29 =new Data("Omar Awad",29 , getType_Section());
     Data C30 =new Data("Kareem Adel", 30 , getType_Section());
     Data C31 =new Data("Hazem Mohamed", 31 , getType_Section());
     Data C32 =new Data("Omar Mohamed", 32 , getType_Section());
     Data C33 =new Data("Mohab Ahmed", 33 , getType_Section());
     Data C34 =new Data("Marwan Osama", 34 , getType_Section());
     Data C35 =new Data("Abdullah Mohamed", 35 , getType_Section());
     Data C36 =new Data("Moahemd Ashraf", 36 , getType_Section());
     Data C37 =new Data("Anas Moahmed", 37 , getType_Section());
     Data C38 =new Data("Mohaned Gaber", 38 , getType_Section());
     Data C39 =new Data("Abdelrhman Mohamed", 39 , getType_Section());
     Data C40 =new Data("Mustafa Mohamed", 40 , getType_Section());
     Data C41 =new Data("Mustafa Mahmoud", 41 , getType_Section());
     Data C42 =new Data("Nour Ahmed",42 , getType_Section());
     Data C43 =new Data("Marim Hani", 43 , getType_Section());
     Data C44 =new Data("Marim Gerges", 44 , getType_Section());
     Data C45 =new Data("Shahd Akram", 45 , getType_Section());
     Data C46 =new Data("Menna Yasser", 46 , getType_Section());
     Data C47 =new Data("Marim Mohamed", 47 , getType_Section());
     Data C48 =new Data("Mamdouh Abdelkader", 48 , getType_Section());
     Data C49 = new Data("Youssef Ahmed", 49 , getType_Section());
     Data C50 = new Data("Abdulah Mahomud", 50 , getType_Section());   

    Data X2 [] = {C26,C27,C28,C29,C30,C31,C32,C33,C34,C35,C36,C37,C38,C39,C40,C41,C42,C43,C44,C45,C46,C47,C48,C49,C50} ;

    void Display_Data_Sec16 ()
    {
       
       System.out.println("---------------------------------------------------------------------------");
       for (int i = 0 ;i < X2.length;++i)
       {
         System.out.println("Name => :" + X2[i].getName() + " Id => :" + X2[i].getId() + " Type_Computer_Section => :" + X2[i].getType_Section());
         System.out.println();
         System.out.println("___________________________________________________________________________________________________________");
       }
       System.out.println("---------------------------------------------------------------------------");
    }

    void Check_Id_Sec_16 () { 

        try {
    
          System.out.println("Enter The Id To Check :");
          int y1= input.nextInt();
    
            for (int i = 0 ; i <X2.length; ++i)
            {
              if (y1 != X2[i].getId()) {continue;}
              if (y1 == X2[i].getId())
              {
                System.out.println("The Id exists in our data :");
                System.out.println("The Data for this ID :");
                System.out.println("Name => :" + X2[i].getName() + " Id => :" + X2[i].getId() + " Type_Computer_Section => :" + X2[i].getType_Section());
                break ; // different between return and break 
              } 
            }
           }
            catch (Exception e) {System.out.println("Invalied Input");}
         }  
}
