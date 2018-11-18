package com.suleymancan.table.sorting.workLogs;

import com.suleymancan.table.sorting.model.WorkLog;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Service
@AllArgsConstructor
public class WorkLogService {

	private final WorkLogRepository workLogRepository;

	public void save(WorkLog workLog){
		workLogRepository.save(workLog);
	}


	public Page<WorkLog> getWorkLogs(Pageable pageable){
		final Pageable pageableWithDefaultSort = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), pageable.getSortOr(Sort.by(
				Sort.Direction.DESC, "id")));
		return workLogRepository.findAll(pageableWithDefaultSort);
	}
}
