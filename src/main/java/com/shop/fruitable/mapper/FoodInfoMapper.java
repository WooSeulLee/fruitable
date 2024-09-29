package com.shop.fruitable.mapper;

import java.util.List;

import com.shop.fruitable.vo.FoodInfoVO;

public interface FoodInfoMapper {
	
	public List<FoodInfoVO> selectFoods(FoodInfoVO food);
	public FoodInfoVO selectFood(Integer foiNum);
	public int insertFood(FoodInfoVO food);
	public int updateFood(FoodInfoVO food);
	public int deleteFood(Integer foiNum);
}
