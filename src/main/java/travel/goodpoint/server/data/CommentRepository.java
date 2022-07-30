package travel.goodpoint.server.data;

import com.google.common.collect.ImmutableList;
import org.springframework.data.repository.PagingAndSortingRepository;
import travel.goodpoint.server.models.Comment;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

    ImmutableList<Comment> findByPointId(Long pointId);
}
