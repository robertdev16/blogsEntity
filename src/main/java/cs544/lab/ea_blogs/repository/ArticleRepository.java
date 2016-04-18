package cs544.lab.ea_blogs.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cs544.lab.ea_blogs.model.Article;


@Repository
@Transactional
@Cacheable
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	public List<Article> findArticleByCategory(Integer categoryId);
	
	public List<Article> findAll();
	
	public List<Article> findArticlePostedByPublishedBy(Integer publishedBy);
}
