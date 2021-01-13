
package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Uploader {
	public static Connection connection;
	public static String lese, schreibe;
	public static Statement stmt;
	public static ResultSet result;

	public static void main(String[] a) throws Exception
	// public static void verbindung() throws Exception
	{
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection("jdbc:h2:tcp:localhost/test", "sa", "");
		System.out.println("Verbindung hergestellt");
		// add application code here

		ResultSet rs = Csv.read("test.csv", null, null);
		ResultSetMetaData meta = rs.getMetaData();
		while (rs.next()) {
			for (int i = 0; i < meta.getColumnCount(); i++) {
				System.out.println(meta.getColumnLabel(i + 1) + ": " + rs.getString(i + 1));
			}
			System.out.println();
		}
		rs.close();

		lese = "Select * from test";
		stmt = connection.createStatement();

		result = stmt.executeQuery(lese);
		System.out.println(result);

		StartFrame frm = new StartFrame("Hauptseite");
		frm.setVisible(true);
		frm.setSize(400, 400);
		frm.setLocation(0, 0);
		frm.pack();
	}
}
