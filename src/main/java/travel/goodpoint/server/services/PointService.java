package travel.goodpoint.server.services;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;
import travel.goodpoint.server.data.PointRepository;
import travel.goodpoint.server.models.Point;


@Service
public class PointService {

    private final PointRepository pointRepository;

    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public ImmutableList<Point> getAllPoints() {
        return ImmutableList.copyOf(pointRepository.findAll());
    }
}
