package at.htl.control;

import at.htl.entity.Sql_Statement;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.transaction.Transactional;

public class SqlStatementRepository implements PanacheRepository<Sql_Statement> {

    @Transactional
    public Sql_Statement save(Sql_Statement sqlStatementToSave) {
        return getEntityManager().merge(sqlStatementToSave);
    }




}
