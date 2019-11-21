package com.testwpl.www.testwpl.service;

import com.testwpl.www.testwpl.dao.PersonDao;
import com.testwpl.www.testwpl.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDao personDao;

    //Dependency Injection
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        personDao.addPerson(person);
        return 1;
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }
}
