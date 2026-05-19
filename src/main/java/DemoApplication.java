import com.jetdev.devlille.devlilleerrorpronedemo.dto.User;

void main() {
    final String name = new User("Pinpin").name();
    System.out.printf("Hello %s%n", name);
}
