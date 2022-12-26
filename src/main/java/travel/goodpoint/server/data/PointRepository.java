package travel.goodpoint.server.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.lang.NonNull;
import travel.goodpoint.server.models.Point;

import java.util.List;

public interface PointRepository extends CrudRepository<Point, Long> {

    @Override
    @NonNull
    @RestResource(exported = false)
    <S extends Point> S save(@NonNull S entity);

    @Override
    @NonNull
    @RestResource(exported = false)
    <S extends Point> Iterable<S> saveAll(@NonNull Iterable<S> entities);

    @Override
    @NonNull
    @RestResource(exported = false)
    void deleteById(@NonNull Long aLong);

    @Override
    @NonNull
    @RestResource(exported = false)
    void delete(@NonNull Point entity);

    @Override
    @NonNull
    @RestResource(exported = false)
    void deleteAllById(@NonNull Iterable<? extends Long> longs);

    @Override
    @RestResource(exported = false)
    void deleteAll(@NonNull Iterable<? extends Point> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Query(value = "SELECT * FROM point " +
            "WHERE ST_DWithin(geom, ST_GeomFromText(FORMAT('POINT(%s %s)', :lat, :lon)), :radius, true)",
            nativeQuery = true)
    @RestResource(path = "/inRange")
    List<Point> findPointsInRadius(double lat, double lon, double radius);
}
