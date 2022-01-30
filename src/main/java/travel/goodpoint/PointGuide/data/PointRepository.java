package travel.goodpoint.PointGuide.data;

import org.springframework.data.repository.CrudRepository;
import travel.goodpoint.PointGuide.models.Point;

public interface PointRepository extends CrudRepository<Point, Long> {
}
