package travel.goodpoint.server.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="COMMENTS")
public class Comment {

    @Id
    @Column(name = "COMMENT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "POINT_ID")
    private Point point;

    @Column(name = "COMMENT_TEXT", nullable = false)
    private String commentText;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User author;

}
