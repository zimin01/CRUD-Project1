package com.mycom.word;

public interface ICRUD {
	
	public Object add(); //데이터 추가 
	public int update(Object obj);//수정 
	public int delete(Object obj);//삭제 
	public void selectOne(int id);//데이터조회 
	
}
 