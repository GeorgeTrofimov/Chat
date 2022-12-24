public class main {
    public static void main(String[] args) {
        ChatingRoom chat1 = new ChatingRoom("******************  Флудилка  **********************");
        User client1 = UserBuilder
                .getInstance()
                .setNickname("Игорь!")
                .setName("Никита!")
                .setStatus("Валерия!")
                .build();
        System.out.println(client1);

        User client2 = UserBuilder
                .getInstance()
                .setNickname(null)
                .setName(null)
                .setStatus(null)
                .build();
        System.out.println(client2);

        User client3 = UserBuilder
                .getInstance()
                .setNickname("Исусс ")
                .setName("Левша")
                .setStatus("Walker")
                .build();
        System.out.println(client3);

        chat1.appendClient(client1);
        chat1.appendClient(client2);
        chat1.appendClient(client3);

        client1.sendMsg("Привет всем!", chat1);
        client2.sendMsg("Хаю-хай!", chat1);
        client3.sendMsg("Здарова!", chat1);

        User client4 = UserBuilder
                .getInstance()
                .setNickname("VLAD (.) (.)")
                .setName("Влад")
                .setStatus("xD")
                .build();
        System.out.println(client4);

        chat1.appendClient(client4);

        client3.sendMsg("Hi, как дела?",chat1);
        client1.sendMsg("Норм!",chat1);
        client2.sendMsg("Good!",chat1);

        chat1.deleteClient(client4);

        chat1.ReadChat();
        System.out.println("\n\n\n");
        client1.readUserChat(chat1);
    }
}