package at.htl.control;

import at.htl.entity.Sql_Exercise;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;

import javax.transaction.Transactional;
import java.security.Timestamp;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Transactional
public class Sql_ExerciseRepository implements PanacheRepository<Sql_Exercise> {
    private List<Sql_Exercise> exercises;

    private Sql_ExerciseRepository(){
        exercises = createExercises();
    }

    private List<Sql_Exercise> createExercises() {
        List<Sql_Exercise> dancerList = new LinkedList<>();
        dancerList.add(new Sql_Exercise(
                new Date(System.currentTimeMillis()),
                "simple-selects-exercise ",
                "admin",
                "simple select statments..."));
        dancerList.add(new Sql_Exercise(
                new Date(System.currentTimeMillis()),
                "subquery-exercise",
                "admin",
                "subqueries..."));
        dancerList.add(new Sql_Exercise(
                new Date(System.currentTimeMillis()),
                "joins-exercise",
                "admin",
                "join statments..."));
        return exercises;
    }


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

    public Sql_Exercise removeExercise(String name) {
        Sql_Exercise deletedSqlExercise = new Sql_Exercise();
        for (Sql_Exercise e : exercises) {
            if (e.getName().equals(name)) {
                deletedSqlExercise = e;
                exercises.remove(e);
            }
        }
        return deletedSqlExercise;
    }

}
