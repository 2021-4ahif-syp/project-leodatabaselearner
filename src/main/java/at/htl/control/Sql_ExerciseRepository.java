package at.htl.control;

import at.htl.entity.Sql_Exercise;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Transactional
public class Sql_ExerciseRepository implements PanacheRepository<Sql_Exercise> {

    @Transactional
    public Sql_Exercise save(Sql_Exercise sqlExamToSave) {
        return getEntityManager().merge(sqlExamToSave);
    }


    public List<Sql_Exercise> findAllExercises() {

        return Collections.unmodifiableList(listAll());

    }

    public List<Sql_Exercise> findAllSortedByName() {

        return Collections.unmodifiableList(listAll(Sort.by("NAME")));

    }
}
