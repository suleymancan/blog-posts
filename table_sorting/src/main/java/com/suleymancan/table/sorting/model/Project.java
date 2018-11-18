package com.suleymancan.table.sorting.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Project extends BaseEntity {

	private String name;

	private String customer;

	@OneToMany(mappedBy = "project")
	private Set<WorkLog> workLogs;
}
