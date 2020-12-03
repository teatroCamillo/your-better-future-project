package your.better.future.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import your.better.future.model.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
