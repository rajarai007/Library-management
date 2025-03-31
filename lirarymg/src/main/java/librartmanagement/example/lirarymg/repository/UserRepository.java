package librartmanagement.example.lirarymg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import librartmanagement.example.lirarymg.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}