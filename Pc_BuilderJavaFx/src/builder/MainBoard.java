package builder;

import java.math.BigDecimal;

public class MainBoard extends PcComponent {

	// Interface as different class
	// combine interfaces on seperate parts.
	// keep it simple stupid

	String interfacename1 = "interfacename (harddisc)";
	String interfacename2 = "interfacename (size)";
	String interfacename3 = "interfacename (PCIe)";
	String interfacename4 = "interfacename (socket)";
	String interfacename5 = "interfacename (ram)";

	public MainBoard(String partname, BigDecimal partprice, int partrating, String interfacename1, BigDecimal watt,
			String interfacename2, String interfacename3, String interfacename4, String interfacename5) {
		super(partname, partprice, partrating, watt);
		this.interfacename1 = interfacename1;
		this.interfacename2 = interfacename2;
		this.interfacename3 = interfacename3;
		this.interfacename4 = interfacename4;
		this.interfacename5 = interfacename5;

	}

}
