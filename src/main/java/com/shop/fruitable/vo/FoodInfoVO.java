package com.shop.fruitable.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FoodInfoVO {
	private Integer foiNum;
	private String foiName;
	private String foiPrice;
	private String foiImgPath;
	private String foiSummary;
	private String foiDesc;
	private String credat;
	private String cretim;
	private String caiName;
	private int start;
	private int page;
}
