package kg.damir.sweater.repo;

import kg.damir.sweater.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
