package com.suleymancan.table.sorting.workLogs;

import com.suleymancan.table.sorting.model.WorkLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Repository
public interface WorkLogRepository extends PagingAndSortingRepository<WorkLog, Long> {

	@Override
	Page<WorkLog> findAll(Pageable pageable);
}
