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

    //Create a class GetMapping and use GET Request Method and pass name as path variable
    //curl localhost:8080/hello/param/Sunil -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name+"!";
    }

    //Create a method sayHello and use POST Request Method and pass first name and last name in the Body
    //curl -X POST _H "Content-Type: application -w "\n"
    //     -d '{"firstName": "Sunil", "lastName": "Meena"}'
    //     "http:/localhost:8080/hello/post" -w "\n"
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello "+ user.getFirstName() +" "+user.getLastName()+"!";
    }



}
