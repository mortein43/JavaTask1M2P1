import com.eizenheim.hmt1m2p1.City;
import com.eizenheim.hmt1m2p1.Country;
import com.eizenheim.hmt1m2p1.Fraction;
import com.eizenheim.hmt1m2p1.Human;
import static java.lang.System.out;

public class Main {
    public static void delay () {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        out.println("Завдання 1:");
        Human human1 = new Human("Василіу", "Андрій", "Іванович", "06.08.1990", "+380972580102", "Чернівці", "Україна", "вул. О.Кобилянської");
        out.println(human1.toString());
        human1.setSecondName("Змінили по батькові");
        out.println(human1.toString());

        delay ();
        out.println("\nЗавдання 2:");
        City city1 = new City("Чернівці", "Чернівецька", "Україна", 264298, "58000", "0372");
        out.println(city1.toString());
        city1.setName("Поміняли назву міста");
        out.println(city1.toString());

        delay ();
        out.println("\nЗавдання 3:");
        Country country1 = new Country("Україна", "Європа", 41167335, "+380", "Київ",
                new String[]{"Київ", "Чернівці", "Ужгород", "Херсон"});
        out.println(country1.toString());
        country1.setCities(new String[]{"Київ", "Чернівці", "Ужгород", "Херсон", "Додали нове місто", "Додали ще одне місто"});
        out.println(country1.toString());

        delay ();
        out.println("\nЗавдання 4:");
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(1,6);
        out.println("Перший дріб - " + fraction1.toString());
        out.println("Другий дріб - " + fraction2.toString());
        Fraction resSum = fraction1.sum(fraction1, fraction2);
        Fraction resSubtraction = fraction1.subtraction(fraction1, fraction2);
        Fraction resMultiplication = fraction1.multiplication(fraction1, fraction2);
        Fraction resDivision = fraction1.division(fraction1, fraction2);

        out.println(fraction1 + " + " + fraction2 + " = " + resSum);
        out.println(fraction1 + " - " + fraction2 + " = " + resSubtraction);
        out.println(fraction1 + " * " + fraction2 + " = " + resMultiplication);
        out.println(fraction1 + " / " + fraction2 + " = " + resDivision);
    }

}