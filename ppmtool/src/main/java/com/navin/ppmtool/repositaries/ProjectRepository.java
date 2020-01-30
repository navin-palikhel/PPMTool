package com.navin.ppmtool.repositaries;

import org.springframework.stereotype.Repository;
import com.navin.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);
}
