import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static List<Person> generateClients() {
        List<Person> people = new LinkedList<>();
        people.add(new Person("Анна", "Каренина", 3));
        people.add(new Person("Евгений", "Онегин", 5));
        people.add(new Person("Илья", "Обломов", 8));
        people.add(new Person("Родион", "Раскольников", 4));
        people.add(new Person("Лариса", "Огудалова", 2));
        return people;
    }

    public static void main(String[] args) {

        Deque<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person a = queue.pollFirst();
            System.out.println(a.name + " " + a.surname + " " + "использовал(а) 1 билет, прокатившись на аттракционе");
            a.setTickets(a.tickets - 1);
            if (a.tickets > 0) {
                queue.offerLast(a);
            }
        }
    }
}