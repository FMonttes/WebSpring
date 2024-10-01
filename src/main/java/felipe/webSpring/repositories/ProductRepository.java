package felipe.webSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import felipe.webSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
