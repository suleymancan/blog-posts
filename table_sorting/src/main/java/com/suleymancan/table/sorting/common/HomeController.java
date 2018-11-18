package com.suleymancan.table.sorting.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Controller
@RequestMapping
public class HomeController {

	public String index(){
		return "index";
	}
}
