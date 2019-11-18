package com.sist.web.dao;

import java.util.ArrayList;

import com.sist.web.vo.WcntByMonth;
import com.sist.web.vo.Workout;
import com.sist.web.vo.WorkoutCnt;

public interface WorkoutDAO {
		//������� ����Ʈã��
		public ArrayList<Workout> getWorkoutsById(String mid);

		///������� �ϳ�ã��
		public Workout getWorkout(String wseq);
		
		//////����� ����
		public int addWorkout(Workout w);
		
		///���������
		public int editWorkout(Workout w,String wseq);
		
		///����� ����
		public int delWorkout(String wseq);

		//���� � Ƚ�� �̱�
		public ArrayList<WorkoutCnt> getWcntByKind(String mid);
		
		//���� � ���� Ƚ�� �̱�
		public ArrayList<WcntByMonth> getWcntByMth(String mid, String kind, String sdate, String edate);

}
