package org.tl.mybatis;

public class WordEntry {
	private String wordName;
	private String translation;
	private int difficulty;
	public String getWordName() {
		return wordName;
	}
	public void setWord(String wordName) {
		this.wordName = wordName;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	@Override
	public String toString() {
		return "WordEntry [word=" + wordName + ", translation=" + translation + ", difficulty=" + difficulty + "]";
	}
	
}
