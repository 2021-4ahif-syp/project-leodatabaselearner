package at.htl.control;

import at.htl.entity.SqlStatement;
import at.htl.entity.Sql_Answer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.transaction.Transactional;

public class Sql_AnswerRepository implements PanacheRepository<Sql_Answer> {

    @Transactional
    public Sql_Answer save(Sql_Answer sql_answerToSave) {
        return getEntityManager().merge(sql_answerToSave);
    }

    @Transactional
    public void delete(long id, Sql_Answer type) {
        this.delete(find(id, type));
    }

}
