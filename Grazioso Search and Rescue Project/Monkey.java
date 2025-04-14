
public class Monkey extends RescueAnimal {
	
	// Instance variable
	// Monkey specific attributes
	private String species;
	private int tailLength;
	private int height;
	private int bodyLength;
	
	// Constructor
	public Monkey(String name, String species, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry, 
	String trainingStatus, boolean reserved, String inServiceCountry,
	int tailLength, int height, int bodyLength) {
		setName(name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		
	}
	
	// Accessor Method
	public String getSpecies() {
		return species;
	}
	
	public int getTailLength() {
		return tailLength;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getBodyLength() {
		return bodyLength;
	}
	
	// Mutator Method
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}
	
}
