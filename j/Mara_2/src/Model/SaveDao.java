package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class SaveDao {

	PreparedStatement pstmt;
	Connection con;
	ResultSet rs;
	Statement statement;
	Statement statement2;

	
	
	public void connect() {
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	
	public Vector<Vector> allList() {
		Vector tmplist = new Vector<>();
		connect();
		try {
			statement = con.createStatement();
			rs = statement.executeQuery("SELECT * FROM TMP ");

			while (rs.next()) {
				String inputSTR = "insert into tmpsave(no, menu,count,price,option) values (?,?,?,?,?)";
				String delete = "delete from tmp where no = ?";
				pstmt = con.prepareStatement(inputSTR);
				pstmt.setInt(1, rs.getInt(1));
				pstmt.setInt(2, rs.getInt(2));
				pstmt.setInt(3, rs.getInt(3));
				pstmt.setInt(4, rs.getInt(4));
				pstmt.setInt(5, rs.getInt(5));
				pstmt.executeUpdate();
				
				pstmt = con.prepareStatement(inputSTR);
				pstmt.setInt(1, rs.getInt(1));
				pstmt.executeUpdate();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return tmplist;
	}


	public void save() {
		connect();
		
		try {
			statement = con.createStatement();
			rs = statement.executeQuery("SELECT * FROM TMP ");

			while (rs.next()) {
				String inputSTR = "insert into tmpsave(no, menu,count,price,option) values (?,?,?,?,?)";
				String delete = "delete from tmp where menu = ?";
				pstmt = con.prepareStatement(inputSTR);
				pstmt.setInt(1, rs.getInt(1));
				pstmt.setString(2, rs.getString(2));
				pstmt.setInt(3, rs.getInt(3));
				pstmt.setInt(4, rs.getInt(4));
				pstmt.setString(5, rs.getString(5));
				pstmt.executeUpdate();
				
				pstmt = con.prepareStatement(delete);
				pstmt.setString(1, rs.getString(2));
				pstmt.executeUpdate();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
		
		
		
	
}
