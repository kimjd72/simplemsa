package doosoft;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "member-service", url = "localhost:9100")
public interface MemberService {

    @GetMapping(value = "/v1/member/getUserName")
    public Map<String, Object> getUserName();
}
