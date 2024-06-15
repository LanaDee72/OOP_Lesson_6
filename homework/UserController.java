package homework;

public class UserController {

    private UserService service = new UserService();
    
    public User createUser(String name){
        return service.createUser(name);
    }

    public void getReport(User user){
        service.getReport(user);
    }

    public void saveUser(User user){
        service.saveUser(user);
    }
}
