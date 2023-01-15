package ro.mycode.manageshoponline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mycode.manageshoponline.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
