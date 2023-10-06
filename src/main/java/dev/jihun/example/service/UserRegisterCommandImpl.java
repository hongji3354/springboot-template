package dev.jihun.example.service;

import dev.jihun.example.repository.UserCommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserRegisterCommandImpl implements UserRegisterCommand {

    private final UserCommandRepository userCommandRepository;

}
