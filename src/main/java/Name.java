/**
 * Created by St on 02.04.2017.
 */
public class Name {
    private String first;
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String input) {
        this.first = input;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String input) {
        this.last = input;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
