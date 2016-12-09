package com.market.dao;

import com.market.model.Comments;

public interface CommentsMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Comments record);

	int insertSelective(Comments record);

	Comments selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Comments record);

	int updateByPrimaryKey(Comments record);
}