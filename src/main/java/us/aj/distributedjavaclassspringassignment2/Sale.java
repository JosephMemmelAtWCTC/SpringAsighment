package us.aj.distributedjavaclassspringassignment2;

public class Sale {
	private String name;
	private String countryName;
	private double price;
	private double tax;
	private double shipping;



	public Sale(String name, String countryName, double price, double tax) {
		this.name = name;
		this.countryName = countryName;
		this.price = price;
		this.tax = tax;
		this.shipping = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getShipping() {
		return shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	@Override
	public String toString() {
		return "Sale{" +
					   "name='" + name + '\'' +
					   ", countryName='" + countryName + '\'' +
					   ", price=" + price +
					   ", tax=" + tax +
					   ", shipping=" + shipping +
					   '}';
	}
}
