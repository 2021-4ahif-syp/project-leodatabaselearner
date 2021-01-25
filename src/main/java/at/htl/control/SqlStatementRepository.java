package at.htl.control;

import at.htl.entity.SqlStatement;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.transaction.Transactional;

public class SqlStatementRepository implements PanacheRepository<SqlStatement> {

    @Transactional
    public SqlStatement save(SqlStatement sqlStatementToSave) {
        return getEntityManager().merge(sqlStatementToSave);
    }




}
