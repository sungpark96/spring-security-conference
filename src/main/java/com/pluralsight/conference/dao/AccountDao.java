//package com.pluralsight.conference.dao;
//import com.mongodb.DB;
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import com.pluralsight.conference.model.AccountMongoEntity;
//import org.bson.Document;
//import org.jongo.Jongo;
//import org.jongo.MongoCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AccountDao extends AbstractMongoDao{
//    private static String COLLECTION_NAME = "account";
//
//    @Autowired
//    public AccountDao(
//            BaseMongoConnector mongoConnector
//    ) {
//        super(COLLECTION_NAME, mongoConnector);
//    }
//    public void insertAccount(AccountMongoEntity account){
//        collection().insert(account);
//    }
//
////    public void insertMe(AccountMongoEntity account) {
////        Document doc = new Document("name", "MongoDB")
////                .append("type", "database")
////                .append("count", 1)
////                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
////                .append("info", new Document("x", 203).append("y", 102));
////    }
//}
//
//
///**
// Create a JUnit test
//
// class AccountDaoTest {
//     AccountDao accountDao;
//
//     @Test
//     void testInsert() {
//        AccountMongoEntity acct = new AccountMonogoEntity();
//        acct.setEmail("haha@gmail");
//
//
//
//        accountDao.insertAccount(acct);
//    }
// }
// */