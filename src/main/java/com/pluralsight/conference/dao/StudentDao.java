package com.pluralsight.conference.dao;

import com.pluralsight.conference.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentDao extends AbstractMongoDao{

    private static String COLLECTION_NAME = "student";

    @Autowired
    public StudentDao(BaseMongoConnector mongoConnector) {
        super(COLLECTION_NAME , mongoConnector);
    }

    public void insertData(Student student){
        collection().save(student);
    }

    public Optional<Student> get(int id) {
//        Optional - handling nullable cases
        return Optional.ofNullable(collection().findOne("{id: # }", id).as(Student.class));
    }


    @Override
    protected void runIndexes() {
        createBasicIndex("id");
    }
}
