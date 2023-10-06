package dev.jihun.example.service;

import dev.jihun.example.repository.UserQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserInfoDetailQueryImpl implements UserInfoDetailQuery {

    private final UserQueryRepository userQueryRepository;


}
