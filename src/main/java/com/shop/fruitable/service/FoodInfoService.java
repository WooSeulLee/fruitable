package com.shop.fruitable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.fruitable.mapper.FoodInfoMapper;
import com.shop.fruitable.vo.FoodInfoVO;

@Service
public class FoodInfoService {
	
	@Autowired
	private FoodInfoMapper foiMapper;
	
	public List<FoodInfoVO> selectFoods(FoodInfoVO food){
		List<FoodInfoVO> list = foiMapper.selectFoods(food);
		return list;
	}
	public FoodInfoVO selectFood(Integer foiNum) {
		FoodInfoVO food = foiMapper.selectFood(foiNum);
		return food;
	}

}
