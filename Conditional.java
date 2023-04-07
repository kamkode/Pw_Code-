//  public class Conditional{
//     public static void main(String[]args){
//         int age =17;
//         if (age >=18)
//         {
//             System.out.println("legal adult");

//         }
//         else  {
//             System.out.println("kid");
//         }
//     }}

public class Conditional{
    public static void main(String[]args){
        int age =18;
        if (age >=18 && age <60)
        {
            System.out.println("legal adult");

        }
        else if(age>=60){
            System.out.println("You are An Old ,man");

        }

        
        else  {
            System.out.println("kid");
        }
    }}