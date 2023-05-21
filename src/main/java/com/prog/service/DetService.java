package com.prog.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.Details;
import com.prog.repository.DetRepo;





	@Service
	public class DetService {
		
		@Autowired
		private DetRepo repo;
		
		public  void addDet(Details  e) {
			repo.save(e);
			
		}
		
	//	public List<Details> getAllDet(){
		//	return repo.findAll();
		//}
}

