package Java_Programming;
import java.util.Scanner;
public class All_G8_Students extends Data {

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

    // Section 16 :

    Data C26 =new Data("Youssef Yasser", 26 , getType_Section());
    Data C27 =new Data("Moahme Essam",27 , getType_Section());
    Data C28 = new Data("Ammar Hussien", 28, getType_Section());
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
    
    Data X3 [] = {
    C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22,C23,C24,C25,
    C26,C27,C28,C29,C30,C31,C32,C33,C34,C35,C36,C37,C38,C39,C40,C41,C42,C43,C44,C45,C46,C47,C48,C49,C50
    };

    void Check_Id_All_G8 () { 

        try {
    
          System.out.println("Enter The Id To Check :");
          int y1= input.nextInt();
    
            for (int i = 0 ; i <X3.length; ++i)
            {
              if (y1 != X3[i].getId()) {continue;}
              if (y1 == X3[i].getId())
              {
                System.out.println("The Id exists in our data :");
                System.out.println("The Data for this ID :\n");
                System.out.println("Name ==> : " + X3[i].getName());
                System.out.println("ID ==> : " + X3[i].getId());
                System.out.println("Computer Scince Section ==> : " + X3[i].getType_Section());
                break ; // different between return and break 
              } 
            }
           }
            catch (Exception e) {System.out.println("Invalied Input");}
         }

    void G8_Info_Section15_Doctors () {

      try { 

        System.out.println("From your ID we Can Check you Doctors (1 <=>25)");
        System.out.println("Enter your Id:");
        int y2 = input.nextInt();

            for (int i = 0 ; i < X3.length-25; ++i)
            { 
              if ( y2 !=X3[i].getId()) {continue;}
              if ( y2 ==X3[i].getId())
              {
                System.out.println("Your  Data :");
                System.out.println(Data.getDoctors_Name());      
              }
            }             
          } catch (Exception e) {
            System.out.println("Invalied Input");}
         }
         
    void G8_Info_Section15_Subjects () {
        
      try {

        System.out.println("From your ID we Can Check you Subjects (1 <=>25)");
        System.out.println("Enter your Id:");
        int y3 = input.nextInt();

        for (int i = 0 ; i < X3.length-25; ++i)
            { 
              if ( y3 !=X3[i].getId()) {continue;}
              if ( y3 ==X3[i].getId())
              {
                System.out.println("Your  Data :");
                System.out.println(Data.getSubjects_Name());      
              }
            }        
      } catch (Exception e) {
        System.out.println("Invalied Input");
      }

    }
}
