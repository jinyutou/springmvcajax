package com.springmvcajax;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.UserInfo;


@Controller
public class UserController {

	@RequestMapping(value="/ajaxUser.do")
	public void userName(String userName,HttpServletResponse response){
		System.out.println("userName==>"+userName);
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			if(userName.equals("admin")){
				out.write("对不起，您输入的帐号错误");
			}else{
				out.write("帐号可以使用");
			}
		} catch (Exception e) {
			System.out.println("帐号验证异常");
		}
	}
	
	@RequestMapping("ajaxUser2.do")
	public @ResponseBody UserInfo ajaxUser(Integer userId){
		System.out.println("userId=======>"+userId);
		UserInfo user = new UserInfo();
		user.setUserId(userId);
		user.setUserName("张三");
		user.setAge(20);
		return user;
	}
}
