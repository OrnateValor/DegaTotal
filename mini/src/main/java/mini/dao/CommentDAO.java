package mini.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mini.dto.Comment;
import mini.util.DBcon;

public class CommentDAO {
	private String query;
	private PreparedStatement pstmt;
	private boolean result;
	private ResultSet rs;

	// ��� �Է�
	public boolean addCmt(Comment cmt) {
		query = "INSERT INTO T_COMMENT VALUES(t_comment_seq.NEXTVAL, ?, ?, ?, ?, DEFAULT)";

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);

			pstmt.setString(1, cmt.getUserId());
			pstmt.setString(2, cmt.getUserNm());
			pstmt.setString(3, cmt.getUserCmt());
			pstmt.setString(4, cmt.getPostId());

			if (pstmt.executeUpdate() == 1) { // ���� ��
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}
		return result;
	}

	// ��ü ���
	public int selectTotalCmt(String itemId) {
		// itemId�� �޾�, �ش� �������� ��� �� Ž��
		query = "SELECT COUNT(*) FROM t_comment WHERE postId = ?";
		int total = 0;

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setString(1, itemId);
			rs = pstmt.executeQuery();

			if (rs.next()) { // ���� ��
				total = rs.getInt(1); // ù��° �÷��� ���� INT�� �ޱ�.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(rs, pstmt);
		}

		return total;
	}

	// ��� ����Ʈ
	public List<Comment> cmtList(String itemId) {
		query = "SELECT * FROM t_comment WHERE postId = ? ORDER BY regDate DESC"; // �ֱ� ����� ���� �ö���� �����Ͽ� �ش� �������� ��� ��ȸ
		List<Comment> tempList = new ArrayList<Comment>(); // ���� ��� ���� ����

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setString(1, itemId);

			rs = pstmt.executeQuery();// ������ ����

			while (rs.next()) {
				Comment tempCmt = new Comment(); // �ݺ������� ����ϳ��� �ҷ�����
				tempCmt.setCmtNum(rs.getInt("cmtNum"));
				tempCmt.setUserId(rs.getString("userId"));
				tempCmt.setUserNm(rs.getString("userNm"));
				tempCmt.setUserCmt(rs.getString("userCmt"));
				tempCmt.setPostId(rs.getString("postId"));
				tempCmt.setRegDate(rs.getDate("regDate"));

				tempList.add(tempCmt);// ������ ��۵� List�� �߰�
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBcon.close(rs, pstmt);
		}

		return tempList;
	}

	// ��� ����
	public boolean delCmt(int cmtNum) { // ��� ��ȣ�� �޾� ����
		query = "DELETE t_comment WHERE cmtNum = ?";

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setInt(1, cmtNum);
			if (pstmt.executeUpdate() == 1) {// ���� ��
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}

		return result;
	}
}