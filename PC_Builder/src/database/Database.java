package database;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import builder.PcComponent;

public class Database {

	public static Connection connectToDatabase() {

		try {
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static List<PcComponent> getAllCpus() {

		List<PcComponent> cpuList = new ArrayList<>();
		Connection con = connectToDatabase();
		try {
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from CPU");

			while (resultSet.next()) {
				String partName = resultSet.getString("NAME");
				BigDecimal watts = resultSet.getBigDecimal("WATTS");
				BigDecimal price = resultSet.getBigDecimal("PRICE");
				int rating = resultSet.getInt("RATING");
				String interfacename = resultSet.getString("INTERFACENAME");

				PcComponent pcComponent = new PcComponent(partName, price, rating, interfacename, watts);
				cpuList.add(pcComponent);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return cpuList;
	}

}
