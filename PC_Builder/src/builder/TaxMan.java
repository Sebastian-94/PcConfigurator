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

		return (pc.getMotherBoard().getPartprice().add(pc.getHardDisc().getPartprice()).add(pc.getCpu().getPartprice())
				.add(pc.getGpu().getPartprice()).add(pc.getSsd().getPartprice()).add(pc.getPcCase().getPartprice())
				.add(pc.getRamMemory().getPartprice())).multiply(BigDecimal.valueOf(taxRate));
	}

	public Pc getPc() {
		return pc;
	}

	public void setPc(Pc pc) {
		this.pc = pc;
	}
}
