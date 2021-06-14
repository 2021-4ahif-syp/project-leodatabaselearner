package at.htl.control;

import at.htl.entity.Sql_Exercise;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.transaction.Transactional;

@Transactional
public class SqlExerciseRepository implements PanacheRepository<Sql_Exercise> {

    @Transactional
    public Sql_Exercise save(Sql_Exercise sqlExamToSave) {
        return getEntityManager().merge(sqlExamToSave);
    }


    public Object findAllExercises() {
    }
}
