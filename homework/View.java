package homework;

import java.util.Scanner;

public class View {
    
    private UserController controller = new UserController();
    private User user;

    public User createUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a User name: ");
        String name = scanner.nextLine();
        user = controller.createUser(name);
        return user;
    }

    public void getReport(){
        controller.getReport(user);
    }

    public void saveUser(){
        controller.saveUser(user);
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Create User");
            System.out.println("2 - Get report for User");
            System.out.println("3 - Save User");
            System.out.println("4 - Exit");
            
            switch (scanner.nextInt()) {
                case 1 -> createUser();
                case 2 -> getReport();
                case 3 -> saveUser();
                case 4 -> System.exit(0);
            
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }
}
