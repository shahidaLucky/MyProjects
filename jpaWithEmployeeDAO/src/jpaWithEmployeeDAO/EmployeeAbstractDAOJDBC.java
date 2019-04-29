package jpaWithEmployeeDAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class EmployeeAbstractDAOJDBC {
	// 1. Register the Driver for java
	
			// 2. Establish Connection to the Database
			private final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			private final String username = "user_db";
			private final String password = "Pass123";
			private final Driver driver = new oracle.jdbc.driver.OracleDriver();
			
			protected Connection conn = null;
			protected PreparedStatement ps = null;
			protected ResultSet rs =null;

			//connection 
			public void connect() throws SQLConnectionException {
				try {
					DriverManager.registerDriver(driver);
					conn = DriverManager.getConnection(url, username, password);
				} catch (SQLException e) {
					throw new SQLConnectionException(e.getMessage());
				}
			}
	
}
