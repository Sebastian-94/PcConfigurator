package main;

// if main method is present, it can be run as java application. If no main is available, then only server is available. 
import java.math.BigDecimal;
import java.util.List;

import builder.Pc;
import builder.PcComponent;
import builder.TaxMan;
import fileImports.CaseList;
import fileImports.CpuList;
import fileImports.GpuList;
import fileImports.HardDriveList;
import fileImports.MainBoardList;
import fileImports.PsuList;
import fileImports.RamList;

public class Main {
	public static void main(String[] args) {

		PcComponent cpu = new PcComponent("I5", new BigDecimal(279), 5, "Socket 1122", new BigDecimal(150));
		PcComponent gpu = new PcComponent("RTX2070", new BigDecimal(399), 6, "pci-e", new BigDecimal(250));
		PcComponent ramMemory = new PcComponent("ASUSRAM", new BigDecimal(99), 4, "pci-e2", new BigDecimal(30));
		PcComponent hardDisc = new PcComponent("baracuda", new BigDecimal(79), 4, "sata", new BigDecimal(40));
		PcComponent ssd = new PcComponent("corsair", new BigDecimal(150), 4, "sata", new BigDecimal(20));
		PcComponent motherBoard = new PcComponent("asus", new BigDecimal(150), 4, "standard", new BigDecimal(50));
		PcComponent pcCase = new PcComponent("BeQuiet", new BigDecimal(79), 5, "ATX", new BigDecimal(0));

		Pc myNewComputer = new Pc(motherBoard, hardDisc, cpu, gpu, ssd, ramMemory, pcCase);

		TaxMan steve = new TaxMan(1.19, myNewComputer);

		System.out.println("The total net price of all components is " + myNewComputer.calculatePrice() + " €");
		System.out.println("The final Ratail price of your PC is " + steve.generateRetailPrice() + " €");
		System.out.println("The total power consumption of your PC is " + myNewComputer.calculateWatts() + " Watts");

		// classes are totally seperated. Therefore, the names can be the same in a
		// different class.
		List<PcComponent> cpuList = CpuList.readCpuFromFile();
		// for loop that goes through all objects
		for (PcComponent comp : cpuList) {
			System.out.println(comp);
		}

		List<PcComponent> gpuList = GpuList.readGpuFromFile();
		// for loop that goes through all objects
		for (PcComponent compg : gpuList) {
			System.out.println(compg);
		}

		List<PcComponent> ramList = RamList.readRamFromFile();
		// for loop that goes through all objects
		for (PcComponent compr : ramList) {
			System.out.println(compr);
		}
		List<PcComponent> caseList = CaseList.readCaseFromFile();
		// for loop that goes through all objects
		for (PcComponent compc : caseList) {
			System.out.println(compc);
		}
		List<PcComponent> hardDriveList = HardDriveList.readHardDriveFromFile();
		// for loop that goes through all objects
		for (PcComponent comph : hardDriveList) {
			System.out.println(comph);

		}
		List<PcComponent> psuList = PsuList.readPsuFromFile();
		// for loop that goes through all objects
		for (PcComponent compp : psuList) {
			System.out.println(compp);
		}
		List<PcComponent> mainBoardList = MainBoardList.readMainBoardFromFile();
		// for loop that goes through all objects
		for (PcComponent compm : mainBoardList) {
			System.out.println(compm);
		}
	}

}
// Homework:
// 1) Fix all camelcase mistakes.
// 2) Add TaxRate, add TaxRate before returning the finalprice
// 3) New Classes --> extend each component with power consumption in Watts. At the end we can add total consumption, to check powercunsumption unit

// Homework2: 
// 1) create new CSV Files for other PcComponents. 
// 1.5 show them on terminal 
// 2) install AGE2 --> Download.
// 3) install apache Maven --> Database driver connects to the database. 

// Homework3: 
// new class with the name interface. one variable in the class --> Name (PCIe, etc., ) and optional speed, attributes, etc
// finalize the other components in JavaFx