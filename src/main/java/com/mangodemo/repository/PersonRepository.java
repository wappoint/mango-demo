/**
 * 
 */
package com.mangodemo.repository;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.ReturnGeneratedId;
import org.jfaster.mango.annotation.SQL;

import com.mangodemo.model.Person;

/**
 * @author jiazhang
 *
 */
@DB(table = "t_person")
public interface PersonRepository {
    String COLUMNS = "id, name, age, addr";

    @ReturnGeneratedId
    @SQL("insert into #table(" + COLUMNS + ") values(:id, :name, :age, :addr)")
    int addPerson(Person person);

    @SQL("select " + COLUMNS + " from #table where id = :1")
    Person getPerson(int id);

    @SQL("update #table set name=:name, age=:age, addr=:addr where id = :id")
    boolean updatePerson(Person person);

    @SQL("delete from #table where id = :1")
    boolean deletePerson(int id);
}
