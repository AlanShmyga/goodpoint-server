package travel.goodpoint.server.data;

import com.google.common.collect.ImmutableList;
import org.springframework.data.repository.CrudRepository;
import travel.goodpoint.server.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    ImmutableList<Comment> findByPointId(Long pointId);
}
