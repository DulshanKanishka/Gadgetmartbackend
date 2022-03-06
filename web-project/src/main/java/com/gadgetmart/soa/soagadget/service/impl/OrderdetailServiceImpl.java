package com.gadgetmart.soa.soagadget.service.impl;

//import static com.swlc.swlcexportmarketingservice.constant.ApplicationConstant.APPLICATION_ERROR_OCCURRED_MESSAGE;
//import static com.swlc.swlcexportmarketingservice.constant.ApplicationConstant.REQUEST_SUCCESS_MESSAGE;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gadgetmart.soa.soagadget.dto.OrderdetailDTO;
//import com.gadgetmart.soa.soagadget.dto.UserDTO;
import com.gadgetmart.soa.soagadget.model.Orderdetail;
//import com.gadgetmart.soa.soagadget.model.User;
import com.gadgetmart.soa.soagadget.repository.OrderdetailRepository;
//import com.gadgetmart.soa.soagadget.repository.UserRepository;
import com.gadgetmart.soa.soagadget.service.OrderdetailService;
//import com.gadgetmart.soa.soagadget.service.UserService;
//import com.swlc.swlcexportmarketingservice.dto.OrderDetailDto;
//import com.swlc.swlcexportmarketingservice.dto.OrderDto;
//import com.swlc.swlcexportmarketingservice.dto.common.CommonOrderDTO;
//import com.swlc.swlcexportmarketingservice.dto.common.CommonResponseDTO;
//import com.swlc.swlcexportmarketingservice.entity.Order;
//import com.swlc.swlcexportmarketingservice.entity.OrderDetail;
//import com.swlc.swlcexportmarketingservice.repository.OrderRepository;

import net.minidev.json.JSONObject;

@Service
public class OrderdetailServiceImpl implements OrderdetailService {

//	@Autowired
//	private UserRepository userRepository;
    @Autowired
    private OrderdetailRepository orderdetailRepository;


//	@Override
//	public boolean saveUser(UserDTO userDTO) {
//		userRepository.save(new User(userDTO.getId(), userDTO.getName(), userDTO.getMobile(), userDTO.getAddress(),
//				userDTO.getPassword()));
//		return true;
//	}

	@Override
	public boolean saveOrderdetail(OrderdetailDTO orderdetailDTO) {
//		userRepository.save(new User(userDTO.getId(), userDTO.getName(), userDTO.getMobile(), userDTO.getAddress(),
//				userDTO.getPassword()));
		return true;
	}

	@Override
	public List<OrderdetailDTO> getAllItems() {
		// TODO Auto-generated method stub
//		try {
            List<Orderdetail> orderList = orderdetailRepository.findAll();

            
//        } catch (Exception e) {
//            LOGGER.error(e.getMessage());
//            return new ResponseEntity<>(new CommonResponseDTO(false, APPLICATION_ERROR_OCCURRED_MESSAGE, e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
		return null;
	}

}
