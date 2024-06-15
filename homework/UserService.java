package homework;

public class UserService {
    
    public User createUser(String name){
        User user = new User(name);
        return user;
    }

    public void getReport(User user){
        System.out.println("Report for user: " + user.getName());
    }

    public void saveUser(User user){
        Persister persister = new Persister(user);
        persister.save();
    }
}

