package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;


    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        boolean x = false;
        for (int i = 0; i < subscriptions.size(); i++) {
            if (user.equals(subscriptions.get(i))) {
                x = true;
                break;
            }
        }
        return x;
    }

    public boolean isFriend(User user) {
        boolean x = false;
        for (int i = 0; i < subscriptions.size(); i++) {
            if (user.equals(subscriptions.get(i))) {
                x = true;
                break;
            }
        }
        for (int i = 0; i < user.subscriptions.size(); i++) {
            if (this.equals(user.subscriptions.get(i))) {
                x = true;
                break;
            } else {
                x = false;
            }
        }

        return x;

    }
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }

}


