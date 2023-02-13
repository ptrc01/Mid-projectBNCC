import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <vehicle> kendaraan = new ArrayList<>();
      
       
        int num;

        while (true) {
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.println("0. Exit");
            System.out.print("Choose number ");
            num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.print("Input type [Car | Motorcycle]: ");
                    String jenis = sc.nextLine();

                    System.out.print("Input brand [>= 5]: ");
                    String brand = sc.nextLine();
                    if (brand.length() < 5) {
                        System.out.println("The Brand Is Invalid");continue;
                    }

                    System.out.print("Input name[>= 5]: ");
                    String name = sc.nextLine();
                    if (name.length() < 5) {
                        System.out.println("The Name Is Invalid");continue;
                    }

                    System.out.print("Input license: ");
                    String license = sc.nextLine();
                    if (!license.matches("[A-Z] [0-9]{1,4} [A-Z]{1,3}")) {
                        System.out.println("The License Is Invalid");
                        continue;
                    }
                    
                    System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
                    int speed = sc.nextInt();
                    if (speed<100 || speed>250) {
                        System.out.println("The Top Speed Is Invalid");
                        continue;
                    }

                    System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
                    int gas = sc.nextInt();
                    if (gas<30 || gas>60) {
                        System.out.println("The Gas Capacity Is Invalid");
                        continue;
                    }

                    System.out.print("Input wheel [4 <= wheel <= 6]: ");
                    int wheel = sc.nextInt();
                    if (wheel<4 || wheel>6) {
                        System.out.println("The Wheel Is Invalid");
                        continue;
                    }
                    sc.nextLine();

                    if (jenis.equalsIgnoreCase("Car")) {
                        System.out.print("Input type [SUV | Supercar | Minivan]: ");
                        String tipe = sc.nextLine();
                        
                        System.out.print("Input entertainment system amount [>= 1]: ");
                        int system = sc.nextInt();
                        if (system<1) {
                            System.out.println("The Entertainment System Amount Is Invalid");
                            continue;
                        }
                        kendaraan.add(new car(jenis, brand, name, license, speed, gas, wheel, tipe, system));
                        car mobil = new car(jenis, brand, name, license, speed, gas, wheel, tipe, system);
                        kendaraan.add(mobil);
                        mobil.special();


                    }else if(jenis.equalsIgnoreCase("Motorcycle")){
                        System.out.print("Input type [Automatic | Manual]: ");
                        String tipe = sc.nextLine();
                        
                        System.out.print("Input Helmet amount [>= 1]: ");
                        int helm = sc.nextInt();
                        if (helm<1) {
                            System.out.println("The Helmet Amount Is Invalid");
                            continue;
                        }
                        kendaraan.add(new motor(jenis, brand, name, license, speed, gas, wheel, tipe, helm));
                        motor Motor = new motor(jenis, brand, name, license, speed, gas, wheel, tipe, helm);
                        kendaraan.add(Motor);
                        Motor.special();
                    }else{
                        System.out.println("The Type Is Invalid");
                    }
        
                
                    break;
                
                case 2:
                    System.out.println("|-----|---------------|---------------|");
                    System.out.println("|No   |Type           |Name           |");
                    System.out.println("|-----|---------------|---------------|");
                    if(kendaraan.size() != 0){

                        for(int i = 0; i < kendaraan.size(); i++){
                            System.out.printf("|%-5d|", i + 1);
                            System.out.printf("%-15s|", "Car");
                            System.out.printf("%-15s|", kendaraan.get(i).getName());
                            System.out.println();
                        }

                    } else {
                        System.out.println("|-----|NO DATA--------|NO DATA--------|");
                    }

                    System.out.println("|-----|---------------|---------------|");
                    System.out.println("|-----|---------------|---------------|");
        
                    System.out.println("Choose a vehicle number [Enter '0' to exit]: ");
                    int choice = sc.nextInt();

                    if (choice>0 && choice <= kendaraan.size()) {
                        kendaraan.get(choice-1).show();
                        System.out.println();
                    }else{
                        System.out.println("The Number Is Invalid");
                    }

                    break;
            
                default:
                    break;
            }
        }

                
                
                
                
    }
    
}