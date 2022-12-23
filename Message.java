class Message {
    User user;
    String userMessage;

    Enum tag;

    public Message(User user, String userMessage, TagMessage tag) {
        this.tag = tag;
        this.user = user;
        this.userMessage = userMessage;
    }

    public User getUser() {
        return user;
    }

    public Enum getFlag() {
        return tag;
    }

    public String getUserMessage() {
        return userMessage;
    }
}