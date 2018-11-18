package com.suleymancan.table.sorting.projects;

import com.suleymancan.table.sorting.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

}
