package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Владимир");
        User user2 = new User("Александр");
        User user3 = new User("Сергей");
        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Что делаешь?");
        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Я работаю");
        user2.sendMessage(user1, "А ты чем занимаешься?");
        user3.sendMessage(user1, "Привет!");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Не хочешь завтра встретиться?");
        user1.sendMessage(user3, "Привет!");
        user1.sendMessage(user3, "Всё в порядке");
        user1.sendMessage(user3, "Конечно, давай встретимся");
        user3.sendMessage(user1, "ОК, договорились");
        MessageDatabase.showDialog(user3, user1);

    }
}
