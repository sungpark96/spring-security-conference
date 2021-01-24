//package com.pluralsight.conference.controller;
//
//import com.pluralsight.conference.model.Account;
//import com.pluralsight.conference.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
////@Controller
////public class AccountController {
////
////    @Autowired
////    private AccountService accountService;
////
////    @Autowired
////    private PasswordEncoder encoder;
////
////    @Autowired
////    private ApplicationEventPublisher eventPublisher;
//
////    @GetMapping("account")
////    public String getRegistration(@ModelAttribute("account") Account account) {
////        return "account";
////    }
////
////    @PostMapping("account")
////    public String addRegistration(@Valid @ModelAttribute ("account")
////                                          Account account,
////                                  BindingResult result) {
////
////        //check for errors
////        //should verify that the account and the user don't already exist
////        //should verify valid email address
////
////        //encrypt password
////        account.setPassword(encoder.encode(account.getPassword()));
////
////        //create the account
////        account = accountService.create(account);
////
////        //fire off an event on creation
////        eventPublisher.publishEvent(new OnCreateAccountEvent(account,"conference_war"));
////        return "redirect:account";
////    }
//
////    @GetMapping("accountConfirm")
////    public String confirmAccount(@RequestParam("token") String token) {
////        accountService.confirmAccount(token);
////
////        return "accountConfirmed";
////    }
////}
//
//@RestController
//@RequestMapping("/account")
//public class AccountController {
//
////    private final Accountservice accountService;
////
////    public AccountController(AccountService accountService) {
////        this.accountService = accountService;
////    }
////
////    @GetMapping("/{username}")
////    @ResponseStatus(HttpStatus.OK)
////    public Account getAccountByUsername(
////            @PathVariable("username") String username;
////    ) {
////        return accountService.get(username);
////    }
////
////    @PostMapping
////    @ResponseStatus(HttpStatus.CREATED)
////    public void create(@RequestBody Account body) {
////        accountService.insertAccount(body);
////    }
//}
//
//
//
//
