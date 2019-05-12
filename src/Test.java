import java.util.*;
public class Test {
	static int secim;
	static String userName,password,tempName,tempModel;
	static Scanner giris = new Scanner(System.in);
	static int tempID,tempRam,tempProcNumber,tempModelYear,tempBatteryPower,tempNumberOfCylinders;
	static double tempPrice,tempProcSpeed,tempTopSpeed,tempVolume,totalPrice = 0.0;
	static boolean isTrueOrder = false;
	static WareHouse wh = new WareHouse(1,150,"Warehouse 1","Ýzmir Ekonomi Üniversitesi");
	static ArrayList<Product> shoppingCart = new ArrayList<>();
    public static void main(String[] args) {
        showMenu();
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
    		showProducts();
    		break;
    	case 2:
    		System.out.println("Which product do you want to add?\n1-Computer\n2-Telephone\n3-Car");
    		secim = giris.nextInt();
    		addProduct(secim);
    		break;
    	case 3:
    		System.out.println("Please enter the product id you want to remove.");
    		secim = giris.nextInt();
    		removeProduct(secim);
    		break;
    	case 4:
    		wh.getWarehouseCapacity();
    		break;
    	case 5:
    		System.exit(1);
    	}
    }
    public static void CustomerMenu() {
    	System.out.println("Please enter the process you want.\n1-Show products\n2-Add Product to Cart\n3-Show Total Price\n4-Exit");
    	switch(secim){
    	case 1:
    		showProducts();
    		break;
    	case 2:
    		System.out.println("Which product do you want to buy?\n1-Computer\n2-Telephone\n3-Car");
    		secim = giris.nextInt();
    		addToCart(secim);
    		break;
    	case 3:
    		showCart();
    		break;
    	case 4:
    		System.exit(1);
    	}
    }
    public static void addProduct(int secim) {
		switch(secim) {
		case 1:
			System.out.println("Please enter the ID of Computer");
			tempID = giris.nextInt(); giris.nextLine();
			System.out.println("Please enter the name of Computer");
			tempName = giris.nextLine();
			System.out.println("Please enter the model");
			tempModel = giris.nextLine();
			System.out.println("Please enter the processor number");
			tempProcNumber = giris.nextInt();
			System.out.println("Please enter the processor speed");
			tempProcSpeed = giris.nextDouble();
			System.out.println("Please enter RAM:");
			tempRam = giris.nextInt();
			System.out.println("Please enter price:");
			tempPrice = giris.nextDouble();
			Product comp = new Computer(tempID,tempName,tempModel,tempRam,tempPrice,tempProcNumber,tempProcSpeed);
			if(wh.getWarehouseCapacity()-comp.getCapacity()<0) {
				System.out.println("Warehouse is full!!");
			}
			else {
				wh.setWarehouseCapacity(wh.getWarehouseCapacity()-comp.getCapacity());
				wh.warehouse.add(comp);
			}
			break;
		case 2:
			System.out.println("Please enter the ID of Telephone");
			tempID = giris.nextInt(); giris.nextLine();
			System.out.println("Please enter the name of Telephone");
			tempName = giris.nextLine();
			System.out.println("Please enter the Model of Telephone");
			tempModel = giris.nextLine();
			System.out.println("Please enter the Model Year of Telephone");
			tempModelYear = giris.nextInt();
			System.out.println("Please enter the Battery Power of Telephone");
			tempBatteryPower = giris.nextInt();
			System.out.println("Please enter price:");
			tempPrice = giris.nextDouble();
			System.out.println("Please enter the processor number");
			tempProcNumber = giris.nextInt();
			System.out.println("Please enter the processor speed");
			tempProcSpeed = giris.nextDouble();
			Product telephone = new Telephone(tempID,tempName,tempModel,tempModelYear,tempBatteryPower,tempPrice,tempProcSpeed,tempProcNumber);
			if(wh.getWarehouseCapacity()-telephone.getCapacity()<0) {
				System.out.println("Warehouse is full!!");
			}
			else {
				wh.setWarehouseCapacity(wh.getWarehouseCapacity()-telephone.getCapacity());
				wh.warehouse.add(telephone);
			}
			break;
		case 3:
			System.out.println("Please enter the ID of Car");
			tempID = giris.nextInt(); giris.nextLine();
			System.out.println("Please enter the name of Car");
			tempName = giris.nextLine();
			System.out.println("Please enter the model year of car");
			tempModelYear = giris.nextInt();
			System.out.println("Please enter the model of Car");
			tempModel = giris.nextLine();
			System.out.println("Please enter the top speed of Car");
			tempTopSpeed = giris.nextDouble();
			System.out.println("Please enter the price of car");
			tempPrice = giris.nextDouble();
			System.out.println("Please enter the volume of Car");
			tempVolume = giris.nextDouble();
			System.out.println("Please enter the cylinder number of car");
			tempNumberOfCylinders = giris.nextInt();
			Engine eng = new Engine(tempVolume,tempNumberOfCylinders);
			Product car = new Car(tempID,tempName,tempModelYear,tempModel,tempTopSpeed,tempPrice,eng);
			if(wh.getWarehouseCapacity()-car.getCapacity()<0) {
				System.out.println("Warehouse is full!!");
			}
			else {
				wh.setWarehouseCapacity(wh.getWarehouseCapacity()-car.getCapacity());
				wh.warehouse.add(car);
			}
			break;
		default:
			System.out.println("Wrong choice, please enter new choice!");
			break;
		}
	}
    public static void addToCart(int id) {
    	Product prod = searchProduct(id);
    	if(prod!=null) {
    		shoppingCart.add(prod);
    	}
    }
    
    public static void removeProduct(int id) {
    	Product prod = searchProduct(id);
    	if(prod!=null) {
    		wh.warehouse.remove(prod);
    	}
    }
    public static void showProducts() {
    	for(int i = 0;i<wh.warehouse.size();i++) {
    		wh.warehouse.get(i).printInfo();
    		System.out.println("---------------------------");
    	}
    }
    public static void showCart() {
    	for(int i=0;i<shoppingCart.size();i++) {
    		totalPrice += shoppingCart.get(i).calculateActualPrice(); //Runtime Polymorphism is here.
    	}
    }
    public static Product searchProduct(int ID) {
    	Product prod = null;
    	for(int i = 0;i<wh.warehouse.size();i++) {
    		if(wh.warehouse.get(i).getID()==ID) {
    			prod = wh.warehouse.get(i);
    			break;
    		}
    		else {
    			System.out.println("Product not found");
    		}
    	}
    	return prod;
    }
}
