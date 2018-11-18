package com.suleymancan.table.sorting.projects;

import com.suleymancan.table.sorting.model.Project;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Service
@AllArgsConstructor
public class ProjectService {

	private final ProjectRepository projectRepository;

	public void save(Project project){
		projectRepository.save(project);
	}

	public List<Project> findAll(){
		return (List<Project>) projectRepository.findAll();
	}
}
