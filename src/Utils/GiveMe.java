package Utils;

public class GiveMe {

    public static int random_integer(){
        int min_number = 1000;
        int max_number = 9999;

        return (int) (Math.random()*(max_number-min_number+1)+min_number);
    }
}
