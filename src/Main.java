import java.sql.Date;;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int JOURNAL_CAPACITY = 71367;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(JOURNAL_CAPACITY);
        List<Car> cars = new ArrayList<>();
        List<Owner> owners = new ArrayList<>();
        String line;
        System.out.println("Старт");
        while (true){
            line = sc.nextLine();
            if(line.equals("Старт")){
                System.out.println("Машина-1");
                System.out.println("Владелец-2");
            }
            else if(line.equals("1")){
                System.out.println("Номер");
                line = sc.nextLine();
                Car car = new Car(line);
                cars.add(car);
            }
            else if(line.equals("2")){
                System.out.println("Имя");
                line = sc.nextLine();
                System.out.println("Фамилия");
                String l = sc.nextLine();
                Owner owner = new Owner(line,l, new Date(System.currentTimeMillis()));
                owners.add(owner);
            }
        }
    }
}





























