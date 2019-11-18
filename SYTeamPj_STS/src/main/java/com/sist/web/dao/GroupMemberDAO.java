package com.sist.web.dao;

import java.util.ArrayList;

import com.sist.web.vo.GroupMember;

public interface GroupMemberDAO {

	//�׷� �ο��� ��ȸ
	public int countMem(String gid);
	
	//�׷��� ���̵� ��ȸ
	public ArrayList<String> searchMem(String gid);
	
	//�׷����� (���̵����)
	public int addGroupMem(String gid, String mid, String gmseq);
	
	//���� ������ �׷��� gid ��ȸ
	public ArrayList<String> viewMygroup(String mid);

	//GID,MEMID,GMSEQ ��ü��ȸ
	public ArrayList<GroupMember> getGroupMems();
}
