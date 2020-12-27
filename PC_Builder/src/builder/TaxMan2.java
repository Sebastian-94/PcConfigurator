package builder;

import java.math.BigDecimal;

public class TaxMan2 extends Pc {

	double taxRate = 1.19;

	// public TaxMan2(PcComponent motherboard, PcComponent hardDisc, PcComponent
	// cpu, PcComponent gpu, PcComponent ssd,
	// PcComponent ramMemory, PcComponent pcCase, double taxRate) {
	// super(motherboard, hardDisc, cpu, gpu, ssd, pcCase, ramMemory);
	// this.taxRate = taxRate;
	// }

	// constructor- why not working?
	public TaxMan2() {

		super();
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	// How to add Taxrate from other Class?

	public BigDecimal generateRetailPrice() {

		return (motherBoard.getPartprice().add(hardDisc.getPartprice()).add(cpu.getPartprice()).add(gpu.getPartprice())
				.add(ssd.getPartprice()).add(pcCase.getPartprice()).add(ramMemory.getPartprice()))
						.multiply(BigDecimal.valueOf(taxRate));
	}
}
