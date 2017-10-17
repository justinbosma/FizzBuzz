package fizzbuzz;

import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

//Controller for fizzbuzz web service
@RestController
public class FizzBuzzController {
	//maps path to fizzbuzz method which creates and returns a new fizzbuzz object with the correct values placed into the array lists
	//upperBound is an integer used as the upper bound (inclusive) for the count
    @RequestMapping("/fizzbuzz/{upperBound}")
    public FizzBuzz fizzbuzz(@PathVariable("upperBound") int upperBound) {

        return createFizzBuzz(upperBound);
    }
    //Creates and returns a fizzbuzz object with ints in correct arraylists
    //non integer inputs will result in error
    public FizzBuzz createFizzBuzz(int upperBound) {
        ArrayList fizz = new ArrayList();
        ArrayList buzz = new ArrayList();
        ArrayList fizzbuzz = new ArrayList();
        for(int i=1; i<=upperBound; i++) {
            if(i%5 == 0 && i%3 == 0) {
                fizzbuzz.add(i);
            }
            else if(i%5 == 0 && i%3 != 0) {
                    buzz.add(i);
            }
            else if(i%3 == 0 && i%5 != 0) {
                fizz.add(i);
            }
        }
        return new FizzBuzz(fizz, buzz, fizzbuzz);
         
    }
}