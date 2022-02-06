package travel.goodpoint.PointGuide.services;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;
import travel.goodpoint.PointGuide.data.CommentRepository;
import travel.goodpoint.PointGuide.models.Comment;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public ImmutableList<Comment> getAllPointCommentsByPointId(Long pointId) {
        return ImmutableList.copyOf(commentRepository.findByPointId(pointId));
    }
}
