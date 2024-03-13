package Java_Programming;
public class Data {

   private String Name ;
   private int Id ;
   private String Type_Section = "Data Science and Ai" ;
   private int number_Of_Courses  ;
   private static Data [] Subjects_Name ;
   private static Data [] Doctors_Name ;

   Data () {} 
   
   Data (String Name , int Id , String Type_Section) {
      this.Name = Name;
      this.Id = Id ;
      this.Type_Section = Type_Section;
   }
public String getName() {return Name;}

public void setName(String name) {Name = name;}

public int getId() {return Id;}

public void setId(int Id) {this.Id = Id;}

public String getType_Section() {return Type_Section;}

public void setType_Section(String type_Section) {Type_Section = type_Section;}

public int getNumber_Of_Courses() {return number_Of_Courses;}

public void setNumber_Of_Courses(int number_Of_Courses) {this.number_Of_Courses = number_Of_Courses;}

public static Data [] getSubjects_Name() {
   
   String data [] = {"Java Programming l","Java Programming ll" , "Data Science" ,"Calculus" , "Discrete Mathematics"};

 for (int i = 0 ; i < data.length; ++i)
  {
    System.out.println(data[i]);
  }
   return Subjects_Name;}

public static Data [] getDoctors_Name()  {
   String data [] = {"Ahmed Saleh" ,"Ahmed Moustafa","Magda","Muhammed Saad","Ahmed Younes"};

   for (int i = 0 ; i <= data.length; ++i)
  {
    System.out.println(data[i]);
  }
   return Doctors_Name;}



}
