package at.htl.control;

import at.htl.entity.Sql_Teacher;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.transaction.Transactional;

@Transactional
public class Sql_TeacherRepository implements PanacheRepository<Sql_Teacher> {
}
