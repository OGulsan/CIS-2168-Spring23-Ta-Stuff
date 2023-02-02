public class Main {


    public static double raise(double base, int exp) {
        // deal with base cases


        // recursive step: but before the recursive step, ensure exponent is positive
        // if exp < 0 and base != 0, set base = 1.0/base and exp = -exp.
        // now proceed with recursive step


        if(exp % 2 == 0) { // if even
            //return raise(base, exp/2) * raise(base, exp/2)
        }
        else { // if odd
            //  return raise(base, exp/2) * raise(base, exp/2) * base
        }

        // notice how above in the recursive steps, we are making progress towards a base case
        // (our exponents are being halved each call)
    }


    // above code works, but is inefficient because of the duplicate calls to the raise method (line 14 and 17)
    public static double raise(double base, int exp) {
        // deal with base cases

        // recursive step: but before the recursive step, ensure exponent is positive
        // if exp < 0 and base != 0, set base = 1.0/base and exp = -exp.
        // now proceed with recursive step

        double temp = raise(base, exp/2); // only calling raise once this method, don't want to repeat unecessary work
        double retval = temp * temp; // is equal to raise(base, exp/2) * raise(base, exp/2)



        if (exp % 2 == 1) { // if odd multiply retval (raise(base, exp/2) * raise(base, exp/2)) by the base
            retval *= base;
        }

        return retval;
    }
}
// minor detail to be aware of: make sure exp is of type int, since we are dividing the exponent by 2 in the recursive calls in both implementations,
// you don't want it to be a decimal value after division, integer divison will fix this and keep the result an integer


// After implementing the above two methods, you will want to examine just HOW much better the second implementation is than the first
// add a Static class variable "public static countGbl = 0;"
// and then in each of the raise methods, increment the countGbl variable
// each time you do a multiplacation operation in the recursive portion of the code.

// Then you can write a main method/program that repeatedly sets countGbl to 0, then calculates raise(0.0, i) for i = 1, 2, 3, ...,100.
// pretty much you are calling each raise method 100 times, and each time you are incrementing the exponent value
// In each case, record the value of countGbl, and plot these values against i. (Use excel if you like)

// so pretty much call the method with a fixed base number, and an exponent from 1 to 100, and on each call, record the value of the countGbl
// static class variable, and then plot these values (in excel or whatever you want to use), and compare the differences between the two methods

// Due one week after your first lab period.
