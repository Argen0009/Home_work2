import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String retul;
       retul= ageAndTemperature(36, -6);
       System.out.println(retul);
       retul= ageAndTemperature(15, 1);
        System.out.println(retul);
        retul=ageAndTemperature(26, -4);
        System.out.println(retul);
        retul=ageAndTemperature(56, 32);
        System.out.println(retul);
        retul=ageAndTemperature(12, -12);
        System.out.println(retul);
        //дз на собразитель
        retul= ageAndTemperature(generateRandomAge(),35 );
        System.out.println(retul);

    }

    public static String ageAndTemperature(int age, double temperature) {

        if (age > 20 && age < 46) {
            if (temperature > -20 && temperature < 30) {
                return "Можно идти гулять";

            }
        } else if (age <= 20) {
            if (temperature > 0 && temperature < 28) {
                return "Можно идти гулять";
            }
        } else if (age >= 45) {
            if (temperature > -10 && temperature < 25) {
                return "Можно идти гулять";
            } else {
                return "Оставайтесь дома!";
            }
        }
        return "Оставайтесь дома ";
    }
    public static int  generateRandomAge(){
        Random random = new Random ();
        int g;
        g = random.nextInt(5,45);
        return g;
    }
}