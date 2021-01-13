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

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public BigDecimal getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(BigDecimal partPrice) {
		this.partPrice = partPrice;
	}

	public int getPartRating() {
		return partRating;
	}

	public void setPartRating(int partRating) {
		this.partRating = partRating;
	}

}
