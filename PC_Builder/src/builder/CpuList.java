package builder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CpuList {

	// Capital letters --> Convention for constant valuer in jave

	private static final String COMMA_DELIMITER = ";";

	// static --> method can be called directly from the class without an object.
	// THis is called classmethod.
	public static List<PcComponent> readCpuFromFile() {

		boolean firstLineRead = false;

		List<PcComponent> cpuList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("cpu.csv"))) {
			String line;

			if (firstLineRead == false) {
				br.readLine();
				firstLineRead = true;
			}
			while ((line = br.readLine()) != null) {

				String[] values = line.split(COMMA_DELIMITER);

				// index from 0 = first column
				// integer.parsint is also a classmethod. Same as above.
				PcComponent newCpu = new PcComponent(values[0], new BigDecimal(values[2]), Integer.parseInt(values[3]),
						values[4], new BigDecimal(values[1]));
				cpuList.add(newCpu);

			}

		}
		// if the file doesnt exist, java must have the exception. Then an exception
		// must be thrown for stability.
		catch (Exception ex) {
			ex.printStackTrace();
		}

		// object does not require brackets.
		return cpuList;
	}
}