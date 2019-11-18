package com.sist.web.dao;

import java.util.ArrayList;

import com.sist.web.vo.Chalgroup;

public interface ChalgroupDAO {


	//��ü�׷�����ȸ or �˻�
	public ArrayList<Chalgroup> getGroups(int pg,String field,String query);
	
	//�˻���� ��Ʈ ī��Ʈ
	public int cgSeqCount(String field,String query);
	
	//GID�� Ư�� �׷� ��ȸ
	public Chalgroup getGroupByGid(String gid);
	
	//Admin���� Ư�� �׷� ��ȸ
	public ArrayList<Chalgroup> getGroupByAdmin(String mid);
	
	//kind�� ���� �׷� ��ȸ
	public ArrayList<Chalgroup> getGroupsByKind(String kind);


   //�׷����
   public int addGroup(Chalgroup cg);
   
   //�׷����
   public int delGroup(String gid);

   //Like ������Ű��
   public int likeUp(String gid);
   
}