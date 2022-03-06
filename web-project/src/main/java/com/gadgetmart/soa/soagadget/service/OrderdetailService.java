package com.gadgetmart.soa.soagadget.service;

import java.util.List;

import com.gadgetmart.soa.soagadget.dto.OrderdetailDTO;

import net.minidev.json.JSONObject;

public interface OrderdetailService {

	public boolean saveOrderdetail(OrderdetailDTO orderdetailDTO);

	public List<OrderdetailDTO> getAllItems();
//    public JSONObject login(String name,String password);

}
