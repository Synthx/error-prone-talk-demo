import com.jetdev.devlille.devlilleerrorpronedemo.dto.User;

void main(final String[] args) {
    if (args.length == 0) {
        throw new IllegalArgumentException("No arguments provided.");
    }

    final String name = new User(args[0]).name();
    System.out.printf("Hello %s%n", name);
}
