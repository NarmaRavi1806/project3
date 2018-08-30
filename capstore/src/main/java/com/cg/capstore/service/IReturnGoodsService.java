package com.cg.capstore.service;

import com.cg.capstore.bean.OrderBean;

public interface IReturnGoodsService {
	OrderBean returnProduct(String id); 
	public String getDeliveryStatus (String orderId);
}
