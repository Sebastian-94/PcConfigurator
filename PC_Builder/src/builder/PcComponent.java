package builder;

import java.math.BigDecimal;

public class PcComponent extends Component {

	private String interfaceName;
	private BigDecimal watt;

	public PcComponent(String partname, BigDecimal partprice, int partrating, String interfaceName, BigDecimal watt) {
		super(partname, partprice, partrating);
		this.interfaceName = interfaceName;
		this.watt = watt;

	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public BigDecimal getWatt() {
		return watt;
	}

	public void setWatt(BigDecimal watt) {
		this.watt = watt;
	}

	@Override
	// Each class has to have a way to convert an object to the string
	// representation. CSV has to be printed. THis helps to convert an object to a
	// string format to display the values. This can save many lines of code.
	// (instead of sysout.
	public String toString() {
		return "PcComponent [interfaceName=" + interfaceName + ", watt=" + watt + ", getPartName()=" + getPartName()
				+ ", getPartprice()=" + getPartprice() + ", getPartRating()=" + getPartRating() + "]";
	}

}
