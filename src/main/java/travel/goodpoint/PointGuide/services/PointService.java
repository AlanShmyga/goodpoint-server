package travel.goodpoint.PointGuide.services;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;
import travel.goodpoint.PointGuide.data.PointRepository;
import travel.goodpoint.PointGuide.models.Point;


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
