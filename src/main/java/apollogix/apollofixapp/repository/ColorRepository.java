package apollogix.apollofixapp.repository;

import apollogix.apollofixapp.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ColorRepository extends JpaRepository<Color,Long> {
}
