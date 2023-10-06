package dev.jihun.example.api;

import dev.jihun.example.service.UserInfoDetailQuery;
import dev.jihun.example.service.UserRegisterCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserV1Api {

    private final UserRegisterCommand userRegisterCommand;
    private final UserInfoDetailQuery userInfoDetailQuery;

}
