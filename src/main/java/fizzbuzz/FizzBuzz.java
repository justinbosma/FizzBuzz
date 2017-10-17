package fizzbuzz;

import java.util.*;

public class FizzBuzz {

    ArrayList fizz = new ArrayList();
    ArrayList buzz = new ArrayList();
    ArrayList fizzbuzz = new ArrayList();
    //Constructor for fizzbuzz class
    public FizzBuzz(ArrayList fizz, ArrayList buzz, ArrayList fizzbuzz) {
        this.fizz = fizz;
        this.buzz = buzz;
        this.fizzbuzz = fizzbuzz;
    }

    public ArrayList getFizz() {
        return fizz;
    }

    public ArrayList getBuzz() {
        return buzz;
    }

    public ArrayList getFizzBuzz() {
        return fizzbuzz;
    }
}