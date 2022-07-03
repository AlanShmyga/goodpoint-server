package travel.goodpoint.server.data;

import org.springframework.data.repository.CrudRepository;
import travel.goodpoint.server.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
