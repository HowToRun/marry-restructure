package com.mtm.party.mobile.controller;

import com.mtm.party.mobile.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author qubin
 * @date 2016-12-9
 */
@Controller
@RequestMapping("/User")
public class UserController {

	@Resource
	private UserService userService;
	
}
