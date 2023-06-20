// package Assignment_2;

// //Create a 2 package q10pack1 and q10pack2
// //create a q10.java in q10pack1 and sport.java file under q10pack2....
// //The first part in q10.java under q10pack1 
// package q10pack1;
// import java.util.Scanner;
// import q10pack2.sport.Sports;
// import q10pack2.*;
// class Student 
//  {
//      String name;
//      int roll;
//      public void input() 
//      {
//          Scanner obj = new Scanner(System.in);
//          System.out.print("Enter student name : ");
//          name = obj.nextLine();
//          System.out.print("Enter roll no : ");
//          roll = obj.nextInt();
//     }
//     public void output() 
//     {
//         System.out.print("Student Name is " + name+" having roll no " + roll);
//     }
// }
// class Test extends Student {
//     int mark1;
//     int mark2;
//     public void input() 
//     {
//         super.input();
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter mark1: ");
//         mark1 = obj.nextInt();
//         System.out.print("Enter mark2: ");
//         mark2 = obj.nextInt();
//     }
//     public void output() 
//     {
//         super.output();
//         System.out.print(" secured Mark 1: " + mark1+" & Mark 2 "+ mark2);
//     }
// }
// class GrandTotal extends Test implements Sports 
// {  
//      public void input() 
//     {
//     super.input();
//     }


//     public void output() {
//     super.output();
//     System.out.println(" and having Score 1: " + score1+" & Score 2: " + score2);
//     System.out.println("Total mark " + (mark1 + mark2 )+ " and total Score " + (score1 + score2));
//     System.out.println("Grand total is :"+(mark1+mark2+score1+score2));
// }
// }
// public class q10
// {
//     public static void main(String[] args) {
//         GrandTotal g1=new GrandTotal();
//         g1.input();
//         g1.output();
//     }
// }

// //Create sport.java under q10pack2 and create sport interface in that package
// package q10pack2;
// public class sport {
//     public static void main(String[] args) {        
//     }
// public interface Sports {
//     int score1 = 40;
//     int score2 = 30;    
// }
// }
