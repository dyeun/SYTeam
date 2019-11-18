package com.sist.web.dao;

import java.util.ArrayList;

import com.sist.web.vo.Qcomment;
import com.sist.web.vo.QnABoard;

public interface QnABoardDAO {
      //�Խñ� �� �� ��������
      public QnABoard getQnABoard(String seq);
      
      //�Խñ� ��� ��������
      public ArrayList<QnABoard> getQnABoards(int pg, String field, String query);

      //�Խñ� �ۼ�
      public int addQnABoard(QnABoard q);
      
      //�Խñ� ����
      public int editQnABoard(String title, String content, String fileSrc, String qSeq);

      //�Խñ� ����
      public int delQnABoard(String qSeq);
      
      //�Խñ� ���� ī��Ʈ
      public int qnASeqCount(String kind, String search);
      
      //��� �ҷ�����
      public Qcomment getQnAComment(String qSeq);
      
      //��� ��� ��������
      public ArrayList<Qcomment> getQnAComments(int pg, String field, String query);
      
      //��� ����
      public int delQnAComment(String cSeq);
         
      //��۾���
      public int addReply(String qSeq, String cContent);
      
      public int changeStatus(String qSeq);
      
}