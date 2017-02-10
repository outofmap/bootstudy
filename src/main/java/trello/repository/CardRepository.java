package repository;

import org.springframework.data.repository.CrudRepository;
import trello.domain.Card;

/**
 * Created by solar on 2016. 12. 1..
 */
public interface CardRepository extends CrudRepository<Card,Long>{

}
