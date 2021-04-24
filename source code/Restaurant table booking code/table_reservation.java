import java.util.Scanner;

public class table_reservation {
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t           TAJ TIRUPATI Tables         ");
    System.out.println("\t\t\t\t   1. FOR 2 People              ");
    System.out.println("\t\t\t\t   2. FOR 4 people              ");
    System.out.println("\t\t\t\t   3. FOR 6 people              ");
    System.out.println("\t\t\t\t   4. CANCEL                         ");
    System.out.println("\t\t\t\t+====================================+");
    }
    
    public static void order(){
    System.out.println("Press 1 to couples table , Press 2 to table for 4 , Press 3 to table for 6 and Press 4 to Cancel");
    System.out.print("Press which table cateogory you want :");
    choose = input.nextInt();
    //conditions
    if(choose==1){
        System.out.println("You choose the cateogory table for 2 and the charges of each table is 10 ruppees");
        System.out.print("How many tables you wanna book? :");
        quantity =input.nextInt();
        total = total +(quantity*10);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==2){
        System.out.println("You choose table for 4 and the booking charges for each table is 10");
        System.out.print("How many tables you want to Book? :");
        quantity =input.nextInt();
        total = total +(quantity*10);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }else if(choose==3){
        System.out.println("You choose table for 6 and the charges for each table is 10 ruppees");
        System.out.print("How many Tables you want to Book? :");
        quantity =input.nextInt();
        total = total +(quantity*10);
        
        System.out.println("You want to book again?");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==4){
        System.exit(0);//close program
    }else{
        System.out.println("Choose 1 to 4 only!");
        order();
    }
    }
    public static void main(String[] args) {
       menu();
       order();
    } 
}
