package com.mycom.word;
//데이터를 다루기 위한 
public class Word {
	private int id;
	private int level;
	private String word;
	private String meaning;
	
	//생성자 
	Word(){}
	Word(int id, int level, String word, String meaning){
		this.id=id;
		this.level=level;
		this.word=word;
		this.meaning=meaning;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
	@Override
	public String toString() {
		//toString()함수를 부르면 원하는 문자열의 포맷대로 출
		// TODO Auto-generated method stub
		
		String slevel = "";
		for(int i=0; i<level; i++) slevel+="*";
		String str = String.format("%-3s", slevel) //왼쪽정렬 
				+ String.format("%15s", word) + "  " + meaning;
		
		return str;
	}
	//public String toFileString() {
	//	return this.level+"|"+this.word+"|"+this.meaning;
	//}
	public String toFileString() {
		// TODO Auto-generated method stub
		return this.level+"|"+this.word+"|"+this.meaning;
	}
	
}
