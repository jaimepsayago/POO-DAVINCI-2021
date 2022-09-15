package com.pucese;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class JDBCQueries

{

  public void displayData(String urlStr,String username,String password) throws ClassNotFoundException
  {

	  //Hard coded the required fields

	  String classNum = "CSC201A";
	  String sch ="MWF11";
	  String room ="H221";
	  
	  try
	  {
		System.out.println ("Loading Oracle driver");

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(urlStr,username,password);

		System.out.println ("Connected to the Oracle database");

		/*System.out.println("1. Insert into Student table");
		Statement st1 = conn.createStatement ();
		
		String q1 ="insert into Student values ('S1025','Roberts','Evan','CSC',0)";
		st1.executeUpdate(q1);
		conn.commit();
		st1.close();
		
		System.out.println("2. Print rows of a table using a statement");
		Statement st2 = conn.createStatement ();
		ResultSet rs2 = null;

		String q2 = "select e.stuId, s.firstName, s.lastName from Student s, enroll e where e.classNumber = 'CSC201A' and e.stuId = s.stuId";

		rs2 = st2.executeQuery(q2);

		while (rs2.next())
		{
			System.out.println(rs2.getString("stuId") + "\t" +rs2.getString("firstName") + "\t" + rs2.getString("lastName"));
		}
		
		st2.close();
		rs2.close();
		
		System.out.println("3. Passing the value as a parameter in query using prepared statement");
		
		ResultSet rs3 = null;
		
		String q3 = "select e.stuId, s.firstName, s.lastName from Student s, enroll e where e.classNumber = ? and e.stuId = s.stuId";

		PreparedStatement st3 = conn.prepareStatement(q3);

		st3.setString(1, classNum);

		rs3 = st3.executeQuery(); //Should not pass query string as a parameter when prepared statement is used.

		while (rs3.next())
		{
			System.out.println(rs3.getString("stuId") + "\t" +rs3.getString("firstName") + "\t" + rs3.getString("lastName"));
		}
		
		st3.close();
		rs3.close();
		
		System.out.println("4. Passing multiple parameters in query using prepared statement");
		
		String q4 = "select f.name from faculty f, class c where c.schedule = ? and c.room = ? and c.facId = f.facId";

		ResultSet rs4 = null;

		PreparedStatement st4 = conn.prepareStatement (q4);
		
		st4.setString(1, sch);
		st4.setString(2, room);

		rs4 = st4.executeQuery();

		while (rs4.next())
		{
			System.out.println(rs4.getString("name")+"\n");
		}

		st4.close();
		rs4.close();
		
		System.out.println("5. Calculate highest (letter) grade in class using callable statement");
		
		String proc = "create or replace procedure highGrade("
				+  " class in varchar,"
				+  " highestGrade out varchar) "
		+ "	is "
		+ "	begin "
		+ "	select min(e.grade) into highestGrade from enroll e where e.classNumber = class ;"
		+ "	end highGrade;";
	
		Statement st5 = conn.createStatement();
	    st5.executeQuery(proc);

	    CallableStatement cs = conn.prepareCall("call highGrade(?, ?)");
        cs.setString(1,classNum);
		cs.registerOutParameter(2, java.sql.Types.VARCHAR);
        cs.executeQuery();
        //String highestGrade = cs.getString(2);
		System.out.println("Class Highest Grade: "+cs.getString(2));
		
		st5.close();
		cs.close();
		conn.close();
	    System.out.println("Connection closed.");
*/
	}
	catch(SQLException sqlE)
	{
		sqlE.printStackTrace();
	}

  }

  public static void main (String args []) throws ClassNotFoundException
  {
		/*
		** Username and Password hard coded.
		*/

	    JDBCQueries ex = new JDBCQueries();
		ex.displayData("jdbc:oracle:thin:@localhost:49161:xe","SYSTEM","oracle");

  }

}
