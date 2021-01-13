package builder;

import java.math.BigDecimal;

public class Pc {

	// what are these? Class Objects?
	public PcComponent motherBoard;
	public PcComponent hardDisc;
	public PcComponent cpu;
	public PcComponent gpu;
	public PcComponent ssd;
	public PcComponent ramMemory;
	public PcComponent pcCase;

	// constructor?
	public Pc(PcComponent motherBoard, PcComponent hardDisc, PcComponent cpu, PcComponent gpu, PcComponent ssd,
			PcComponent ramMemory, PcComponent pcCase) {
		super();
		this.motherBoard = motherBoard;
		this.hardDisc = hardDisc;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ssd = ssd;
		this.ramMemory = ramMemory;
		this.pcCase = pcCase;
	}

	public Pc() {

	}

	public PcComponent getPcCase() {
		return pcCase;
	}

	public void setPcCase(PcComponent pcCase) {
		this.pcCase = pcCase;
	}

	public PcComponent getMotherBoard() {
		return motherBoard;
	}

	public void setMotherboard(PcComponent motherBoard) {
		this.motherBoard = motherBoard;
	}

	public PcComponent getHardDisc() {
		return hardDisc;
	}

	public void setHardDisc(PcComponent hardDisc) {
		this.hardDisc = hardDisc;
	}

	public PcComponent getCpu() {
		return cpu;
	}

	public void setCpu(PcComponent cpu) {
		this.cpu = cpu;
	}

	public PcComponent getGpu() {
		return gpu;
	}

	public void setGpu(PcComponent gpu) {
		this.gpu = gpu;
	}

	public PcComponent getSsd() {
		return ssd;
	}

	public void setSsd(PcComponent ssd) {
		this.ssd = ssd;
	}

	public PcComponent getRamMemory() {
		return ramMemory;
	}

	public void setRamMemory(PcComponent ramMemory) {
		this.ramMemory = ramMemory;
	}

	public BigDecimal calculatePrice() {
		// add prices

		return motherBoard.getPartPrice().add(hardDisc.getPartPrice()).add(cpu.getPartPrice()).add(gpu.getPartPrice())
				.add(ssd.getPartPrice()).add(pcCase.getPartPrice()).add(ramMemory.getPartPrice());

	}

	public BigDecimal calculateWatts() {

		return motherBoard.getWatt().add(hardDisc.getWatt()).add(cpu.getWatt()).add(gpu.getWatt()).add(ssd.getWatt())
				.add(pcCase.getWatt()).add(ramMemory.getWatt());
	}

}
