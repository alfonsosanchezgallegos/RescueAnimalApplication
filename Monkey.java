
public class Monkey extends RescueAnimal {

	// Instance variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	// Default constructor
	public Monkey() {
	}
	
	// Constructor
	public Monkey(String name, String animalType, String species, String gender, String age,
		    String weight, String height, String bodyLength, String tailLength, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
		setAnimalType(animalType);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setBodyLength(bodyLength);
        setTailLength(tailLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Animal type: " + animalType);
		System.out.println("Species: " + species);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Height: " + height);
		System.out.println("Body length: " + bodyLength);
		System.out.println("Tail length: " + tailLength);
		System.out.println("Acquisition date: " + acquisitionDate);
		System.out.println("Acquisition country: " + acquisitionCountry);
		System.out.println("Training status: " + trainingStatus);
		System.out.println("Rserved: " + reserved);
		System.out.println("In Service Country: " + inServiceCountry);
		System.out.println("");
	}
	
}
