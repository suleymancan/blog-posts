package com.suleymancan.table.sorting;

import com.suleymancan.table.sorting.model.Project;
import com.suleymancan.table.sorting.model.WorkLog;
import com.suleymancan.table.sorting.projects.ProjectService;
import com.suleymancan.table.sorting.workLogs.WorkLogService;
import io.codearte.jfairy.Fairy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TableSortingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableSortingApplication.class, args);
	}

	@Bean
	CommandLineRunner initialData(final WorkLogService workLogService, final ProjectService projectService){
		return (args) -> {

			if(!projectService.findAll().isEmpty()){
				return;
			}

			final Fairy fairy = Fairy.create();

			final List<Project> projects = new ArrayList<>();
			for(int i = 0; i<100; i++){
				final Project project = Project.builder()
						.name(fairy.company().domain())
						.customer(fairy.company().name())
						.build();
				projects.add(project);
				projectService.save(project);
			}

			for(int i = 0; i<100; i++){
				final WorkLog workLog = WorkLog.builder()
						.project(projects.get(fairy.baseProducer().randomBetween(0,9)))
						.description(fairy.textProducer().latinWord(10))
						.employee(fairy.person().firstName()+' ' + fairy.person().lastName())
						.build();
				workLogService.save(workLog);
			}

		};
	}
}
