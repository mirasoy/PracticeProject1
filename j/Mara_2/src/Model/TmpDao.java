package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Controller.InputCont;
import View.ViewResource;

public class TmpDao {
	PreparedStatement pstmt;
	Connection con;
	ResultSet rs;
	Statement statement;
	int no;

	public void connect(String menu, int price, String option) {
		connect();
		String inputSTR = "insert into tmp(menu,count,price,option) values (?,?,?,?)";
		String updateSTR = "update  tmp set count =?, price = ? where no=?";

		try {

			pstmt = con.prepareStatement(inputSTR);

			pstmt.setString(1, menu);
			pstmt.setInt(2, 1);
			pstmt.setInt(3, price);
			pstmt.setString(4, option);
			pstmt.executeUpdate();

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

	public void addOP(String addOp, int price) {
		connect();
		String inputSTR = "insert into tmp(menu,count,price) values (?,?,?)";
		String updateSTR = "update  tmp set count =?, price = ? where menu=?";

		try {
			statement = con.createStatement();
			rs = statement.executeQuery("SELECT * FROM TMP ");

			while (rs.next()) {

				if (rs.getString(2).equals(addOp)) {
					pstmt = con.prepareStatement(updateSTR);
					int countUP = rs.getInt(3) + 1;

					pstmt.setInt(1, countUP);
					pstmt.setInt(2, countUP * price);
					pstmt.setString(3, addOp);

					pstmt.executeUpdate();
					return;
				}
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {

			pstmt = con.prepareStatement(inputSTR);
			pstmt.setString(1, addOp);
			pstmt.setInt(2, 1);
			pstmt.setInt(3, price);
			pstmt.executeUpdate();

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

	public Vector<Vector> allList() {
		Vector tmplist = new Vector<>();
		connect();
		try {
			statement = con.createStatement();

			rs = statement.executeQuery("SELECT * FROM TMPsave ");
			while (rs.next()) {
				Vector v = new Vector<>();
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));

				tmplist.add(v);
			}

			rs = statement.executeQuery("SELECT * FROM TMP ");
			while (rs.next()) {
				Vector v = new Vector<>();
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));

				tmplist.add(v);
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

	public int nowPrice() {
		connect();
		try {
			statement = con.createStatement();
			rs = statement.executeQuery("select sum(price) from tmp");
			rs.next();
			int sum1 = rs.getInt(1);
			rs = statement.executeQuery("select sum(price) from tmpsave");
			rs.next();
			int sum2 = rs.getInt(1);

			return sum1 + sum2;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void del(int selectedRow) {
		connect();

		try {

			statement = con.createStatement();

			String delete = "delete from tmp where no = ?";
			pstmt = con.prepareStatement(delete);
			pstmt.setInt(1, selectedRow);
			pstmt.executeUpdate();
			String delete2 = "delete from tmpsave where no = ?";
			pstmt = con.prepareStatement(delete2);
			pstmt.setInt(1, selectedRow);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

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

	public void delall() {
		connect();
		try {
			statement = con.createStatement();
			pstmt = con.prepareStatement("delete from tmp");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean mainDel(int no2) {
		connect();
		boolean card1 = false;
		boolean card2 = false;
		try {

			String find = "select *from tmp";
			String find2 = "select *from tmpsave";
			String delete = "delete from tmp where no = ?";
			String delete2 = "delete from tmpsave where no = ?";

			statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			rs = statement.executeQuery(find);

			

			while (rs.next()) {
				if (rs.getInt(1) == no2) {
					pstmt = con.prepareStatement(delete);
					pstmt.setInt(1, no2);
					pstmt.executeUpdate();
					card1 = true;
					
				}
			}
			if (card1) {
				rs.first();

				while (rs.next()) {
					if (rs.getString(2).indexOf("마라") != -1) {
						break;
						
					}

					if (rs.getString(2).indexOf("└") != -1) {
						System.out.println("hi");
						pstmt = con.prepareStatement(delete);
						pstmt.setInt(1, rs.getInt(1));
						pstmt.executeUpdate();

					}
				}
			}

			statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = statement.executeQuery(find2);

			while (rs.next()) {
				if (rs.getInt(1) == no2) {
					pstmt = con.prepareStatement(delete2);
					pstmt.setInt(1, no2);
					pstmt.executeUpdate();
					card2 = true;
				}
			}
			if (card2) {
				rs.first();

				while (rs.next()) {
					if (rs.getString(2).indexOf("마라") != -1) {
						break;
					}
					if (rs.getString(2).indexOf("└") != -1) {
						pstmt = con.prepareStatement(delete2);
						pstmt.setInt(1, rs.getInt(1));
						pstmt.executeUpdate();

					}
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return card1;
	}

	public void delall2() {
		connect();
		try {
			statement = con.createStatement();
			pstmt = con.prepareStatement("delete from tmpsave");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
