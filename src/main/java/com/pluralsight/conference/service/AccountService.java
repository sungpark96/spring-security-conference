//package com.pluralsight.conference.service;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.pluralsight.conference.Exception.AccountNotFoundException;
//import com.pluralsight.conference.dao.AccountDao;
//import com.pluralsight.conference.model.Account;
//import com.pluralsight.conference.model.AccountMongoEntity;
//import com.pluralsight.conference.model.ConferenceUserDetails;
//import com.pluralsight.conference.model.VerificationToken;
//import com.pluralsight.conference.dao.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.function.Supplier;
//
//@Service
//public class AccountService {
//    private final AccountDao accountDao;
//
//    private static final Supplier<AccountNotFoundException> ACCOUNT_NOT_FOUND =
//            () -> new AccountNotFoundException("Account Not Found!");
//
//    @Autowired
//    public AccountService(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }
//
////    public void insertAccount(Account username) {
////        accountDao.insertData(username);
////    }
////
////    public Account get(int id) {
////        if studentDao.get(id) = null --> orElseThrow
////        return accountDao.get(id).orElseThrow(ACCOUNT_NOT_FOUND);
////    }
//
////    Below is regular
////    @Autowired
////    private AccountDao accountDao;
//
////    public AccountMongoEntity create(
////            JsonNode body
////    ) {
////
//////        Option 2.
//////        AccountMongoEntity entity = new AccountMongoEntity;
//////        entity.setFirstName(body.get("firstName"))
//////        entity.setLastName(body.get("lastName"))
////
////        return accountDao.insertAccount(entity);
////    }
//
////    @Override
////    public void createVerificationToken(Account account, String token) {
////        VerificationToken verificationToken = new VerificationToken();
////        verificationToken.setToken(token);
////        verificationToken.setUsername(account.getUsername());
////
////        accountRepository.saveToken(verificationToken);
////    }
////
////    @Override
////    public void confirmAccount(String token) {
////        //retrieve token
////        VerificationToken verificationToken = accountRepository.findByToken(token);
////        //verify date
////        if(verificationToken.getExpiryDate().after(new Date())) {
////            //move from account table to userdetails table
////            Account account = accountRepository.findByUsername(verificationToken.getUsername());
////            //create user details
////            List<GrantedAuthority> authorities = new ArrayList<>();
////            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
////
////            ConferenceUserDetails userDetails =
////                    new ConferenceUserDetails(account.getUsername(),
////                            account.getPassword(),
////                            authorities);
////            accountRepository.createUserDetails(userDetails);
////            accountRepository.createAuthorities(userDetails);
////            //delete from accounts
////            accountRepository.delete(account);
////            //delete from tokens
////            accountRepository.deleteToken(token);
////        }
////    }
//}
