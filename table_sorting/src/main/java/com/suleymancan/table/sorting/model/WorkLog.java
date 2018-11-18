package com.suleymancan.table.sorting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

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
public class WorkLog extends BaseEntity {

	@ManyToOne
	private Project project;

	private String description;

	private String employee;



}
