package homework;

public class TV extends Samsung {
	String utilityName = "TV";
	String modelNo;
	int size;

	public TV(String color, String modelNo, int size) {
		super(color);
		this.modelNo = modelNo;
		this.size = size;
	}

	public static void main(String[] args) {
		TV tv_Object = new TV("Black", "LC-400FG", 55);

		tv_Object.makingElectronicItme();
		TV.employeeHike();

		String allDetails = tv_Object.displayDetails();
		System.out.println(allDetails);

		tv_Object.turnOn();
		tv_Object.turnOff();

	}

	public String displayDetails() {
		System.out.println(super.ElectronicDetails() + " : " + utilityName);
		return this.toString() + " , Model No  : " + this.modelNo + " , Size : " + this.size;
	}

	public String toString() {
		return "Color : " + super.color + " , Certification : " + super.certified + " , Eshtablishment Year : "
				+ super.Eshtablishment_year;
	}

	public void soundOn() {
		System.out.println("Sound is Coming....");
	}

	public void soundOff() {
		System.out.println("Sound is Stoped...");
	}

	@Override
	public void turnOn() {
		System.out.println(this.utilityName + " is ON.. ");
		this.soundOn();

	}

	@Override
	public void turnOff() {

		System.out.println(this.utilityName + " is OFF.. ");
		this.soundOff();
	}

}

/*abstract class Samsung {
	final static String name = "Samsung";
	String color;
	final String certified = "ISI Marked";
	final int Eshtablishment_year = 1998;

	Samsung(String color) {
		this.color = color;
	}

	public String ElectronicDetails() {
		return "......Electronic item  Details....";
	}

	public void makingElectronicItme() {
		System.out.println(name + " makes electronic item..");
	}

	public static void employeeHike() {
		System.out.println(name + " gives employee hike..");
	}

	public abstract void turnOn();

	public abstract void turnOff();

}*/
