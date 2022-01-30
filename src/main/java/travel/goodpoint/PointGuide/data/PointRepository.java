package travel.goodpoint.PointGuide.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import travel.goodpoint.PointGuide.models.Point;

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
}
