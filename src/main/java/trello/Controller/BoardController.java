package trello.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import trello.repository.BoardRepository;

/**
 * Created by solar on 2017. 1. 16..
 */
@Slf4j
@Controller
public class homeController {
    BoardRepository boardRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/boards")
    public String boards() {
        return "boards";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @ResponseBody
    @PostMapping("/api/boards")
    public HttpStatus saveBoard(String boardName) {
        log.info("in");
//        Board b = boardRepository.save(new Board(boardName));
//        return b;
        return HttpStatus.CREATED;

    }
}
