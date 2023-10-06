package dev.jihun.example.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import dev.jihun.example.domain.QUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserQueryRepositoryImpl implements UserQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final QUser qUser = QUser.user;

}
