package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturedDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {		
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" (used) $ ");
		sb.append(String.format("%.2f", getPrice()));
		sb.append(" Manufacture date " + sdf.format(getManufacturedDate()) );
		return sb.toString();
	}
}
