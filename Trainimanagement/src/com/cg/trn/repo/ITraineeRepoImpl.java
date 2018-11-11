package com.cg.trn.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.trn.bean.Trainee;
@Repository
public class ITraineeRepoImpl implements ITraineeRepo {
@PersistenceContext
EntityManager manager;
	
	
	@Override
	public Trainee addTrainee(Trainee trainee) {

		manager.persist(trainee);
		manager.flush();
		return trainee;
	}

}
