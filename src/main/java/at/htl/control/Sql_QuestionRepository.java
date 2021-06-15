package at.htl.control;

import at.htl.entity.Sql_Exercise;
import at.htl.entity.Sql_Question;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Transactional
@ApplicationScoped
public class Sql_QuestionRepository implements PanacheRepository<Sql_Question> {

    public Sql_Question save(Sql_Question sql_questionToSave) {
        return getEntityManager().merge(sql_questionToSave);
    }

    public List<Sql_Question> findAllQuestions() {
        return Collections.unmodifiableList(listAll());
    }
}
