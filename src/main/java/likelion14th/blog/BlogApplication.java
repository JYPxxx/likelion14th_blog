package likelion14th.blog;

import likelion14th.blog.domain.Article;
import likelion14th.blog.dto.response.ArticleSummaryResponse;
import likelion14th.blog.repository.ArticleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class BlogApplication {

	private final ArticleRepository articleRepository;

	public BlogApplication(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
		System.out.println("SPRING");
	}

	public List<ArticleSummaryResponse> getArticles() {
		List<Article> articles = articleRepository.findAll();

		List<ArticleSummaryResponse> articleResponses = articles.stream()
				.map(ArticleSummaryResponse::from)
				.toList();

		return articleResponses;
	}
}
