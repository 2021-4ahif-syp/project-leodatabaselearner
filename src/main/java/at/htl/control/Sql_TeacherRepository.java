package at.htl.control;

import at.htl.entity.Sql_Statement;
import at.htl.entity.Sql_Teacher;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.transaction.Transactional;

@Transactional
public class Sql_TeacherRepository implements PanacheRepository<Sql_Teacher> {
    public Sql_Teacher save(Sql_Teacher sqlTeacherToSave) {
        return getEntityManager().merge(sqlTeacherToSave);
    }

}
