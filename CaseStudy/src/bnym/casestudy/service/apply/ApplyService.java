package bnym.casestudy.service.apply;

import java.util.List;

import bnym.casestudy.entity.Apply;

public interface ApplyService {
	public List<Apply> getAllApplications();
	public Apply getApplicationsById(Long id);
	public boolean saveApplication(Apply apply);
	public boolean deleteApplicationsById(Long id);
}
