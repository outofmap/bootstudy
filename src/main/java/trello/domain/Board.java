package trello.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by solar on 2016. 11. 30..
 */
@Entity
@Data
public class Board {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "board",fetch = FetchType.LAZY)
    private List<Deck> decks;

}
