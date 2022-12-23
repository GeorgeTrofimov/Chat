import java.util.ArrayDeque;
import java.util.ArrayList;

class ChatingRoom implements Chat {
    ArrayList<User> users = new ArrayList<>();

    ArrayDeque<Message> message = new ArrayDeque<>();
    private String nameChat;

    public ChatingRoom(String nameChat) {
        this.nameChat = nameChat;
    }

    public String getNameChat() {
        return nameChat;
    }

    @Override
    public void sendMessage(String text, User me) {
        Message mess = new Message(me, text, TagMessage.USER);
        message.add(mess);
    }

    public void ReadChat() {
        System.out.println(this.nameChat);
        for (Message mess : message) {
            printChatMessage(mess);
        }
    }

    void printChatMessage(Message mess) {
        if (mess.getFlag().equals(TagMessage.USER)) {
            System.out.printf("%s: %s\n", mess.getUser().name, mess.getUserMessage());
        } else {
            System.out.printf("%s\n", mess.getUserMessage());
        }
    }

    @Override
    public void appendClient(User client) {
        String text = "<<< Добавился(ась) " + client.name + " в группу >>>";
        Message mess = new Message(client, text, TagMessage.CHAT);
        message.add(mess);
        users.add(client);
    }

    @Override
    public void deleteClient(User client) {
        String text = "<<< " + client.name + " покинул группу >>>";
        Message mess = new Message(client, text, TagMessage.CHAT);
        message.add(mess);
        users.remove(users.indexOf(client));
    }
}