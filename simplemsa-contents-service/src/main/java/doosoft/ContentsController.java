package doosoft;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
@RefreshScope
public class ContentsController {

    @Value("${server.port}")
    private int port;

    @Value("${spring.message}")
    private String message;

    @GetMapping("/member/detail")
    public String member() {
        return "Member Detail - Port " + port + " - " + message;
    }

    @GetMapping("/pay/detail")
    public String pay() {
        return "Pay Detail - Port " + port + " - " + message;
    }

    @GetMapping("/comment")
    public String comment() {
        log.info("comment() started...");
        return "Comment - Port " + port + " - " + message;
    }

    @GetMapping("/board")
    public String userDetail() {
        return "Board - Port " + port + " - " + message;
    }
}
