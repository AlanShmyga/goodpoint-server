package travel.goodpoint.PointGuide.services;

import org.springframework.stereotype.Service;
import travel.goodpoint.PointGuide.data.PointRepository;
import travel.goodpoint.PointGuide.models.Point;


@Service
public class PointService {

    private final PointRepository pointRepository;

    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public Iterable<Point> getAllPoints() {
        return pointRepository.findAll();
    }
}
