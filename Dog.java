
public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;
    
    // Default constructor
 	public Dog() {
 	}
    
    // Constructor
    public Dog(String name, String animalType, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setAnimalType(animalType);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
    
    @Override
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Animal type: " + animalType);
		System.out.println("Breed: " + breed);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Acquisition date: " + acquisitionDate);
		System.out.println("Acquisition country: " + acquisitionCountry);
		System.out.println("Training status: " + trainingStatus);
		System.out.println("Rserved: " + reserved);
		System.out.println("In Service Country: " + inServiceCountry);
		System.out.println("");
	}

}
