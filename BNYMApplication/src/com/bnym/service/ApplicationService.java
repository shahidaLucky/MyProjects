package com.bnym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnym.entity.Applicant;

@Service("applicationService")
public class ApplicationService {

	private List<Applicant> appList = new ArrayList<>();

	public List<Applicant> getAllApplicants() {
		return appList;
	}
}
