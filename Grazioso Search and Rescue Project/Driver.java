import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Monkey array
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
    	// Add scanner for taking input
    	Scanner scanner = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();
        //
        String input;
        
        // Creating Loop
        do {
        	displayMenu();
        	input = scanner.nextLine().toLowerCase();
        	
        	switch (input) {
        	case "1":
        		intakeNewDog(scanner);
        		break;
        	case "2":
        		intakeNewMonkey(scanner);
        		break;
        	case "3":
        		reserveAnimal(scanner);
        		break;
        	case "4":
        		printAnimals("dog");
        		break;
        	case "5":
        		printAnimals("monkey");
        		break;
        	case "6":
        		printAnimals("available");
        		break;
        	case "q":
        		System.out.println("Goodbye!");
        		break;
        	default:
        		System.out.println("Invalid selection. Try again.");
        	}
        	
        }
         while (!input.equals("q"));
        	
    }
       

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Mudvayne", "Tamarin", "Male", "11", "180", "04-20-1969", "USA", "in service", false, "USA", 11, 24, 13);
    	
    	monkeyList.add(monkey1);
    	

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
                
            }
            
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("Enter breed:");
        String breed = scanner.nextLine();
        
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        
        System.out.println("Enter age:");
        String age = scanner.nextLine();
        
        System.out.println("Enter weight:");
        String weight = scanner.nextLine();
        
        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("Enter acquisition country:");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is this dog reserved?");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println("What country is this dog in service?");
        String inServiceCountry = scanner.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate,
        acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        
        dogList.add(newDog);
        System.out.println("Dog added.");
        
    
    }

        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("Enter the monkey's name:");
            String name = scanner.nextLine();
            for (Monkey monkey : monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("This moneky is already in the system.");
            		return;
            		
            	}
            }
            System.out.println("Enter species (Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tarmin):");
            String species = scanner.nextLine();
            
            String[] allowedSpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tarmin"};
            boolean validSpecies = false;
            for (String species : allowedSpecies) {
            	if (species.equalsIgnoreCase(species)) {
            		validSpecies = true;
            		break;
            	}
            }
            if (!validSpecies) {
            	System.out.println("Invalid species.");
            	return;
            	
            }
            System.out.println("Enter gender:");
            String gender = scanner.nextLine();
            
            System.out.println("Enter age:");
            String age = scanner.nextLine();
            
            System.out.println("Enter weight:");
            String weight = scanner.nextLine();
            
            System.out.println("Enter acquisition date:");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Enter acquisition country:");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("Enter training status:");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is this monkey reserved? (true or false):");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());
            
            System.out.println("What country is this dog in service?");
            String inServiceCountry = scanner.nextLine();
            
            System.out.println("Enter tail length:");
            int tailLength = scanner.nextInt();
            
            System.out.println("Enter height:");
            int height = scanner.nextInt();
            
            System.out.println("Enter body length");
            int bodyLength = scanner.nextInt();
            
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate,
            acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
            
            monkeyList.add(newMonkey);
            System.out.println("Monkey added.");
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Enter animal type (dog or monkey):");
            String animalType = scanner.nextLine().toLowerCase();
            
            if (!animalType.equals("dog") && !animalType.equals("monkey")) {
            	System.out.println("Invalid animal type.");
            	return;
            	
            }
            
            System.out.println("Enter service country:");
            String inServiceCountry = scanner.nextLine();
            
            boolean found = false;
            
            if (animalType.equals("dog")) {
            	for (Dog dog: dogList) {
            		if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) &&
            				dog.getTrainingStatus().equalsIgnoreCase("in service") &&
            				!dog.getReserved()) {
            			
            			dog.setReserved(true);
            			System.out.println("Dog " + dog.getName() + " has been reserved.");
            			found = true;
            			break;
            			
            		}
            	}
            }
            else {
            	for (Monkey monkey : monkeyList) {
            		if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) &&
            				monkey.getTrainingStatus().equalsIgnoreCase("in service") &&
            				!monkey.getReserved()) {
            			
            			monkey.setReserved(true);
            			System.out.println("Monkey " + monkey.getName() + " has been reserved.");
            			found = true;
            			break;
            			
            		}
            	}
            }
            if (!found) {
            	System.out.println("No available " + animalType + "s found in " + inServiceCountry + ".");
            
            }

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            System.out.println("The method printAnimals needs to be implemented");

        }
}

