package com.web2020.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "web")
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}
	
	@RequestMapping(value = "/booklibrary", method = RequestMethod.GET)
	public ModelAndView storePage() {
		ModelAndView mav = new ModelAndView("web/booklibrary");
		return mav;
	}
	
	@RequestMapping(value = "/videolibrary", method = RequestMethod.GET)
	public ModelAndView cartPage() {
		ModelAndView mav = new ModelAndView("web/videolibrary");
		return mav;
	}
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView blogPage() {
		ModelAndView mav = new ModelAndView("web/blog");
		return mav;
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contactPage() {
		ModelAndView mav = new ModelAndView("web/contact");
		return mav;
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView productPage() {
		ModelAndView mav = new ModelAndView("web/product-details");
		return mav;
	}
}
