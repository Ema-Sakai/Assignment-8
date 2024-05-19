package com.example.catsdatabase;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CatMapper {

    @Select("SELECT * FROM cat_breeds_and_coats")
    List<Cat> findAll();
}
