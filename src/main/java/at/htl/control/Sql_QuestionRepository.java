package at.htl.control;

import at.htl.entity.Sql_Question;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@Transactional
@ApplicationScoped
public class Sql_QuestionRepository implements PanacheRepository {

    public Sql_Question save(Sql_Question sql_questionToSave) {
        return getEntityManager().merge(sql_questionToSave);
    }
}
