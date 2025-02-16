import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int [] people = new int[10];
        Random random = new Random();


        for (int i = 0 ; i < people.length; i++) {
            people[i] = random.nextInt(100);
        }

            for (int i = 0 ; i < people.length; i++){
                System.out.println(people[i]);
            }
        }




    }

