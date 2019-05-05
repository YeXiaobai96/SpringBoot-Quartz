package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.JobAndTrigger;
import org.springframework.stereotype.Repository;

@Repository
public interface JobAndTriggerMapper {
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
