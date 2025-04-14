
public class Pet {
	// attributes
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	private int catSpaceNumber;
	
	// pet constructor
	public Pet(String petType, String petName, int petAge, int daysStay, int catSpaceNumber) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
		this.catSpaceNumber = catSpaceNumber;
	}
	
	// pet methods
	public String getPetType() {
		return petType;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	public int getDogSpaces() {
		return dogSpaces;
	}
	
	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}
	
	public int getCatSpaces() {
		return catSpaces;
	}
	
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	
	public int getCatSpaceNumber() {
		return catSpaceNumber;
	}
	public void setCatSpaceNumber(int catSpaceNumber) {
		this.catSpaceNumber = catSpaceNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
