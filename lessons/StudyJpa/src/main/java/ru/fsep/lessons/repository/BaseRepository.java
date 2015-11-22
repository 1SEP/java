package ru.fsep.lessons.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * 30.10.15
 * BaseRepository
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {

    void delete(ID id);

    List<T> findAll();

    T save(T persisted);

    T findOne(ID id);
}
