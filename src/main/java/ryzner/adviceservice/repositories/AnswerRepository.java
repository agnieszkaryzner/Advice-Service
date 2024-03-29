package ryzner.adviceservice.repositories;

import ryzner.adviceservice.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long>, JpaRepository<Answer, Long> {

}