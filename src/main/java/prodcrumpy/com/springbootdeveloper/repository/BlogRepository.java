package prodcrumpy.com.springbootdeveloper.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import prodcrumpy.com.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
