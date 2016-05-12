/**
 * 
 */
package com.mangodemo.repository;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mangodemo.BaseTest;
import com.mangodemo.model.Person;

/**
 * @author jiazhang
 *
 */
public class PersonRepositoryTest extends BaseTest {

    @Test
    public void insert() {
        PersonRepository personRepository = mango.create(PersonRepository.class);
        Person person = new Person(1, "张三", 14, "深圳");
        int effertlines = personRepository.addPerson(person);
        Assert.assertEquals(effertlines, 1);
    }
}
