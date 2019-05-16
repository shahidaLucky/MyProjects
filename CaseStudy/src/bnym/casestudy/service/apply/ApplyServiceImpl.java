package bnym.casestudy.service.apply;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entity.Apply;
import bnym.casestudy.repository.ApplyRepository;

@Service
@Transactional
public class ApplyServiceImpl implements  ApplyService{


	@Autowired
	ApplyRepository repository;
	
	@Override
	public List<Apply> getAllApplications() {
		List<Apply> list = new ArrayList<Apply>();
		for (Apply author : repository.findAll()) {
			list.add(author);
		}
		return list;
	}

	@Override
	public Apply getApplicationsById(Long id) {
		Apply apply = repository.findById(id).get();
		return apply;
	}

	@Override
	public boolean saveApplication(Apply apply) {
		try {
			repository.save(apply);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteApplicationsById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}
