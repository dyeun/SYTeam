package com.sist.web.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ChangeURL {

	public static String getURLformat(String q){
		String newQ=null;
		try {
			newQ = URLEncoder.encode(q, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("URL�� �ѱ� ����� �����߻�!!");
			e.printStackTrace();
		}
		
		return newQ;
	}

}
