package dev.jihun.example.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import dev.jihun.example.domain.QUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserCommandCustomRepositoryImpl implements UserCommandCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final QUser user = QUser.user;
}
