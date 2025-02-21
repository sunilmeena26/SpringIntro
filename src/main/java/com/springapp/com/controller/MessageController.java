package com.springapp.com.controller;
import org.springframework.web.bind.annotation.*;

//Create a class MessageController, It is Rest Controller
@RestController
@RequestMapping("/hello")
public class MessageController {

        //Create a method sayHello and Use GET Request Method
        //curl localhost:8080/hello -w "\n"
        @RequestMapping(value = {"","/","/home"})
        public String sayHello(){
            return "Hello From BridgeLabz!";
        }

    //Create a method sayHello and use GET Request Method
    //curl localhost:8080/hello/query?name=Sunil -w "\n"
    @RequestMapping(value={"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){
        return "Hello "+name+"!";
    }


}
