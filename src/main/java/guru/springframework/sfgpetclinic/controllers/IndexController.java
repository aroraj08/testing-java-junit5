package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.exception.NameNotFoundException;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oopsHandler(){
        //return "not implemented";
        throw new NameNotFoundException();
    }
}
