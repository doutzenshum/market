package com.hxuhao.dao;

import com.hxuhao.model.ContactWays;

public interface ContactWaysMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContactWays record);

    int insertSelective(ContactWays record);

    ContactWays selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContactWays record);

    int updateByPrimaryKey(ContactWays record);
}