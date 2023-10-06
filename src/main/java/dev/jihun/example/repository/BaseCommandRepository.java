package dev.jihun.example.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseCommandRepository<T, I> extends Repository<T, I> {

    <S extends T> S save(S entity);

    <S extends T> List<S> saveAll(Iterable<S> entities);

    Optional<T> findById(I id);

    void deleteById(I id);

}
