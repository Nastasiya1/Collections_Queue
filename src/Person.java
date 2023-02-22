public class Person {
    protected String name;
    protected String surname;
    protected int tickets;

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }
}
