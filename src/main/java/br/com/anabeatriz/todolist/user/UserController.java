package br.com.anabeatriz.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificadores
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {
    

    /**
     * String (text)
     * Integer (int)- numeros inteiros (0, 10)
     * Double (double) - numeros 0.0000 
     * Float (float) - numeros 0.000
     * Char (A Z)
     * Date (data)
     * void
     */

    @PostMapping("")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    } 
}
