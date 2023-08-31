package apollogix.apollofixapp.repository;

import apollogix.apollofixapp.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product> findByNameContainingIgnoreCase(String keyword, Pageable pageable);
}
