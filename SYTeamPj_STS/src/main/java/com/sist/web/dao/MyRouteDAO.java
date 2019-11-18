package com.sist.web.dao;

import java.util.List;
import com.sist.web.vo.MyRoute;
import com.sist.web.vo.Waypoints;
import com.sist.web.vo.Bookmark;
public interface MyRouteDAO {
	
	//�ش� ȸ���� � ��Ʈ
	public List<MyRoute> getMyRoute(String mid);
	
	//���Ʈ��ü OR �˻� ���
	public List<MyRoute> getMyRoutes(int pg,String field,String query);
	
	//Ŭ���� ��Ʈ�� ���� ���� ��ǥ ����
	public List<Waypoints> getWaypoints(String rSeq);
	
	//� ��Ʈ �Է�
	public int setMyRoute(MyRoute mr);
	
	//� ��ǥ �Է�
	public int setWaypoints(Waypoints wp);
	
	//���Ʈ����
	public int editMyRoute(String rSeq,MyRoute mr);

	//���Ʈ����
	public int delMyRoute(String rSeq);
	
	//���ǥ����
	public int delWaypoints(String rSeq);
	
	//Ŭ���� ��Ʈ�� ���� ������
	public MyRoute myRouteDetail(String rSeq);
	
	//�˻���� ��Ʈ ī��Ʈ
	public int mrSeqCount(String field,String query);
	
	//��ȸ�� ����
	public int hitUp(String rSeq);
	
	//rSeq
	public String getRseq();
	
	//�ϸ�ũ �߰�
	public int setBookmark(String rSeq,String mid);
	
	//�ϸ�ũ ����
	public int delBookmark(String bSeq);
	
	//�ϸ�ũ ��ȸ
	public Bookmark getBookmark(String bSeq);
	
	public String getBseq(String mid,String rSeq);
	
	//ȸ�� �ϸ�ũ ��ȸ
	public  List<Bookmark> getBookmarks(String mid);
	

}
