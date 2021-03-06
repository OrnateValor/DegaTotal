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

	// 댓글 입력
	public boolean addCmt(Comment cmt) {
		query = "INSERT INTO T_COMMENT VALUES(t_comment_seq.NEXTVAL, ?, ?, ?, ?, DEFAULT)";

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);

			pstmt.setString(1, cmt.getUserId());
			pstmt.setString(2, cmt.getUserNm());
			pstmt.setString(3, cmt.getUserCmt());
			pstmt.setString(4, cmt.getPostId());

			if (pstmt.executeUpdate() == 1) { // 성공 시
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}
		return result;
	}

	// 전체 댓글
	public int selectTotalCmt(String itemId) {
		// itemId를 받아, 해당 아이템의 댓글 수 탐색
		query = "SELECT COUNT(*) FROM t_comment WHERE postId = ?";
		int total = 0;

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setString(1, itemId);
			rs = pstmt.executeQuery();

			if (rs.next()) { // 성공 시
				total = rs.getInt(1); // 첫번째 컬럼의 값을 INT로 받기.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(rs, pstmt);
		}

		return total;
	}

	// 댓글 리스트
	public List<Comment> cmtList(String itemId) {
		query = "SELECT * FROM t_comment WHERE postId = ? ORDER BY regDate DESC"; // 최근 댓글이 위로 올라오게 정렬하여 해당 아이템의 댓글 조회
		List<Comment> tempList = new ArrayList<Comment>(); // 실행 결과 담을 놈임

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setString(1, itemId);

			rs = pstmt.executeQuery();// 쿼리문 실행

			while (rs.next()) {
				Comment tempCmt = new Comment(); // 반복문으로 댓글하나씩 불러오기
				tempCmt.setCmtNum(rs.getInt("cmtNum"));
				tempCmt.setUserId(rs.getString("userId"));
				tempCmt.setUserNm(rs.getString("userNm"));
				tempCmt.setUserCmt(rs.getString("userCmt"));
				tempCmt.setPostId(rs.getString("postId"));
				tempCmt.setRegDate(rs.getDate("regDate"));

				tempList.add(tempCmt);// 생성된 댓글들 List에 추가
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBcon.close(rs, pstmt);
		}

		return tempList;
	}

	// 댓글 삭제
	public boolean delCmt(int cmtNum) { // 댓글 번호를 받아 삭제
		query = "DELETE t_comment WHERE cmtNum = ?";

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setInt(1, cmtNum);
			if (pstmt.executeUpdate() == 1) {// 성공 시
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
