package com.example.catsdatabase;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CatMapper {

    @Select("SELECT * FROM cats")
    List<Cat> findAll();
}
