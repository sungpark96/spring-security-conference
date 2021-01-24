//import com.mongodb.DB;
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import com.pluralsight.conference.dao.BaseMongoConnector;
//import org.jongo.Jongo;
//import org.jongo.MongoCollection;
//import org.springframework.stereotype.Repository;
//
////package com.pluralsight.conference.repository;
////
////import org.bson.Document;
////import org.springframework.stereotype.Repository;
////
////import java.util.Arrays;
////
//@Repository("Finance")
//public class FinanceDao  {
//    String collectionName = "Finance";
//
//    public void toBeInserted() {
//        Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
//                .append("info", new Document("x", 203).append("y", 102));
//
//        insertFromAbstractMongoDB(doc);
////        collection.insertOne(doc);
//    }
//
//    public String getCollectionName(){
//        return collectionName;
//    }
//
//    protected BaseMongoConnector mongoConnector(){
//        return mongoConnector;
//    }
//
//    protected MongoClient client(){
//        return mongoConnector().client();
//    }
//
//    protected MongoCollection collection(){
//        return jongo().getCollection(collectionName);
//    }
//
//    protected MongoDatabase database(){ return mongoConnector().database(); }
//
//    protected DB db(){
//        return mongoConnector().db();
//    }
//
//    protected Jongo jongo(){
//        return mongoConnector().jongo();
//    }
//}
