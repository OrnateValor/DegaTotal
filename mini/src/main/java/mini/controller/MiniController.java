package mini.controller;

import java.io.IOException;
//Servlet
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//DAO
import mini.dao.CommentDAO;
import mini.dao.ItemDAO;
import mini.dao.MemberDAO;
import mini.dao.PostDAO;
//DTO
import mini.dto.Comment;
import mini.dto.Item;
import mini.dto.Member;
import mini.dto.Post;

/**
 * Servlet implementation class ItemController
 */
@WebServlet("*.do")
public class MiniController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HttpSession session;
	private ItemDAO idao;
	private MemberDAO mdao;
	private CommentDAO cdao;
	private PostDAO pdao;

	private String url;
	private boolean result;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // �ѱ� ó��
		response.setContentType("text/html; charset=UTF-8");

		session = request.getSession();
		String requestURI = request.getRequestURI();
		// System.out.println("requestURI:" + requestURI);
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		idao = new ItemDAO();
		mdao = new MemberDAO();
		cdao = new CommentDAO();
		pdao = new PostDAO();

		switch (cmd) {
		// ������
		case "/itemList.do":
			itemList(request);
			break;
		case "/itemInfo.do":
			itemInfo(request);
			cmtList(request);
			break;
		case "/itemAdd.do":
			itemAdd(request);
			break;
		case "/itemInsert.do":
			itemInsert(request);
			response.sendRedirect(url);
			return;
		case "/itemMod.do":
			itemMod(request);
			break;
		case "/itemUpdate.do":
			itemUpdate(request);
			response.sendRedirect(url);
			return;
		case "/itemDel.do":
			itemDel(request);
			response.sendRedirect(url);
			return;
		// ���
		case "/addCmt.do":
			addCmt(request);
			response.sendRedirect(url);
			return;
		case "/delCmt.do":
			delCmt(request);
			response.sendRedirect(url);
			return;
		// �Խñ�
		case "/postList.do":
			postList(request);
			break;
		case "/postWrite.do":
			postWrite(request);
			break;
		case "/addPost.do":
			addPost(request);
			response.sendRedirect(url);
			return;
		case "/postView.do":
			postView(request);
			break;
		case "/postMod.do":
			postMod(request);
			break;
		case "/postUpdate.do":
			postUadate(request);
			response.sendRedirect(url);
			return;
		case "/postDel.do":
			postDel(request);
			response.sendRedirect(url);
			return;
		}

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	private void postDel(HttpServletRequest request) {
		int postId = Integer.parseInt(request.getParameter("postId"));
		String admin = (String) session.getAttribute("Admin");// ����Ȯ�ο�

		if (admin.equals("false")) {
			session.setAttribute("msg", "������ �����ϴ�.");
		} else {
			System.out.println("postId : " + postId);
			result = pdao.delPost(postId);
			// System.out.println("result : " + result);
			if (result) {// ���� ��,
				session.setAttribute("msg", "�Խù� ���� ����");
			} else {
				session.setAttribute("msg", "�Խù� ���� ����");
			}
			url = "/postList.do";
		}
	}
	//�Խñ� ���� ó��
	private void postUadate(HttpServletRequest request) {
		Post post = new Post(request);
		result = pdao.updatePost(post);
		if (result) {// ���� ��
			session.setAttribute("msg", "�Խñ� ������Ʈ");
		} else {
			session.setAttribute("msg", "�Խñ� ����");
		}
		url = "/postList.do";
	}

	// �Խù� ����
	private void postMod(HttpServletRequest request) {
		Post temp = null;
		int postId = Integer.parseInt(request.getParameter("postId"));
		String admin = (String) session.getAttribute("Admin");
		if (admin.equals("true")) {// ���� Ȯ��
			temp = pdao.selectPost(postId);
			// System.out.println("postId : " + temp.getPostId());
			System.out.println("postSub : " + temp.getPostSub());
			System.out.println("postThumb : " + temp.getPostThumb());
			System.out.println("content : " + temp.getContent());
			request.setAttribute("post", temp);
			url = "/_post/postMod.jsp?postId=" + postId;
		} else { // ���� ���� ��, ��������
			session.setAttribute("msg", "������ �����ϴ�.");
			url = "/postList.do";
		}
	}

	// �󼼺���
	private void postView(HttpServletRequest request) {
		Post temp = new Post(); // temp ��ü ����
		int postId = Integer.parseInt(request.getParameter("postId"));

		temp = pdao.selectPost(postId);

		if (temp != null) {
			request.setAttribute("post", temp);
			url = "/_post/postView.jsp?postId=" + postId;
		} else {
			session.setAttribute("msg", "�߸��� �Խù� �����Դϴ�.");
			url = "/postList.do";
		}
	}

	// ���
	private void postList(HttpServletRequest request) {
		request.setAttribute("postList", pdao.selectPostList());
		url = "/_post/postList.jsp";
	}

	// �Խù� �ۼ�
	private void postWrite(HttpServletRequest request) {
		String admin = (String) session.getAttribute("Admin");
		if (admin.equals("true")) {// ���� Ȯ��
			url = "/_post/postWrite.jsp";
		} else {
			session.setAttribute("msg", "������ �����ϴ�.");
			url = "/postList.do";
		}
	}

	// �Խù� �߰� ó��
	private void addPost(HttpServletRequest request) {
		Post post = new Post(request);
		result = pdao.addPost(post);
		if (result) {// ������
			session.setAttribute("msg", "�Խù� ��� ����");
		} else {
			session.setAttribute("msg", "�Խù� ��� ����");
		}
		url = "/postList.do";
	}

	// ��� ����Ʈ ���
	private void cmtList(HttpServletRequest request) {
		String postId = request.getParameter("itemId");
		request.setAttribute("totalCmt", cdao.selectTotalCmt(postId));
		if (cdao.cmtList(postId) != null) {
			request.setAttribute("cmtList", cdao.cmtList(postId));
		} else {
			session.setAttribute("cmtLoadErr", "��� ����� �ҷ��� �� �������ϴ�.");
		}
	}

	// ��� ���� ó��
	private void delCmt(HttpServletRequest request) {
		// System.out.println("cmtNum : "+request.getParameter("cmtNum"));
		// System.out.println("itemId : "+request.getParameter("itemId"));
		int cmtNum = 0;
		if (request.getParameter("cmtNum") != "") {
			cmtNum = Integer.parseInt(request.getParameter("cmtNum"));
		}
		result = cdao.delCmt(cmtNum);
		if (result) { // ������� ���� ��
			session.setAttribute("msg", "��� ���� ����");
		} else {
			session.setAttribute("msg", "��� ���� ����");
		}
		url = "/itemInfo.do?itemId=" + request.getParameter("itemId");
	}

	// ��� �߰�
	private void addCmt(HttpServletRequest request) {
		Comment cmt = new Comment(request);
		result = cdao.addCmt(cmt);
		if (!result) { // ������� ������ ��
			session.setAttribute("msg", "��� ��� ����");
		} else {
			// session.setAttribute("msg", "��� ��� ����");
		}
		url = "/itemInfo.do?itemId=" + cmt.getPostId();
	}

	// ������ ���
	private void itemInsert(HttpServletRequest request) {
		Item item = new Item();
		item.ItemInsert(request);
		result = idao.addItem(item);
		if (result) {
			session.setAttribute("msg", "������ ��� ����");
		} else {
			session.setAttribute("msg", "������ ��� ����");
		}
		url = "/itemList.do";
	}

	// ������ �ۼ� ��
	private void itemAdd(HttpServletRequest request) {
		String admin = (String) session.getAttribute("Admin");// ����Ȯ�ο�

		if (admin.equals("false")) {
			System.out.println("admin : " + admin);
			session.setAttribute("msg", "������ �����ϴ�.");
			url = "/itemList.do";
		} else { // ���� ���� �� �Ѿ
			url = "/itemInfo/itemAdd.jsp";
		}
	}

	// ������ ���� ó��
	private void itemUpdate(HttpServletRequest request) {
		Item item = new Item(request);
		result = idao.updateItem(item);
		if (result) {// ���� ��
			session.setAttribute("msg", "������ ���� ������Ʈ");
		} else {
			session.setAttribute("msg", "���� ������Ʈ ����");
		}
		url = "/itemList.do";
	}

	// ������ ������
	private void itemMod(HttpServletRequest request) {
		Item item = null;
		String admin = (String) session.getAttribute("Admin");// ����Ȯ�ο�
		if (admin.equals("false")) {
			session.setAttribute("msg", "������ �����ϴ�.");
		} else { // ���� ���� �� �Ѿ
			item = idao.selectItem(request.getParameter("itemId"));
			request.setAttribute("item", item);
			url = "/itemInfo/itemMod.jsp?itemId=" + request.getParameter("itemId");
		}
	}

	// ������ ����
	private void itemDel(HttpServletRequest request) {
		String itemId = null;
		String admin = (String) session.getAttribute("Admin");// ����Ȯ�ο�

		if (admin.equals("false")) {
			session.setAttribute("msg", "������ �����ϴ�.");
		} else {
			itemId = request.getParameter("itemId");
			// System.out.println("itemId : " + request.getParameter("itemId"));
			result = idao.delItem(itemId);
			// System.out.println("result : " + result);
			if (result) {// ���� ��,
				session.setAttribute("msg", "������ ���� ���� ����");
			} else {
				session.setAttribute("msg", "������ ���� ���� ����");
			}
		}
		url = "/itemList.do";
		System.out.println("msg : " + session.getAttribute("msg"));
		System.out.println("===================================");
	}

	// ������ �󼼺���
	private void itemInfo(HttpServletRequest request) {
		Item item = null;
		String itemId = request.getParameter("itemId");

		// ������ �޾ƿ���
		item = idao.selectItem(itemId);
		// System.out.println("totalCmt : "+ cdao.selectTotalCmt(itemId));
		// ����� ������ ������ �ۺ�
		if (item != null) { // ���������� ������ Ȯ��
			request.setAttribute("item", item);
			url = "/itemInfo/itemDetails.jsp?";
		} else {// ����
			session.setAttribute("msg", "�߸��� ������ �����Դϴ�.");
			url = "/itemList.do";

		}
	}

	private void itemList(HttpServletRequest request) {// ������ ���
		String sid = (String) session.getAttribute("sid");
		boolean prop = false;
		if (sid != null) {
			// System.out.println("sid : " + sid);
			Member smem = mdao.getUserById(sid);
			prop = smem.isProperties(); // ������ ���� Ȯ���ϱ�
		}
		/*
		 * //������ �ڵ� System.out.println("prop : " + prop); List<Item> iList =
		 * idao.selectItemList(); if(iList != null) {
		 * System.out.println("iList is not null"); }else {
		 * System.out.println("iList is null"); }
		 */

		request.setAttribute("itemList", idao.selectItemList()); // ������ ����Ʈ ��������
		if (prop) {
			url = "/itemInfo/itemList.jsp?admin=1";
		} else {
			url = "/itemInfo/itemList.jsp";
		}
	}
}