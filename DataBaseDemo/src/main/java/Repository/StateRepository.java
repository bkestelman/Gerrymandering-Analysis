package Repository;

import org.springframework.data.repository.CrudRepository;

import Entity.State;

public interface StateRepository extends CrudRepository<State, Long>{
	
}
