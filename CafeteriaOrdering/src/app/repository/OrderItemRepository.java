package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	public List<OrderItem> findByorderPk(Long orderPk);

}
