package dev.jihun.example.repository;

import dev.jihun.example.domain.User;

public interface UserCommandRepository extends BaseCommandRepository<User, Long>, UserCommandCustomRepository {
}
