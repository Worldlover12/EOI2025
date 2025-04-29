package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        User u1 = new User("Jahn", "Smath", "jahn@gmail.com");
        User u2 = new User("Jesh", "Smeth", "jesh@gmail.com");
        User u3 = new User("Jine", "Smith", "jine@gmail.com");
        User u4 = new User("Jone", "Smoth", "jone@gmail.com");
        ArrayList<User> userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()){
            User i = iterator.next();
            System.out.println(i);
        }
    }



}
