package travel.goodpoint.PointGuide.data;

import com.google.common.collect.ImmutableList;
import org.springframework.data.repository.CrudRepository;
import travel.goodpoint.PointGuide.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    ImmutableList<Comment> findByPointId(Long pointId);
}
