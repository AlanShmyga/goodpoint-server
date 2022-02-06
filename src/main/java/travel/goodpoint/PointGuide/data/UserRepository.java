package travel.goodpoint.PointGuide.data;

import org.springframework.data.repository.CrudRepository;
import travel.goodpoint.PointGuide.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
