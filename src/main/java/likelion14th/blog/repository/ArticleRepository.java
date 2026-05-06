package likelion14th.blog.repository;

import likelion14th.blog.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ArticleRepository extends JpaRepository<Article, Long>{
    // JpaRepository 클래스 상속받음
    // 앤티티 Article과 기본키 타입을 인수로
}
