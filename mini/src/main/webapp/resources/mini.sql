CREATE TABLE member(
	userId			VARCHAR2(20) PRIMARY KEY,	 -- ����ID, �⺻Ű
	userPw			VARCHAR2(20) NOT NULL,		 -- ���� PW, �ʼ�
	userNm			VARCHAR2(20),				 -- ���� �̸�(�г���) �Է� ���ص� �������.
	userEmail		VARCHAR2(30) NOT NULL,		 -- ���� �̸���, �ʼ�
	userImg			VARCHAR2(20),				 -- ���� ����(�����ʻ���)
	properties		CHAR(1)		 DEFAULT 0,		 -- ������ ������ ����. �⺻�� 0
	regDate			DATE		 DEFAULT SYSDATE
);

CREATE SEQUENCE member_seq NOCACHE;

CREATE TABLE item_info(
	itemId			VARCHAR2(20) PRIMARY KEY,	 -- ������ ID, �⺻Ű
	itemNm			VARCHAR2(20) NOT NULL,	 	 -- ������ �̸�
	itemScr			VARCHAR2(20),				 -- ������ ��ũ����
	itemIco			VARCHAR2(20),				 -- ������ ������
	itemDes			VARCHAR2(1000),				 -- ������ ����
	iRarity			VARCHAR2(20),				 -- ������ ��͵�(���)
	iCategory		VARCHAR2(20),				 -- ������ �з�
	iSlot			VARCHAR2(20),				 -- ������ ����(����, ������, ��ȭ��)
	perkIco1		VARCHAR2(20),				 -- �� ������ 1
	perkName1		VARCHAR2(20),				 -- �� �̸� 1
	perkDes1		VARCHAR2(100),				 -- �� ���� 1
	perkIco2		VARCHAR2(20),				 -- �� ������ 2
	perkName2		VARCHAR2(20),				 -- �� �̸� 2
	perkDes2		VARCHAR2(100),				 -- �� ���� 2
	perkIco3		VARCHAR2(20),				 -- �� ������ 3
	perkName3		VARCHAR2(20),				 -- �� �̸� 3
	perkDes3		VARCHAR2(100),				 -- �� ���� 3
	perkIco4		VARCHAR2(20),				 -- �� ������ 4
	perkName4		VARCHAR2(20),				 -- �� �̸� 4
	perkDes4		VARCHAR2(100),				 -- �� ���� 4
	perkIco5		VARCHAR2(20),				 -- �� ������ 5
	perkName5		VARCHAR2(20),				 -- �� �̸� 5
	perkDes5		VARCHAR2(100),				 -- �� ���� 5
	RPM				NUMBER,						 -- �д� �߻��
	MAGAZINE		NUMBER,						 -- źâ
	STAT1NM			VARCHAR2(20),				 -- ����1 �̸�
	STAT1FIG		NUMBER,						 -- ����1 ��ġ
	STAT2NM			VARCHAR2(20),				 -- ����2 �̸�
	STAT2FIG		NUMBER,						 -- ����2 ��ġ
	STAT3NM			VARCHAR2(20),				 -- ����3 �̸�
	STAT3FIG		NUMBER,						 -- ����3 ��ġ
	STAT4NM			VARCHAR2(20),				 -- ����4 �̸�
	STAT4FIG		NUMBER,						 -- ����4 ��ġ
	STAT5NM			VARCHAR2(20),				 -- ����5 �̸�
	STAT5FIG		NUMBER,						 -- ����5 ��ġ
	regDate			DATE		 DEFAULT SYSDATE
);

CREATE SEQUENCE item_info_seq NOCACHE;

CREATE TABLE dega_post_(
	postId		NUMBER PRIMARY KEY,				 -- �Խù� ��ȣ
	postThumb	VARCHAR2(100),					 -- ������
	postSub		VARCHAR2(100) NOT NULL,			 -- ����
	content		LONG VARCHAR,							 -- ����
	regDate		DATE	DEFAULT SYSDATE
);

DROP TABLE dega_post_;

CREATE SEQUENCE dega_post_seq NOCACHE;

CREATE TABLE t_comment(
	cmtNum			NUMBER,
	userId			VARCHAR2(20) REFERENCES member(userid),
	userNm			VARCHAR2(100),
	userCmt			VARCHAR2(1000) NOT NULL,
	postId			VARCHAR2(100) REFERENCES item_info(itemid),
	regDate			DATE		 DEFAULT SYSDATE
);

DROP TABLE t_comment;

CREATE SEQUENCE t_comment_seq NOCACHE;

INSERT INTO item_info(itemid, itemnm, itemscr, itemico, itemdes) 
			VALUES ('I' || item_info_seq.NEXTVAL, '�����̵忡�̽�', 'spadepce_scr.jpg', 'spadeace_ico.jpg', '"�������� ���� �� �����ٱ�." -���̵�-6');