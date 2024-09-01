package com.sourav.ui.testcases;

import java.sql.ResultSet;

import org.testng.annotations.Test;

import com.sourav.utilities.DatabaseUtils;

public class DatabaseTest {
	
	/** query for create table and insert some values through mysql server (command line)
	 * 
	 * 
	 * 
	 * -- Step 1: Create the table
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2)
);

-- Step 2: Insert some values into the table
INSERT INTO employees (first_name, last_name, salary)
VALUES
('John', 'Doe', 50000.00),
('Jane', 'Smith', 60000.00),
('Robert', 'Johnson', 70000.00),
('Emily', 'Davis', 80000.00);

	 */
	@Test
	public void testDatabase()
	{
		 // Create an instance of DatabaseUtils
        DatabaseUtils dbUtils = new DatabaseUtils();

        try {
            // Connect to the database
            dbUtils.connectToDatabase();

            // Execute a query
            String query = "select salary from employees where first_name='Emily'";
            ResultSet resultSet = dbUtils.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
//                System.out.println("ID: " + resultSet.getInt("id"));
//                System.out.println("First Name: " + resultSet.getString("first_name"));
//                System.out.println("Last Name: " + resultSet.getString("last_name"));
                System.out.println("Salary: " + resultSet.getDouble("salary"));
                System.out.println("------------");
            }

            // Close the connection
            dbUtils.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

	}


