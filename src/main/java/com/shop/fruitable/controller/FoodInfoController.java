package com.shop.fruitable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.fruitable.service.FoodInfoService;
import com.shop.fruitable.vo.FoodInfoVO;


@RestController
public class FoodInfoController {

	@Autowired
	private FoodInfoService foiService;
	
	@GetMapping("/foods")
	public List<FoodInfoVO> getFoods(FoodInfoVO food) {
		 List<FoodInfoVO> foods = foiService.selectFoods(food);
		 return foods;
	}
	
}
