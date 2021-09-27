package mini.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mini.dto.Post;
import mini.util.DBcon;

public class PostDAO {
	private String query;
	private PreparedStatement pstmt;
	private boolean result;
	private ResultSet rs;

	// Post ���
	public List<Post> selectPostList() {
		query = "SELECT postId, postThumb, postSub, regDate FROM dega_post ORDER BY regDate DESC";
		List<Post> tempList = new ArrayList<Post>();

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Post temp = new Post();

				temp.setPostId(rs.getInt("postId")); // �Խù� ��ȣ
				temp.setPostThumb(rs.getString("postThumb")); //������
				temp.setPostSub(rs.getString("postSub")); // ����
				temp.setRegDate(rs.getDate("regDate")); // �ۼ���

				tempList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(rs, pstmt);
		}
		return tempList;
	}

	// Post ���
	public boolean addPost(Post post) {
		query = "INSERT INTO dega_post VALUES(dega_post_seq.NEXTVAL,?, ?, ?, DEFAULT)"; // �����, ����, ���빰
		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			//�Խñ� ������ ���� �� �ֱ� ������, 2000byte �̻��� �幮�� �����͸� ��Ʈ�����·� ��ȯ���Ѽ� �־��� ����.
			//String contentStream = post.getContent();

			pstmt.setString(1, post.getPostThumb());
			pstmt.setString(2, post.getPostSub());
			pstmt.setString(3, post.getContent());
			

			if (pstmt.executeUpdate() == 1) {// ���� ���� ���� ��
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(pstmt);
		}
		return result;
	}

	// �Խù� ����
	public boolean updatePost(Post post) {

		query = "UPDATE dega_post SET postThumb = ?, postSub = ?, content = ? WHERE postId = ?";

		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setString(1, post.getPostThumb());
			pstmt.setString(2, post.getPostSub());
			pstmt.setString(3, post.getContent());
			pstmt.setInt(4, post.getPostId());

			if (pstmt.executeUpdate() == 1) {// ���� ��
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(rs, pstmt);
		}
		return result;
	}

	// post ������ȸ
	public Post selectPost(int postId) {
		Post temp = null;
		query = "SELECT * FROM dega_post WHERE postId = ?";
		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setInt(1, postId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				StringBuffer output = new StringBuffer();
				Reader input = rs.getCharacterStream("content");
				char[] buffer = new char[1024];
				int byteRead = 0;
				try {
					while((byteRead = input.read(buffer,0,1024))!= -1) {
						output.append(buffer,0,byteRead);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				temp = new Post();
				temp.setPostId(postId);
				temp.setPostThumb(rs.getString("postThumb"));
				temp.setPostSub(rs.getString("postSub"));
				//temp.setContent(rs.getString("content"));
				temp.setContent(output.toString());
				temp.setRegDate(rs.getDate("regDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBcon.close(rs, pstmt);
		}
		return temp;
	}

	// post ����
	public boolean delPost(int postId) {
		query = "DELETE dega_post WHERE postId = ?";
		try {
			pstmt = DBcon.getConnection().prepareStatement(query);
			pstmt.setInt(1, postId);
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