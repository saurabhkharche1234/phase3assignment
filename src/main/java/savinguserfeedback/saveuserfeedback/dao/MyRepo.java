package savinguserfeedback.saveuserfeedback.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import savinguserfeedback.saveuserfeedback.entity.Feedback;



@Repository
public interface MyRepo extends CrudRepository<Feedback, Integer>{

}

