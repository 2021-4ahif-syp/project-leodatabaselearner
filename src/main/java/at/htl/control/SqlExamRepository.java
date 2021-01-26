package at.htl.control;

import at.htl.entity.SqlExam;
import at.htl.entity.SqlStatement;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.transaction.Transactional;

public class SqlExamRepository implements PanacheRepository<SqlExam> {

    @Transactional
    public SqlExam save(SqlExam sqlExamToSave) {
        return getEntityManager().merge(sqlExamToSave);
    }

}
