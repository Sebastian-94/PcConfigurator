package builder;

import java.math.BigDecimal;

public abstract class Component {

	// Money --> BigDecimal
	private String partName;
	private BigDecimal partPrice;
	private int partRating;

	public Component(String partName, BigDecimal partPrice, int partRating) {
		super();
		this.partName = partName;
		this.partPrice = partPrice;
		this.partRating = partRating;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartname(String partName) {
		this.partName = partName;
	}

	public BigDecimal getPartprice() {
		return partPrice;
	}

	public void setPartprice(BigDecimal partPrice) {
		this.partPrice = partPrice;
	}

	public int getPartRating() {
		return partRating;
	}

	public void setPartrating(int partRating) {
		this.partRating = partRating;
	}

}
