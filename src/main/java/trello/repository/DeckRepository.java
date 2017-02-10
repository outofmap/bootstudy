package repository;

import org.springframework.data.repository.CrudRepository;
import trello.domain.Deck;

/**
 * Created by solar on 2016. 12. 1..
 */
public interface DeckRepository extends CrudRepository<Deck,Long>{

}
