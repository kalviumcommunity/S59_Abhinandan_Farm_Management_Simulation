package Farm_Management_System;

import Farm.Farmer;
import Farm.Crop;
import Farm.Livestock;
import Shop.Items;
import Shop.Inventory;
import java.util.ArrayList;
import java.util.Scanner;

//use of classes can be seen here
public class FarmManagementSystem {

    private static void addCrops(ArrayList<Crop> crops, Scanner scanner) {
        System.out.print("Enter the type of crop: ");
        String cropType = scanner.nextLine();
        System.out.print("Enter the initial water level: ");
        int waterLevel = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the description of the crop (or press Enter for default description): ");
        String description = scanner.nextLine();

        if (description.isEmpty()) {
            crops.add(new Crop(cropType, waterLevel));
        }
        else {
            crops.add(new Crop(cropType, waterLevel, description));
        }
        System.out.println("Crop added successfully.");
    }

    private static void addLivestock(ArrayList<Livestock> livestock, Scanner scanner) {
        System.out.print("Enter the type of livestock: ");
        String livestockType = scanner.nextLine();
        livestock.add(new Livestock(livestockType));
        System.out.println("Livestock added successfully.");
    }

    private static void viewFarmOverview(ArrayList<Crop> crops, ArrayList<Livestock> livestock) {
        System.out.println("Farm Overview:");
        System.out.println("Number of Crops: " + crops.size());
        System.out.println("Number of Livestock: " + livestock.size());

        System.out.println("Crops:");
        for (Crop crop : crops) {
            System.out.println(" - " + crop.getType());
        }

        System.out.println("Livestock:");
        for (Livestock animal : livestock) {
            System.out.println(" - " + animal.getAnimal());
        }
    }

    private static void viewCropsDetails(ArrayList<Crop> crops) {
        System.out.println("Crops Details:");
        for (Crop crop : crops) {
            crop.displayInfo();
            System.out.println("--------------------");
        }
    }

    private static void viewLivestockDetails(ArrayList<Livestock> livestock) {
        System.out.println("Livestock Details:");
        for (Livestock animal : livestock) {
            animal.displayInfo();
            System.out.println("--------------------");
        }
    }

    private static void learnAboutFarmOperations() {
        System.out.println("Farm Operations:");
        System.out.println("Crops are grown through stages from seedling to maturity.");
        System.out.println("Livestock are raised by ensuring their health and proper feeding.");
        System.out.println("Farmers manage the overall operations to ensure a productive farm.");
    }

    private static void addItemToInventory(Inventory inventory, Scanner scanner) {
        System.out.print("Enter the type of item: ");
        String itemName = scanner.nextLine();
        System.out.println("Enter the price of the Item: ");
        double price = scanner.nextDouble();
        System.out.println("Enter the quantity of the Item: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Items item = new Items(itemName, price, quantity);
        inventory.addItem(item);
        System.out.println("Item added to inventory successfully.");
    }

    private static void buyItems(Inventory inventory, Scanner scanner) {
        double totalCost = 0;
        boolean buying = true;

        while (buying) {
            System.out.print("Items available in the shop:");
            inventory.displayItems();

            System.out.print("Enter the name of the item you want to buy (or type 'exit' to exit): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("exit")) {
                buying = false;
            }
            else {
                Items item = inventory.getItemByName(itemName);

                if (item != null) {
                    System.out.print("Enter the quantity you want to buy: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    if (quantity <= item.getQuantity()) {
                        totalCost += item.getPrice() * quantity;
                        item.setQuantity(item.getQuantity() - quantity);
                        System.out.println("Item added to your bill.");
                    }
                    else {
                        System.out.println("Insufficient quantity available.");
                    }
                }
                else {
                    System.out.println("Item not found.");
                }
            }
        }
        System.out.println("Total cost: $" + totalCost);
        System.out.print("Do you want to proceed with the payment? (yes/no): ");
        String decision = scanner.nextLine();

        if (decision.equalsIgnoreCase("yes")) {
            System.out.println("Payment successful. Thank you for your purchase!");
        }
        else {
            System.out.println("Transaction cancelled.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Crop> crops = new ArrayList<>();
        ArrayList<Livestock> livestock = new ArrayList<>();
        Inventory inventory = new Inventory();

        crops.add(new Crop("Wheat", 70));
        crops.add(new Crop("Corn", 75));
        livestock.add(new Livestock("Cow"));
        livestock.add(new Livestock("Buffalo"));

        inventory.addItem(new Items("Fertilizer", 20.0, 50));
        inventory.addItem(new Items("Feed", 15.0, 100));inventory.addItem(new Items("Eggs", 5.00, 120));
        inventory.addItem(new Items("Cheese", 12.00, 45));
        inventory.addItem(new Items("Milk", 8.00, 80));
        inventory.addItem(new Items("Butter", 10.00, 30));
        inventory.addItem(new Items("Yogurt", 6.00, 50));

        System.out.println("Welcome to the Farm Management System!");
        System.out.println("Are you a Farmer or a Visitor?");
        System.out.println("1. Farmer");
        System.out.println("2. Visitor");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

//            use of objects can be seen here
            Farmer farmer = new Farmer(name, age);
            farmer.displayFarmerInfo();

            boolean exit = false;

            while (!exit) {
                System.out.println("Farmer Menu:");
                System.out.println("1. Add Crop");
                System.out.println("2. Add Livestock");
                System.out.println("3. View Farm Overview");
                System.out.println("4. View Crops Details");
                System.out.println("5. View Livestock Details");
                System.out.println("6. Add Item to Inventory");
                System.out.println("7. Buy Items");
                System.out.println("8. Exit");
                int farmerChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (farmerChoice) {
                    case 1:
                        addCrops(crops, scanner);
                        break;
                    case 2:
                        addLivestock(livestock, scanner);
                        break;
                    case 3:
                        viewFarmOverview(crops, livestock);
                        break;
                    case 4:
                        viewCropsDetails(crops);
                        break;
                    case 5:
                        viewLivestockDetails(livestock);
                        break;
                    case 6:
                        addItemToInventory(inventory, scanner);
                        break;
                    case 7:
                        buyItems(inventory, scanner);
                        break;
                    case 8:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
        else if (choice == 2) {
            System.out.println("Welcome, Visitor! Here are your options:");
            System.out.println("1. View Farm Overview");
            System.out.println("2. View Crops Details");
            System.out.println("3. View Livestock Details");
            System.out.println("4. Learn About Farm Operations");
            System.out.println("5. Buy Items");
            int visitorChoice = scanner.nextInt();
            scanner.nextLine();

            switch (visitorChoice) {
                case 1:
                    viewFarmOverview(crops, livestock);
                    break;
                case 2:
                    viewCropsDetails(crops);
                    break;
                case 3:
                    viewLivestockDetails(livestock);
                    break;
                case 4:
                    learnAboutFarmOperations();
                    break;
                case 5:
                    buyItems(inventory, scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please restart the application.");
            }
        }
        else {
            System.out.println("Invalid choice. Please restart the application.");
        }
    }
}
