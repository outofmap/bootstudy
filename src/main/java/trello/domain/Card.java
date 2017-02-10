package trello.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by solar on 2016. 11. 30..
 */
@Data
@Entity
public class Card {
    @Id
    @GeneratedValue
    private Long id;
    private String contents;
    @ManyToOne
    private Deck deck;

}
