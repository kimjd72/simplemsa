package doosoft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1")
@RefreshScope
public class MemberController {

    @Value("${server.port}")
    private int port;

    @Value("${spring.message}")
    private String message;

    @GetMapping("/member/detail")
    public String member() {
        return "Member Detail - Port " + port + " - " + message;
    }

    @GetMapping("/member/getUserName")
    public ResponseEntity getUserName() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("username", "김종두");
        return ResponseEntity.ok(resultMap);
    }

    @GetMapping("/pay/detail")
    public String pay() {
        return "Pay Detail - Port " + port + " - " + message;
    }
}
