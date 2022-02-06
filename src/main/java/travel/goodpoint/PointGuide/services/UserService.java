package travel.goodpoint.PointGuide.services;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;
import travel.goodpoint.PointGuide.data.UserRepository;
import travel.goodpoint.PointGuide.models.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ImmutableList<User> getAllUsers() {
        return ImmutableList.copyOf(userRepository.findAll());
    }
}
