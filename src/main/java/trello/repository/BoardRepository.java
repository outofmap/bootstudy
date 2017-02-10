package repository;

import org.springframework.data.repository.CrudRepository;
import trello.domain.Board;

/**
 * Created by solar on 2016. 12. 1..
 */
public interface BoardRepository extends CrudRepository<Board, Long> {
}
