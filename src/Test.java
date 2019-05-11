import java.util.Scanner;

public class Test {
	static int secim;
	static String userName,password;
	static Scanner giris = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    
    public static void showMenu() {
    	System.out.println("Please enter the user type you want to login!\n1-For Warehouse Owner\n2-For Customer");
    	secim = giris.nextInt();
    	switch(secim) {
    		case 1:
    			System.out.println("Please enter the username for warehouse owner");
    			userName = giris.nextLine();
    			System.out.println("Please enter the password");
    			password = giris.nextLine();
    			if(userName == "warehouse" && password == "warehouse123") {
    				System.out.println("Login Success");
    				WarehouseAdminMenu();
    			}
    			break;
    		case 2:
    			System.out.println("Please enter the username for the customer");
    			userName = giris.nextLine();
    			System.out.println("Please enter the password");
    			password = giris.nextLine();
    			if(userName == "customer" && password == "customer123") {
    				System.out.println("Login Success");
    				CustomerMenu();
    			}
    			else{
    				System.out.println("UserName or password Wrong. Please try again");
    			}
    			break;
    			
    	}
    }
    public static void WarehouseAdminMenu() {
    	System.out.println("Please enter the process you want.\n1-Show products\n2-Add Product\n3-Remove Product\n4-Show remaining capacity\n5-Exit");
    	secim = giris.nextInt();
    	switch(secim){
    	case 1:
    		break;
    	case 2:
    		System.out.println("Which product do you want to add?\n1-Computer\n2-Telephone\n3-Car");
    		secim = giris.nextInt();
    		switch(secim) {
    		case 1:
    			Product computer = new Computer();
    			break;
    		case 2:
    			Product telephone = new Telephone();
    			break;
    		case 3:
    			Product car = new Car();
    			break;
    		}
    		break;
    	case 3:
    		break;
    	case 4:
    		break;
    	case 5:
    		System.exit(1);
    	}
    }
    public static void CustomerMenu() {
    	System.out.println("Please enter the process you want.\n1-Show products\n2-Buy Product\n3-Exit");
    	switch(secim){
    	case 1:
    		//ürünleri gösterecek metod yazýlacak
    		break;
    	case 2:
    		System.out.println("Which product do you want to buy?\n1-Computer\n2-Telephone\n3-Car");
    		secim = giris.nextInt();
    		switch(secim) {
    		case 1:
    			break;
    		case 2:
    			break;
    		case 3:
    			break;
    		}
    		break;
    	case 3:
    		System.exit(1);
    	}
    }
}
