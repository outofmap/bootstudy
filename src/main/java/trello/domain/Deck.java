package trello.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by solar on 2016. 11. 30..
 */
@Data
@Entity
public class Deck {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "deck")
    private List<Card> cards;
    @ManyToOne
    private Board board;
}
