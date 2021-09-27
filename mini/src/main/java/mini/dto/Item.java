package mini.dto;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class Item implements Serializable {

	public Item() {

	}

	public Item(HttpServletRequest request) {
		setItemId(request.getParameter("itemId"));
		setItemNm(request.getParameter("itemNm"));
		setItemDes(request.getParameter("itemDes"));
		setiRarity(request.getParameter("iRarity"));
		setiCategory(request.getParameter("iCategory"));
		setiSlot(request.getParameter("iSlot"));
		/////
		setPerkName1(request.getParameter("perkName1"));
		setPerkDes1(request.getParameter("perkDes1"));
		setPerkName2(request.getParameter("perkName2"));
		setPerkDes2(request.getParameter("perkDes2"));
		setPerkName3(request.getParameter("perkName3"));
		setPerkDes3(request.getParameter("perkDes3"));
		setPerkName4(request.getParameter("perkName4"));
		setPerkDes4(request.getParameter("perkDes4"));
		setPerkName5(request.getParameter("perkName5"));
		setPerkDes5(request.getParameter("perkDes5"));
		/////
		if (request.getParameter("RPM") != "") {
			setRPM(Integer.parseInt(request.getParameter("RPM")));
		} else {
			setRPM(0);
		}
		if (request.getParameter("MAGAZINE") != "") {
			setMAGAZINE(Integer.parseInt(request.getParameter("MAGAZINE")));
		} else {
			this.setMAGAZINE(0);
		}
		/////
		setSTAT1NM(request.getParameter("STAT1NM"));
		setSTAT1FIG(Integer.parseInt(request.getParameter("STAT1FIG")));
		setSTAT2NM(request.getParameter("STAT2NM"));
		setSTAT2FIG(Integer.parseInt(request.getParameter("STAT2FIG")));
		setSTAT3NM(request.getParameter("STAT3NM"));
		setSTAT3FIG(Integer.parseInt(request.getParameter("STAT3FIG")));
		setSTAT4NM(request.getParameter("STAT4NM"));
		setSTAT4FIG(Integer.parseInt(request.getParameter("STAT4FIG")));
		setSTAT5NM(request.getParameter("STAT5NM"));
		setSTAT5FIG(Integer.parseInt(request.getParameter("STAT5FIG")));

		// �̹��� ���� ó��
		if (request.getParameter("itemScr") != "") {
			setItemScr(request.getParameter("itemScr"));
		} else {
			setItemScr(request.getParameter("_itemScr"));
		}
		if (request.getParameter("itemIco") == "") {
			setItemIco(request.getParameter("_itemIco"));
		} else {
			setItemIco(request.getParameter("itemIco"));
		}
		if (request.getParameter("perkIco1") == "") {
			setPerkIco1(request.getParameter("_perkIco1"));
		} else {
			setPerkIco1(request.getParameter("perkIco1"));
		}
		if (request.getParameter("perkIco2") != "") {
			setPerkIco2(request.getParameter("perkIco2"));
		} else {
			setPerkIco2(request.getParameter("_perkIco2"));
		}
		if (request.getParameter("perkIco3") != "") {
			setPerkIco3(request.getParameter("perkIco3"));
		} else {
			setPerkIco3(request.getParameter("_perkIco3"));
		}
		if (request.getParameter("perkIco4") != "") {
			setPerkIco4(request.getParameter("perkIco4"));
		} else {
			setPerkIco4(request.getParameter("_perkIco4"));
		}
		if (request.getParameter("perkIco5") != "") {
			setPerkIco5(request.getParameter("perkIco5"));
		} else {
			setPerkIco5(request.getParameter("_perkIco5"));
		}
	}

	public void ItemInsert(HttpServletRequest request) {

		this.setItemNm(request.getParameter("itemNm"));
		this.setItemDes(request.getParameter("itemDes"));
		this.setiRarity(request.getParameter("iRarity"));
		this.setiCategory(request.getParameter("iCategory"));
		this.setiSlot(request.getParameter("iSlot"));
		/////
		this.setPerkName1(request.getParameter("perkName1"));
		this.setPerkDes1(request.getParameter("perkDes1"));
		this.setPerkName2(request.getParameter("perkName2"));
		this.setPerkDes2(request.getParameter("perkDes2"));
		this.setPerkName3(request.getParameter("perkName3"));
		this.setPerkDes3(request.getParameter("perkDes3"));
		this.setPerkName4(request.getParameter("perkName4"));
		this.setPerkDes4(request.getParameter("perkDes4"));
		this.setPerkName5(request.getParameter("perkName5"));
		this.setPerkDes5(request.getParameter("perkDes5"));
		/////
		if (request.getParameter("RPM") != "") {
			this.setRPM(Integer.parseInt(request.getParameter("RPM")));
		} else {
			this.setRPM(0);
		}
		if (request.getParameter("MAGAZINE") != "") {
			this.setMAGAZINE(Integer.parseInt(request.getParameter("MAGAZINE")));
		} else {
			this.setMAGAZINE(0);
		}
		/////
		setSTAT1NM(request.getParameter("STAT1NM"));
		setSTAT1FIG(Integer.parseInt(request.getParameter("STAT1FIG")));
		setSTAT2NM(request.getParameter("STAT2NM"));
		setSTAT2FIG(Integer.parseInt(request.getParameter("STAT2FIG")));
		setSTAT3NM(request.getParameter("STAT3NM"));
		setSTAT3FIG(Integer.parseInt(request.getParameter("STAT3FIG")));
		setSTAT4NM(request.getParameter("STAT4NM"));
		setSTAT4FIG(Integer.parseInt(request.getParameter("STAT4FIG")));
		setSTAT5NM(request.getParameter("STAT5NM"));
		setSTAT5FIG(Integer.parseInt(request.getParameter("STAT5FIG")));

		// �̹��� ���� ó��
		if (request.getParameter("itemScr") != "") {
			setItemScr(request.getParameter("itemScr"));
		} else {
			setItemScr(request.getParameter("_itemScr"));
		}
		if (request.getParameter("itemIco") == "") {
			setItemIco(request.getParameter("_itemIco"));
		} else {
			setItemIco(request.getParameter("itemIco"));
		}
		if (request.getParameter("perkIco1") == "") {
			setPerkIco1(request.getParameter("_perkIco1"));
		} else {
			setPerkIco1(request.getParameter("perkIco1"));
		}
		if (request.getParameter("perkIco2") != "") {
			setPerkIco2(request.getParameter("perkIco2"));
		} else {
			setPerkIco2(request.getParameter("_perkIco2"));
		}
		if (request.getParameter("perkIco3") != "") {
			setPerkIco3(request.getParameter("perkIco3"));
		} else {
			setPerkIco3(request.getParameter("_perkIco3"));
		}
		if (request.getParameter("perkIco4") != "") {
			setPerkIco4(request.getParameter("perkIco4"));
		} else {
			setPerkIco4(request.getParameter("_perkIco4"));
		}
		if (request.getParameter("perkIco5") != "") {
			setPerkIco5(request.getParameter("perkIco5"));
		} else {
			setPerkIco5(request.getParameter("_perkIco5"));
		}
	}

	/* default serial Version ID */
	private static final long serialVersionUID = 1L;
	//////////
	private String itemId; // ������ ID ; �⺻Ű
	private String itemNm; // ������ �̸�
	private String itemScr; // ������ ��ũ����
	private String itemIco; // ������ ������
	private String itemDes; // ������ ����
	private String iRarity; // ������ ��͵�(���)
	private String iCategory; // ������ �з�
	private String iSlot; // ������ ����(���� ; ������ ; ��ȭ��)
	//////////
	private String perkIco1; // �� ������ 1
	private String perkName1; // �� �̸� 1
	private String perkDes1; // �� ���� 1
	private String perkIco2; // �� ������ 2
	private String perkName2; // �� �̸� 2
	private String perkDes2; // �� ���� 2
	private String perkIco3; // �� ������ 3
	private String perkName3; // �� �̸� 3
	private String perkDes3; // �� ���� 3
	private String perkIco4; // �� ������ 4
	private String perkName4; // �� �̸� 4
	private String perkDes4; // �� ���� 4
	private String perkIco5; // �� ������ 5
	private String perkName5; // �� �̸� 5
	private String perkDes5; // �� ���� 5
	////////////
	private int RPM; // �д� �߻��
	private int MAGAZINE; // źâ
	//////////
	private String STAT1NM; // ����1 �̸�
	private int STAT1FIG; // ����1 ��ġ
	private String STAT2NM; // ����2 �̸�
	private int STAT2FIG; // ����2 ��ġ
	private String STAT3NM; // ����3 �̸�
	private int STAT3FIG; // ����3 ��ġ
	private String STAT4NM; // ����4 �̸�
	private int STAT4FIG; // ����4 ��ġ
	private String STAT5NM; // ����5 �̸�
	private int STAT5FIG; // ����5 ��ġ
	/////////
	private Date regDate; // �����
	private int good; // ��õ
	private int bad; // ����õ

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public String getItemScr() {
		return itemScr;
	}

	public void setItemScr(String itemScr) {
		this.itemScr = itemScr;
	}

	public String getItemIco() {
		return itemIco;
	}

	public void setItemIco(String itemIco) {
		this.itemIco = itemIco;
	}

	public String getItemDes() {
		return itemDes;
	}

	public void setItemDes(String itemDes) {
		this.itemDes = itemDes;
	}

	public String getiRarity() {
		return iRarity;
	}

	public void setiRarity(String iRarity) {
		this.iRarity = iRarity;
	}

	public String getiCategory() {
		return iCategory;
	}

	public void setiCategory(String iCategory) {
		this.iCategory = iCategory;
	}

	public String getiSlot() {
		return iSlot;
	}

	public void setiSlot(String iSlot) {
		this.iSlot = iSlot;
	}

	public String getPerkIco1() {
		return perkIco1;
	}

	public void setPerkIco1(String perkIco1) {
		this.perkIco1 = perkIco1;
	}

	public String getPerkName1() {
		return perkName1;
	}

	public void setPerkName1(String perkName1) {
		this.perkName1 = perkName1;
	}

	public String getPerkDes1() {
		return perkDes1;
	}

	public void setPerkDes1(String perkDes1) {
		this.perkDes1 = perkDes1;
	}

	public String getPerkIco2() {
		return perkIco2;
	}

	public void setPerkIco2(String perkIco2) {
		this.perkIco2 = perkIco2;
	}

	public String getPerkName2() {
		return perkName2;
	}

	public void setPerkName2(String perkName2) {
		this.perkName2 = perkName2;
	}

	public String getPerkDes2() {
		return perkDes2;
	}

	public void setPerkDes2(String perkDes2) {
		this.perkDes2 = perkDes2;
	}

	public String getPerkIco3() {
		return perkIco3;
	}

	public void setPerkIco3(String perkIco3) {
		this.perkIco3 = perkIco3;
	}

	public String getPerkName3() {
		return perkName3;
	}

	public void setPerkName3(String perkName3) {
		this.perkName3 = perkName3;
	}

	public String getPerkDes3() {
		return perkDes3;
	}

	public void setPerkDes3(String perkDes3) {
		this.perkDes3 = perkDes3;
	}

	public String getPerkIco4() {
		return perkIco4;
	}

	public void setPerkIco4(String perkIco4) {
		this.perkIco4 = perkIco4;
	}

	public String getPerkName4() {
		return perkName4;
	}

	public void setPerkName4(String perkName4) {
		this.perkName4 = perkName4;
	}

	public String getPerkDes4() {
		return perkDes4;
	}

	public void setPerkDes4(String perkDes4) {
		this.perkDes4 = perkDes4;
	}

	public String getPerkIco5() {
		return perkIco5;
	}

	public void setPerkIco5(String perkIco5) {
		this.perkIco5 = perkIco5;
	}

	public String getPerkName5() {
		return perkName5;
	}

	public void setPerkName5(String perkName5) {
		this.perkName5 = perkName5;
	}

	public String getPerkDes5() {
		return perkDes5;
	}

	public void setPerkDes5(String perkDes5) {
		this.perkDes5 = perkDes5;
	}

	public int getRPM() {
		return RPM;
	}

	public void setRPM(int rPM) {
		RPM = rPM;
	}

	public int getMAGAZINE() {
		return MAGAZINE;
	}

	public void setMAGAZINE(int mAGAZINE) {
		MAGAZINE = mAGAZINE;
	}

	public String getSTAT1NM() {
		return STAT1NM;
	}

	public void setSTAT1NM(String sTAT1NM) {
		STAT1NM = sTAT1NM;
	}

	public int getSTAT1FIG() {
		return STAT1FIG;
	}

	public void setSTAT1FIG(int sTAT1FIG) {
		STAT1FIG = sTAT1FIG;
	}

	public String getSTAT2NM() {
		return STAT2NM;
	}

	public void setSTAT2NM(String sTAT2NM) {
		STAT2NM = sTAT2NM;
	}

	public int getSTAT2FIG() {
		return STAT2FIG;
	}

	public void setSTAT2FIG(int sTAT2FIG) {
		STAT2FIG = sTAT2FIG;
	}

	public String getSTAT3NM() {
		return STAT3NM;
	}

	public void setSTAT3NM(String sTAT3NM) {
		STAT3NM = sTAT3NM;
	}

	public int getSTAT3FIG() {
		return STAT3FIG;
	}

	public void setSTAT3FIG(int sTAT3FIG) {
		STAT3FIG = sTAT3FIG;
	}

	public String getSTAT4NM() {
		return STAT4NM;
	}

	public void setSTAT4NM(String sTAT4NM) {
		STAT4NM = sTAT4NM;
	}

	public int getSTAT4FIG() {
		return STAT4FIG;
	}

	public void setSTAT4FIG(int sTAT4FIG) {
		STAT4FIG = sTAT4FIG;
	}

	public String getSTAT5NM() {
		return STAT5NM;
	}

	public void setSTAT5NM(String sTAT5NM) {
		STAT5NM = sTAT5NM;
	}

	public int getSTAT5FIG() {
		return STAT5FIG;
	}

	public void setSTAT5FIG(int sTAT5FIG) {
		STAT5FIG = sTAT5FIG;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
