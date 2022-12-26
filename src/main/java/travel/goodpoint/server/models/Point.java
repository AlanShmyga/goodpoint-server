package travel.goodpoint.server.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="POINT")
public class Point {

    @Id
    @Column(name = "POINT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TITLE")
    private String title;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="LATITUDE")
    private Double latitude;

    @Column(name="LONGITUDE")
    private Double longitude;

    @Column(name="CATEGORY")
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Column(name="STORY")
    private String story;

    @OneToMany(mappedBy = "point")
    private List<Comment> comments;
}
