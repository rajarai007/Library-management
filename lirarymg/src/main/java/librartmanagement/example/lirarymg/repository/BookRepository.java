package librartmanagement.example.lirarymg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import librartmanagement.example.lirarymg.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}