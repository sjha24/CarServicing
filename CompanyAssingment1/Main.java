import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void carServiceCase(CarService carService,ArrayList<String>codes){
        while(true){
            System.out.println("Select the type of Car Servicing code : ");
            System.out.println("1:BS01");
            System.out.println("2:EF01");
            System.out.println("3:CF01");
            System.out.println("4:BF01");
            System.out.println("5:GF01");
            System.out.println("6:Genrate Bill");
            System.out.println("7:Exist");

            System.out.println("Enter Your Service Code: ");
            int serviceCode = scn.nextInt();
            switch(serviceCode){
                case 1 : {
                    codes.add("BS01");
                    break;
                }
                case 2 : {
                    codes.add("EF01");
                    break;
                }
                case 3 : {
                    codes.add("CF01");
                    break;
                }
                case 4 : {
                    codes.add("BF01");
                    break;
                }
                case 5 :{
                    codes.add("GF01");
                    break;
                }
                case 6 : {
                    Bill bill = new Bill(carService, codes);
                    System.out.println(bill.calculateBill());
                    // System.out.println(totalBill);
                    return;
                }
                case 7 : {
                    return;
                }
                default : {
                    System.out.println("Enter Valid code");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("Select the options below to do specific Tasks ");
            System.out.println("1:to Select the car ");
            System.out.println("2:Exist");
            System.out.println("Enter yout option");
            int caseNo = scn.nextInt();
            switch(caseNo){
                case 1:{
                    System.out.println("Select the type of car for Servicing : ");
                    System.out.println("1:HatchBack");
                    System.out.println("2:SUV");
                    System.out.println("3:Sedan");
                    System.out.println("Enter your option : ");
                    int carOption = scn.nextInt();
                    ArrayList<String> code = new ArrayList<>();
                    switch (carOption){
                        case 1 : {
                            CarService carService = new Hatchback();
                            carServiceCase(carService , code);
                            break;
                        }

                        case 2 : {
                            CarService carService = new SUV();
                            carServiceCase(carService , code);
                            break;
                        }
                        case 3 : {
                            CarService carService = new Sedan();
                            carServiceCase(carService , code);
                            break;
                        }
                    }

                }
                case 2:{
                    return;
                }
                default:{
                    System.out.println("Select the suitable option : ");
                    break;
                }
            }
        }
    }
}
