package Dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface patientRepository extends CrudRepository<patient, Object> {
    List<patient> findByUsername(String username);
    void deleteByUsername(String username);
    @Override
    default <S extends patient> S save(S s) { return null; }
    @Override
    default Optional<patient> findById(Object o) { return Optional.empty(); }
    @Override
    default boolean existsById(Object o) { return false; }
    @Override
    default Iterable<patient> findAll() { return null; }
    @Override
    default Iterable<patient> findAllById(Iterable<Object> iterable) { return null; }
    @Override
    default long count() { return 0; }
    @Override
    default void deleteById(Object o) { }
    @Override
    default void delete(patient patient) { }
    @Override
    default void deleteAll(Iterable<? extends patient> iterable) { }
    @Override
    default void deleteAll() { }
    @Modifying
    @Query(value = "UPDATE patient set mark = mark + ?1 where username = ?2;",nativeQuery = true)
    public boolean changeMark(int addmark, String username);

}

