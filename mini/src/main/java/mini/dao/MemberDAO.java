package mini.dao;

//java Import
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//project Import
import mini.dto.Member;
import mini.util.DBcon;

public class MemberDAO {
	// ��� ����
	private String query; // �������� ���� ����
	private Connection con; // Ŀ�ؼ�. DBcon���� getConnection���� �޾ƿð���
	private PreparedStatement pstmt;
	private ResultSet rs; // DQL ��ȯ�� ResultSet
	private boolean result;// �������� üũ

	// ������ ���� Ȯ��
	public boolean isProperties(String sid) {
		query = "SELECT properties FROM member WHERE sid=?";

		try {
			con = DBcon.getConnection();

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, sid);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getInt("properties") == 1) {
					result = true;
				} else {
					result = false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}
		return result;
	}

	// ȸ�� ����
	public boolean joinUser(Member member) {// �Խù� ���

		query = "INSERT INTO Member VALUES(?, ?, ?, ?, ?, DEFAULT, DEFAULT)";

		try {
			con = DBcon.getConnection();

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPW());
			pstmt.setString(3, member.getUserNm());
			pstmt.setString(4, member.getUserEmail());
			pstmt.setString(5, member.getUserImg());

			// ����, executeUpdate �ÿ��� query�� ���� �ȹ޾Ƶ� �ȴ�.
			if (pstmt.executeUpdate() == 1) {
				// ���� ���� ���� �� true
				result = true;
			} // �� �ܿ��� default�� false��.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}
		return result;
		// ����
	}

	// �α���
	public boolean loginUser(String userId, String userPw) {
		query = "SELECT * FROM member WHERE userId = ? AND userPw = ?";

		try {
			con = DBcon.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			rs = pstmt.executeQuery();

			if (rs.next()) { // ���� ���� ���� �� result = true
				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(rs, pstmt);
		}

		return result;
	}

	// ����������
	public Member getUserById(String userId) {
		query = "SELECT * FROM member WHERE userId = ?";
		Member temp = null;
		try {
			con = DBcon.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();

			if (rs.next()) { // ���� ���� ���� �� true
				temp = new Member();
				temp.setUserId(rs.getString("userId"));
				temp.setUserNm(rs.getString("userNm"));
				temp.setUserEmail(rs.getString("userEmail"));
				temp.setUserImg(rs.getString("userImg"));
				temp.setRegDate(rs.getDate("regDate"));
				temp.setProperties(rs.getInt("properties") == 1 ? true : false);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(rs, pstmt);
		}
		// �Խù� ��ü ��ȸ
		return temp;
	}

	// ȸ������ ����
	public boolean update(Member member) {// �Խù� ����
		// System.out.println(member.getPid()); //������
		query = "UPDATE member SET userPw = ?, userNm = ?, userEmail = ?, userImage = ?, WHERE userId = ?";

		try {
			con = DBcon.getConnection();

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getUserPW()); // ���
			pstmt.setString(2, member.getUserNm()); // �̸�
			pstmt.setString(3, member.getUserEmail()); // �̸���
			pstmt.setString(4, member.getUserImg()); // �̹���
			pstmt.setString(5, member.getUserId()); // id

			// ����, executeUpdate �ÿ��� query�� ���� �ȹ޾Ƶ� �ȴ�.
			if (pstmt.executeUpdate() == 1) {
				// ���� ���� ���� �� true
				result = true;
			} // �� �ܿ��� default�� false��.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}
		return result;
		// ����
	}

	// ȸ��Ż��
	public boolean delete(String userId) {// �Խù� ����
		query = "DELETE member WHERE userId = ?";

		try {
			con = DBcon.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			if (pstmt.executeUpdate() == 1) {
				// ���� ���� ���� �� true
				result = true;
			} // �� �ܿ��� default�� false��.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}
		return result;
	}
}