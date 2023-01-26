package botscrewtest.university.repository;

import botscrewtest.university.model.Lector;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectorRepository extends JpaRepository<Lector, Long> {
    List<Lector> findAllByLectorNameContaining(String lectorNameInfix);
}
