package com.project.test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {

	public List<Map<String,Object>> selectPostListTest();
}
