package com.gadgetmart.soa.soagadget.controller;

import com.gadgetmart.soa.soagadget.dto.UserDTO;
import com.gadgetmart.soa.soagadget.model.Orderdetail;
import com.gadgetmart.soa.soagadget.service.OrderdetailService;
import com.gadgetmart.soa.soagadget.service.UserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/orderdetail")
public class OrderdetailController {

	@Autowired
	private UserService userService;

	@Autowired
	private OrderdetailService orderdetailService;

	@PostMapping("/save")
	public boolean saveOrderdetail(@RequestBody UserDTO userDTO) {
		userService.saveUser(userDTO);
		return true;
	}
	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Orderdetail>> getAllOrders(){
//		return true;
//		return orderdetailService.getAllItems();
		return null;
	}
//	@GetMapping(value = "/getAll")
//	public ResponseEntity<CommonResponseDTO> getAllOrders(){
//		return orderService.getAllOrders();
//	}
//	@PostMapping("/add")
//	public ResponseEntity<ApiResponse> placeOrder(@RequestParam("token") String token, @RequestParam("sessionId") String sessionId)
//			throws AuthenticationFailException {
//		// validate token
//		authenticationService.authenticate(token);
//		// retrieve user
//		User user = authenticationService.getUser(token);
//		// place the order
//		orderService.placeOrder(user, sessionId);
//		return new ResponseEntity<>(new ApiResponse(true, "Order has been placed"), HttpStatus.CREATED);
//	}
//
//	// get all orders
//	@GetMapping("/")
//	public ResponseEntity<List<Order>> getAllOrders(@RequestParam("token") String token) throws AuthenticationFailException {
//		// validate token
//		authenticationService.authenticate(token);
//		// retrieve user
//		User user = authenticationService.getUser(token);
//		// get orders
//		List<Order> orderDtoList = orderService.listOrders(user);
//
//		return new ResponseEntity<>(orderDtoList, HttpStatus.OK);
//	}
//	@PostMapping("/login")
//	public JSONObject login(@RequestBody String name, String password) {
//		JSONObject obj = userService.login(name, password);
//		System.out.println("json "+obj.toJSONString());
//		return obj;
//	}

}
