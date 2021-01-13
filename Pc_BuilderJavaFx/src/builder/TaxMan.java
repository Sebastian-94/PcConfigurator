package builder;

import java.math.BigDecimal;

public class TaxMan {

	double taxRate;
	private Pc pc;

	public TaxMan(double taxRate, Pc pc) {
		this.taxRate = taxRate;
		this.pc = pc;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	// How to add Taxrate from other Class?
	public BigDecimal generateRetailPrice() {

		return (pc.getMotherBoard().getPartPrice().add(pc.getHardDisc().getPartPrice()).add(pc.getCpu().getPartPrice())
				.add(pc.getGpu().getPartPrice()).add(pc.getSsd().getPartPrice()).add(pc.getPcCase().getPartPrice())
				.add(pc.getRamMemory().getPartPrice())).multiply(BigDecimal.valueOf(taxRate));
	}

	public Pc getPc() {
		return pc;
	}

	public void setPc(Pc pc) {
		this.pc = pc;
	}
}
