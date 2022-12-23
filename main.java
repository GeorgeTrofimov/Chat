public class main {
    public static void main(String[] args) {
        ChatingRoom chat1 = new ChatingRoom("******************  Флудилка  **********************");
        User client1 = new User("Игорь", chat1);
        User client2 = new User("Никита", chat1);
        User client3 = new User("Валерия", chat1);
        chat1.appendClient(client1);
        chat1.appendClient(client2);
        chat1.appendClient(client3);

        client1.sendMsg("Привет всем!");
        client2.sendMsg("Хаю-хай!");
        client3.sendMsg("Здарова!");

        User client4 = new User("Владик", chat1);
        chat1.appendClient(client4);

        client3.sendMsg("hi, как дела?");
        client1.sendMsg("норм!");
        client2.sendMsg("good!");

        chat1.deleteClient(client4);

        chat1.ReadChat();
        System.out.println("\n\n\n");
        client1.readUserChat(chat1);
    }
}