package com.mycom.word;

import java.util.Scanner;

//crud기능 관리 
public class WordManager {
	
	Scanner s = new Scanner(System.in);
	WordCRUD WordCRUD;
	
	WordManager(){
		WordCRUD = new WordCRUD(s);
	}
	
	public int selectMenu() { //출력문 함수 
		
		System.out.print("*** 영단어 마스터 ***\n"
				+"******************\n"
				+"1. 모든 단어 보기 \n"
				+"2. 수준별 단어 보기 \n"
				+"3. 단어 검색 \n"
				+"4. 단어 추가 \n"
				+"5. 단어 수정 \n"
				+"6. 단어 삭제 \n"
				+"7. 파일 저장 \n"
				+"0. 나가기 \n"
				+"******************\n"
				+"=> 원하는 메뉴는? "
				);
		return s.nextInt(); // 사용자에게 입력받은 값을 리턴 
		
	}
	public void start() {//메인함수에서 호출하는  
		
		WordCRUD.loadFile();
		
		while(true) {
			int menu= selectMenu(); //사용자가 입렵한 값을 메뉴에 저장 
			if(menu==0) 
			{
				System.out.println("프로그램 종료! 다음에 만나요~");
				break; //나가기 기능 
			}
			
			else if(menu==1) {
				//list 출력
				WordCRUD.listAll();
			}
			else if(menu==2) {
				WordCRUD.searchLevel();
			}
			if(menu==4) {
				//create
				//wordCRUD에서 데이타추가되는 함수 실행 
				WordCRUD.addItem();
			}
			else if(menu==3)
			{
				WordCRUD.searchWord();
			}
			
			else if(menu==5)//update 
			{
				WordCRUD.updateItem();
				
			}
			else if(menu==6) //delete 
			{
				WordCRUD.deleteItem();
			}
			else if(menu==7) {
				WordCRUD.saveFile();
			}
		}
		
		//System.out.println(menu);
	}
	
	
}