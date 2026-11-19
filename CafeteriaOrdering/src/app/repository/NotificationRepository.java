package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
