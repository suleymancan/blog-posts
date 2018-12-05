package com.suleymancan.table.sorting.workLogs;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Controller
@AllArgsConstructor
@RequestMapping("/work-logs")
public class WorkLogController {

	private final WorkLogService workLogService;

	@GetMapping
	public String index(Model model, Pageable pageable){
		model.addAttribute("workLogs", workLogService.getWorkLogs(pageable));
		return "workLogs/index";
	}
}
