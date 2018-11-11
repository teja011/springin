package com.cg.trn.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trn.bean.Trainee;
import com.cg.trn.repo.ITraineeRepo;


@Service
@Transactional
public class ITraineeServiceImpl implements ITraineeService, ITraineeRepo {

	@Autowired
	ITraineeRepo itr;
	
	
	
	
	public ITraineeRepo getItr() {
		return itr;
	}




	public void setItr(ITraineeRepo itr) {
		this.itr = itr;
	}




	@Override
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return itr.addTrainee(trainee);
	}

}
