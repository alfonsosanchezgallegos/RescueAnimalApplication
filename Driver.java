import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {

    	Scanner scnr = new Scanner(System.in);
    	String input;
    	
        initializeDogList();
        initializeMonkeyList();

        // Do-While loop that displays menu and selects option based on input
        do {
        	displayMenu();
        	input = scnr.nextLine();
        	System.out.println("\n");
        	
        	switch(input) {
        		case "1":
        			intakeNewDog(scnr);
        			break;
        		
        		case "2":
        			intakeNewMonkey(scnr);
        			break;
        			
        		case "3":
        			reserveAnimal(scnr);
        			break;
        			
        		case "4":
        			printAnimals(input);
        			break;
        			
        		case "5":
        			printAnimals(input);
        			break;
        		
        		case "6":
        			printAnimals(input);
        			break;
        		
        		case "q":
        			System.out.println("Thank you for visiting!");
        			break;
        		
        		default:
        			System.out.println("Error. Please select an option from the menu.");
        			break;
        			
        	}
        	
        }while (!(input.equals("q")));
        
        // Closes scanner
        scnr.close();
        
    }

    
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
        Dog dog1 = new Dog("Spot", "Dog", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "Intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Dog", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "In service", false, "United States");
        Dog dog3 = new Dog("Bella", "Dog", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "In service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("King Julian", "Monkey", "Guenon", "male", "2", "20.3", "4.1", "2.9", "1.1", "04-03-2019", "United States", "Intake", false, "United States");
    	Monkey monkey2 = new Monkey("Harambe", "Monkey", "Marmoset", "female", "4", "19.1", "3.5", "2.5", "0.8", "01-29-2020", "United States", "In service", false, "United States");
    	Monkey monkey3 = new Monkey("Skipper", "Monkey", "Tamarin", "male", "3", "23.5", "4.9", "3.2", "1.6", "06-06-2020", "Mexico", "In service", true, "Mexico");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    // Takes in a new dog
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String input = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(input)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // New dog object created
        Dog dog = new Dog();
        dog.setName(input);
        dog.setAnimalType("Dog");
        
        // Inputs dog's breed
        System.out.println("What is the dog's breed?");
        input = scanner.nextLine();
        dog.setBreed(input);
        
        // While loop that checks gender input
        System.out.println("What is the gender of the dog (Male or Female)?");
        input = scanner.nextLine();
        while (!(input.equalsIgnoreCase("Male")) && !(input.equalsIgnoreCase("Female"))) {
        	System.out.println("You have not selected a gender from the list. Please select one.");
        	System.out.println("What is the gender of the dog (Male or Female)?");
            input = scanner.nextLine();
        }
        dog.setGender(input);
        
        // While loop that checks age input
        System.out.println("What is the age of the dog (0-99)?");
        try {
        	input = scanner.nextLine();
        	while ((Integer.parseInt(input) < 0) || (Integer.parseInt(input) > 99)) {
        		System.out.println("You have not selected an age from the list. Please select one.");
        		System.out.println("What is the age of the dog (0-99)?");
        		input = scanner.nextLine();
        	}
        }
        // Catches number format exceptions
        catch (NumberFormatException excpt) {
        	System.out.println("Invalid input.");
        	return; //returns to menu
        }
        dog.setAge(input);
        
        // Inputs dog's weight
        System.out.println("What is the weight of the dog?");
        input = scanner.nextLine();
        dog.setWeight(input);
        
        // Inputs dog's acquisition date and country
        System.out.println("What is the acquisition date of the dog (MM-DD-YYYY)?");
        input = scanner.nextLine();
        dog.setAcquisitionDate(input);
        System.out.println("What is the acquisition country of the dog?");
        input = scanner.nextLine();
        dog.setAcquisitionCountry(input);
        
        // While loop that checks training status input
        System.out.println("What is the training status of the dog?");
        System.out.println("Intake, Phase I, Phase II, Phase III, Phase IV, Phase V, or In service?");
        input = scanner.nextLine();
        while (!(input.equalsIgnoreCase("Intake")) && !(input.equalsIgnoreCase("Phase I")) &&
        		!(input.equalsIgnoreCase("Phase II")) && !(input.equalsIgnoreCase("Phase III")) &&
        		!(input.equalsIgnoreCase("Phase IV")) && !(input.equalsIgnoreCase("Phase V")) &&
        		!(input.equalsIgnoreCase("In service"))) {
        	System.out.println("You have not selected a training status from the list. Please select one.");
        	System.out.println("What is the training status of the dog?");
            System.out.println("Intake, Phase I, Phase II, Phase III, Phase IV, Phase V, In service");
            input = scanner.nextLine();
        }
        dog.setTrainingStatus(input);
        
        // Sets reserve status
        System.out.println("Is this dog reserved (Yes or No)?");
        input = scanner.nextLine();
        while (!(input.equalsIgnoreCase("Yes")) && !(input.equalsIgnoreCase("No"))) {
        	System.out.println("You have not selected Yes or No.");
        	 System.out.println("Is this dog reserved (Yes or No)?");
             input = scanner.nextLine();
        }
        if (input.equalsIgnoreCase("Yes")) {
        	dog.setReserved(true);
        }
        else {
        	dog.setReserved(false);
        }
        
        // Inputs in service country of dog
        System.out.println("What is the in service country of the dog?");
        input = scanner.nextLine();
        dog.setInServiceCountry(input);
        
        // Adds dog to dogList
        dogList.add(dog);
        
    }


		// Takes in a new monkey
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String input = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(input)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            
            // New monkey object created
            Monkey monkey = new Monkey();
            monkey.setName(input);
            monkey.setAnimalType("Monkey");
            
            // While loop that checks species input
            System.out.println("What is the monkey's species?");
            System.out.println("Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, or Tamarin?");
            input = scanner.nextLine();
            while (!(input.equalsIgnoreCase("Capuchin")) && !(input.equalsIgnoreCase("Guenon")) &&
            		!(input.equalsIgnoreCase("Macaque")) && !(input.equalsIgnoreCase("Marmoset")) &&
            		!(input.equalsIgnoreCase("Squirrel monkey")) && !(input.equalsIgnoreCase("Tamarin"))) {
            	System.out.println("You have not selected a species from the list. Please select one.");
            	System.out.println("What is the monkey's species?");
                System.out.println("Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, or Tamarin?");
                input = scanner.nextLine();
            }
            monkey.setSpecies(input);
            
            // While loop that checks gender input
            System.out.println("What is the gender of the monkey (Male or Female)?");
            input = scanner.nextLine();
            while (!(input.equalsIgnoreCase("Male")) && !(input.equalsIgnoreCase("Female"))) {
            	System.out.println("You have not selected a gender from the list. Please select one.");
            	System.out.println("What is the gender of the monkey (Male or Female)?");
                input = scanner.nextLine();
            }
            monkey.setGender(input);
            
            // While loop that checks age input
            System.out.println("What is the age of the monkey (0-99)?");
            try {
            	input = scanner.nextLine();
            	while ((Integer.parseInt(input) < 0) || (Integer.parseInt(input) > 99)) {
            		System.out.println("You have not selected an age from the list. Please select one.");
            		System.out.println("What is the age of the monkey (0-99)?");
            		input = scanner.nextLine();
            	}
            }
            // Catches number format exceptions
            catch (NumberFormatException excpt) {
            	System.out.println("Invalid input.");
            	return; //returns to menu
            }
            monkey.setAge(input);
            
            // Inputs monkey's weight, height, bodyLength, tailLength
            System.out.println("What is the weight of the monkey?");
            input = scanner.nextLine();
            monkey.setWeight(input);
            System.out.println("What is the height of the monkey?");
            input = scanner.nextLine();
            monkey.setHeight(input);
            System.out.println("What is the body length of the monkey?");
            input = scanner.nextLine();
            monkey.setBodyLength(input);
            System.out.println("What is the tail length of the monkey?");
            input = scanner.nextLine();
            monkey.setTailLength(input);
            
            // Inputs monkey's acquisition date and country
            System.out.println("What is the acquisition date of the monkey (MM-DD-YYYY)?");
            input = scanner.nextLine();
            monkey.setAcquisitionDate(input);
            System.out.println("What is the acquisition country of the monkey?");
            input = scanner.nextLine();
            monkey.setAcquisitionCountry(input);
            
            // While loop that checks training status input
            System.out.println("What is the training status of the monkey?");
            System.out.println("Intake, Phase I, Phase II, Phase III, Phase IV, Phase V, or In service?");
            input = scanner.nextLine();
            while (!(input.equalsIgnoreCase("Intake")) && !(input.equalsIgnoreCase("Phase I")) &&
            		!(input.equalsIgnoreCase("Phase II")) && !(input.equalsIgnoreCase("Phase III")) &&
            		!(input.equalsIgnoreCase("Phase IV")) && !(input.equalsIgnoreCase("Phase V")) &&
            		!(input.equalsIgnoreCase("In service"))) {
            	System.out.println("You have not selected a training status from the list. Please select one.");
            	System.out.println("What is the training status of the monkey?");
                System.out.println("Intake, Phase I, Phase II, Phase III, Phase IV, Phase V, In service");
                input = scanner.nextLine();
            }
            monkey.setTrainingStatus(input);
            
            // Sets reserve status
            System.out.println("Is this monkey reserved (Yes or No)?");
            input = scanner.nextLine();
            while (!(input.equalsIgnoreCase("Yes")) && !(input.equalsIgnoreCase("No"))) {
            	System.out.println("You have not selected Yes or No.");
            	System.out.println("Is this monkey reserved (Yes or No)?");
                input = scanner.nextLine();
            }
            if (input.equalsIgnoreCase("Yes")) {
            	monkey.setReserved(true);
            }
            else {
            	monkey.setReserved(false);
            }
            
            // Inputs in service country of monkey
            System.out.println("What is the in service country of the monkey?");
            input = scanner.nextLine();
            monkey.setInServiceCountry(input);
            
            // Adds monkey to monkeyList
            monkeyList.add(monkey);
            
        }

        
        // Find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What is the animal's type?");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("Dog")) {
            	System.out.println("What is the service country the dog is in?");
            	input = scanner.nextLine();
            	for(Dog dog: dogList) {
            		if (dog.getInServiceCountry().equalsIgnoreCase(input)) {
            			if (dog.getTrainingStatus().equalsIgnoreCase("In service")) {
            				if (dog.getReserved() == false) {
            					System.out.println("There is an in service dog in the country " + input);
            					System.out.println("that is not reserved.");
                				dog.setReserved(true);
                				dog.print();
                				return;
            				}
            			}
            		}
            	}
            	
            	System.out.println("There are no in service dogs in the country " + input);
            	System.out.println("that are not reserved.");
            }
            
            else if (input.equalsIgnoreCase("Monkey")) {
            	System.out.println("What is the service country the monkey is in?");
            	input = scanner.nextLine();
            	for(Monkey monkey: monkeyList) {
            		if (monkey.getInServiceCountry().equalsIgnoreCase(input)) {
            			if (monkey.getTrainingStatus().equalsIgnoreCase("In service")) {
            				if (monkey.getReserved() == false) {
            					System.out.println("There is an in service monkey in the country " + input);
            					System.out.println("that is not reserved.");
                				monkey.setReserved(true);
                				monkey.print();
                				return;
            				}
            			}
            		}
            	}
            	
            	System.out.println("There are no in service monkeys in the country " + input);
            	System.out.println("that are not reserved.");
            }
            
            else {
            	System.out.println("There are no in service animals of the type " + input);
            	System.out.println("that are not reserved.");
            }
        }

        
        //Prints animals to screen based on input
        public static void printAnimals(String caseInput) {
            switch (caseInput) {
            	// Prints dogList
            	case "4":
            		System.out.println("Here is our list of dogs");
            		for (int i = 0; i < dogList.size(); i++) {
            			System.out.println("Name: " + dogList.get(i).getName());
            			System.out.println("Status: " + dogList.get(i).getTrainingStatus());
            			System.out.println("Acquisition country: " + dogList.get(i).getAcquisitionCountry());
            			System.out.println("Reserved: " + dogList.get(i).getReserved());
            			System.out.println("");
            		}
            		break;
            	
            	// Prints monkeyList
            	case "5":
            		System.out.println("Here is our list of monkeys");
            		for (int i = 0; i < monkeyList.size(); i++) {
            			System.out.println("Name: " + monkeyList.get(i).getName());
            			System.out.println("Status: " + monkeyList.get(i).getTrainingStatus());
            			System.out.println("Acquisition country: " + monkeyList.get(i).getAcquisitionCountry());
            			System.out.println("Reserved: " + monkeyList.get(i).getReserved());
            			System.out.println("");
            		}
            		break;
            	
            	// Prints animals from both lists that are in service and not reserved
            	case "6":
            		System.out.println("Here is our list of fully trained (In service)");
            		System.out.println("animals that are not reserved.");
            		
            		for (int i = 0; i < dogList.size(); i++) {
            			if ((dogList.get(i).getTrainingStatus().equalsIgnoreCase("In service")) &&
            				(dogList.get(i).getReserved() == false)) {
            				System.out.println("Name: " + dogList.get(i).getName());
                			System.out.println("Status: " + dogList.get(i).getTrainingStatus());
                			System.out.println("Acquisition country: " + dogList.get(i).getAcquisitionCountry());
                			System.out.println("Reserved: " + dogList.get(i).getReserved());
                			System.out.println("");
            			}
            		}
            		
            		for (int i = 0; i < monkeyList.size(); i++) {
            			if ((monkeyList.get(i).getTrainingStatus().equalsIgnoreCase("In service")) &&
            				(monkeyList.get(i).getReserved() == false)) {
            				System.out.println("Name: " + monkeyList.get(i).getName());
                			System.out.println("Status: " + monkeyList.get(i).getTrainingStatus());
                			System.out.println("Acquisition country: " + monkeyList.get(i).getAcquisitionCountry());
                			System.out.println("Reserved: " + monkeyList.get(i).getReserved());
                			System.out.println("");
            			}
            		}
            		break;
            		
            	default:
            		System.out.println("Error");
            		break;
            		
            }
        }
}

