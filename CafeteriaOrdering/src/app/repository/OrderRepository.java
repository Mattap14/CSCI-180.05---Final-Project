package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	public Order findByorderPk(Long orderPk);
	public List<Order> findByStudentPk(Long studentPk);

}
