package lab1.ch1;

public class fizzbuzz {

    public void fizzBuzz() {
        for(int i = 0; i < 101; i ++) {
            if(i % 15 == 0) {
                System.out.print("FizzBuzz" + " ");
            }else if(i % 3 == 0){
                System.out.print("Fizz" + " ");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz" + " ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        fizzbuzz f = new fizzbuzz();
        f.fizzBuzz();
    }
}
