package in.strikes;

import java.util.List;

public class UserService {

//    private List<String> userNames;
//
//    public UserService(List<String> userNames){
//        this.userNames = userNames;
//    }
//
//    public List<String> getUserNames() {
//        return userNames;
//    }

    public UserService(){
        System.out.println("UserService created");
    }

    public void init(){
        System.out.println("Post Construct phase");
    }

    public void cleanup(){
        System.out.println("Pre Destroy phase");
    }
}
