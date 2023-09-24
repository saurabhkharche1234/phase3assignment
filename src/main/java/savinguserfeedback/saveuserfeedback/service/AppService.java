package savinguserfeedback.saveuserfeedback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import savinguserfeedback.saveuserfeedback.dao.MyRepo;
import savinguserfeedback.saveuserfeedback.entity.Feedback;

@Service
public class AppService {

	@Autowired
	private MyRepo myRepo;
	
	public boolean addFeedback( Feedback f) {
		myRepo.save(f);
		return true;
	}
}