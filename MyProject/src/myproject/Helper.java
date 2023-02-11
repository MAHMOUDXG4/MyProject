
package myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
    //the arrays that we are going to use in our data base 
    static ArrayList<String> carsList = new ArrayList();    
    static ArrayList<NewCars> newcarsList = new ArrayList<NewCars>();
    static ArrayList<UsedCars> usedcarsList = new ArrayList<UsedCars>();
    
    //making the menu of the program
        public static void displayMenu() {
        System.out.println("|----- {Welcom to my Store} -----| ");
        System.out.println("Please choose the category of the car for sale that you want to know about:");
        System.out.println("1- New cars.");
        System.out.println("2- Used cars.");
        System.out.println("|-------------------------|");
//using scanner class to allow the user to input data 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your Choice: ");
        String costumerChoice = keyboard.nextLine();
//make if statement for each car menu category depends on the inputs data from the user
        if (costumerChoice.equals("1")) {
            Helper.NewCarsMenu();
            
        }
        else if (costumerChoice.equals("2")) {
            Helper.UsedCarsMenu();
            
        }
    }
        //making method belong to new cars menu category and start to build the menu
        public static void NewCarsMenu() {
                    Helper.newcarsMenu();
                    Helper.carsList();
                    Helper.newcarsdataList();     
                    Scanner keyboard = new Scanner(System.in);
                    System.out.print("Please enter your Choice: ");
                    String costumerChoice = keyboard.nextLine();
                    
                    if(costumerChoice.equals("1")) {
                        //toyota cars menu section
                        System.out.println("|----- {Available toyota cars} ----|");
                        System.out.println(carsList.get(0));
                        System.out.println("|-------------------------------------|");
                        System.out.println("Please choose the number of car that you want to know about");
                        String Choice = keyboard.nextLine();
                        //displaying cars details data depends on which car the user choosed
                        if(Choice.equals("1")) {
                        System.out.println(newcarsList.get(0));
                        }
                        else if(Choice.equals("2")) {
                        System.out.println(newcarsList.get(1));
                        }
                        else if(Choice.equals("3")) {
                        System.out.println(newcarsList.get(2));
                        }    
                    }
                    
                    else if(costumerChoice.equals("2")) {
                        //nissan cars menu section
                        System.out.println("|----- {Available nissan cars} ----|");
                        System.out.println(carsList.get(1));
                        System.out.println("|-------------------------------------|");
                        System.out.println("Please choose the number of car that you want to know about");
                        String Choice = keyboard.nextLine();
                        //displaying cars details data depends on which car the user choosed                        
                        if(Choice.equals("1")) {
                        System.out.println(newcarsList.get(3));
                        }
                        else if(Choice.equals("2")) {
                        System.out.println(newcarsList.get(4));
                        }
                        else if(Choice.equals("3")) {
                        System.out.println(newcarsList.get(5));
                        }
                    }
                    
                    else if(costumerChoice.equals("3")) {
                        //honda cars menu section
                        System.out.println("|----- {Available honda cars} ----|");
                        System.out.println(carsList.get(2));
                        System.out.println("|-------------------------------------|");
                        System.out.println("Please choose the number of car that you want to know about");
                        String Choice = keyboard.nextLine();
                        //displaying cars details data depends on which car the user choosed
                        if(Choice.equals("1")) {
                        System.out.println(newcarsList.get(6));
                        }
                        else if(Choice.equals("2")) {
                        System.out.println(newcarsList.get(7));
                        }
                        else if(Choice.equals("3")) {
                        System.out.println(newcarsList.get(8));
                        }      
                    }

            
        }
        //method adding the available new cars details data                 
        public static void newcarsdataList() {
           //Toyta new Cars details data
           newcarsList.add(new NewCars("Toyota", "Camry", "SAR 117,000", "2023", "Black, White"));
           newcarsList.add(new NewCars("Toyota", "Yaris", "SAR 95,000", "2023", "White, Bronze"));
           newcarsList.add(new NewCars("Toyota", "Corolla", "SAR 92,000", "2023", "Silver, Blue"));
           //Nissan new Cars details data
           newcarsList.add(new NewCars("Nissan", "Sentra", "SAR 86,000", "2023", "Silver, White"));
           newcarsList.add(new NewCars("Nissan", "Sunny", "SAR 67,000", "2023", "Black, Blue"));
           newcarsList.add(new NewCars("Nissan", "Altima", "SAR 120,000", "2023", "Black, Bronze"));
           //Honda new Cars details data
           newcarsList.add(new NewCars("Honda", "Accord", "SAR 132,000", "2023", "Bronze, Silver"));
           newcarsList.add(new NewCars("Honda", "Pilot", "SAR 155,000", "2023", "Black, Purple"));
           newcarsList.add(new NewCars("Honda", "Odyssey", "SAR 167,000", "2023", "Silver, Green"));
                          
        }
        //method for usedcars menu section
        public static void UsedCarsMenu() {
                    Helper.usedcarsMenu();
                    Helper.carsList();
                    Helper.usedcarsdataList();     
                    
                    Scanner keyboard = new Scanner(System.in);
                    System.out.print("Please enter your Choice: ");
                    String costumerChoice = keyboard.nextLine();
                    
                    if(costumerChoice.equals("1")) {
                        //toyota cars menu section
                        System.out.println("|----- {Available toyota cars} ----|");
                        System.out.println(carsList.get(0));
                        System.out.println("|-------------------------------------|");
                        System.out.println("Please choose the number of car that you want to know about");
                        String Choice = keyboard.nextLine();
                        //displaying cars details data depends on which car the user choosed
                        if(Choice.equals("1")) {
                        System.out.println(usedcarsList.get(0));
                        }
                        else if(Choice.equals("2")) {
                        System.out.println(usedcarsList.get(1));
                        }
                        else if(Choice.equals("3")) {
                        System.out.println(usedcarsList.get(2));
                        }                           
                    }
                    
                    else if(costumerChoice.equals("2")) {
                        //nissan cars menu section
                        System.out.println("|----- {Available nissan cars} ----|");
                        System.out.println(carsList.get(1));
                        System.out.println("|-------------------------------------|");
                        System.out.println("Please choose the number of car that you want to know about");
                        String Choice = keyboard.nextLine();
                        //displaying cars details data depends on which car the user choosed
                        if(Choice.equals("1")) {
                        System.out.println(usedcarsList.get(3));
                        }
                        else if(Choice.equals("2")) {
                        System.out.println(usedcarsList.get(4));
                        }
                        else if(Choice.equals("3")) {
                        System.out.println(usedcarsList.get(5));
                        }                               
                    }
                    
                    else if(costumerChoice.equals("3")) {
                        //honda cars menu section
                        System.out.println("|----- {Available honda cars} ----|");
                        System.out.println(carsList.get(2));
                        System.out.println("|-------------------------------------|");
                        System.out.println("Please choose the number of car that you want to know about");
                        String Choice = keyboard.nextLine();
                        //displaying cars details data depends on which car the user choosed
                        if(Choice.equals("1")) {
                        System.out.println(usedcarsList.get(6));
                        }
                        else if(Choice.equals("2")) {
                        System.out.println(usedcarsList.get(7));
                        }
                        else if(Choice.equals("3")) {
                        System.out.println(usedcarsList.get(8));
                        }                            
                    }
        }
           //method adding the available used cars details data         
           public static void usedcarsdataList() {

           // Toyota used cars details data
           usedcarsList.add(new UsedCars("Toyota","Camry", "SAR 64,000", "2013", "White", "55,000 Km", "6 months"));
           usedcarsList.add(new UsedCars("Toyota","Yaris", "SAR 45,000", "2011", "Silver", "72,000 Km", "8 months"));
           usedcarsList.add(new UsedCars("Toyota","Corolla", "SAR 70,000", "2023", "Bronze", "10,000 Km", "2 months"));
           // Nissan used cars details data
           usedcarsList.add(new UsedCars("Nissan","Sentra", "SAR 55,000", "2020", "White", "15,000 Km", "3 months"));
           usedcarsList.add(new UsedCars("Nissan","Sunny", "SAR 32,000", "2017", "Red", "90,000 Km", "4 years"));
           usedcarsList.add(new UsedCars("Nissan","Altima", "SAR 29,500", "2014", "Blue", "105,000 Km", "6 years"));
            // Honda used cars details data
           usedcarsList.add(new UsedCars("Honda","Accord", "SAR 36,000", "2015", "Bronze", "178,827 Km", "5 years"));
           usedcarsList.add(new UsedCars("Honda","Pilot", "SAR 62,000", "2022", "Black", "20,000 Km", "4 months"));
           usedcarsList.add(new UsedCars("Honda","Odyssey", "SAR 30,000", "2012", "Silver", "154,689 Km", "8 years"));
                           
        }
                    

        //method making cars company menu section for new cars and used cars menu categorys        
        public static void carscompaniesMenu() {
                    System.out.println("Please choose one of the car compaies avilable in the store for sale whose details you want to know:");
                    System.out.println("1- Toyota cars.");
                    System.out.println("2- Nissan cars.");
                    System.out.println("3- Honda cars.");
                    System.out.println("|-------------------------|");
        }
        //method making headline for new cars catrgory in company cars section
       public static void newcarsMenu() {
                    System.out.println("|----- {New cars for sale} ----|");
                    Helper.carscompaniesMenu();

       }
       //method making headline for used cars catrgory in company cars section
       public static void usedcarsMenu() {
                    System.out.println("|----- {Used cars for sale} ----|");
                    Helper.carscompaniesMenu();
       }
       //method adding the available cars in arraylist called carsList
       public static void carsList() {
           carsList.add("1- Camry, 2- Yaris, 3- Corolla");
           carsList.add("1- Sentra, 2- Sunny, 3- Altima");
           carsList.add("1- Accord, 2- Pilot, 3- Odyssey");   
        }


}
