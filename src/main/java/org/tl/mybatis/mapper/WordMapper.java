package org.tl.mybatis.mapper;

import org.tl.mybatis.WordEntry;

public interface WordMapper {

	public WordEntry getWordByWordName(String wordName);
	
}
