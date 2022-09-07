public class OpgaveOverloading {

  public static void main(String[] args) {

    //1
    int a = 10;
    int b = 15;

    //2
    double c = 5.5;
    double d = 2.2;

    //3
    int a1 = 10;
    double c1 = 5.5;
    double sum;
    sum = (double) (a1 + c1);

    //1
    System.out.print("The sum of 10 and 15 is: " + Integer.sum(a,b) + "\n");
    //2
    System.out.print("The sum of 5,5 and 2,2 is: " + Double.sum(c,d) + "\n");
    //3
    System.out.print("The sum of a and b is: " + sum);

    }

  }

