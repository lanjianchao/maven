package com.cvte.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cvte.Entity.ItemData;
import com.cvte.dao.BomMapper;


@Controller
@RequestMapping("/hello")
public class BomController {
	@Autowired
	BomMapper bomMapper;
	@RequestMapping("/mvc")
	public ModelAndView listall(HttpServletRequest request,HttpServletResponse response){
		List<ItemData> items=bomMapper.selectItems();
		System.out.println("---------------------");
		ModelAndView mav=new ModelAndView("list");
		mav.addObject("items",items);
		return mav;
	}
}
