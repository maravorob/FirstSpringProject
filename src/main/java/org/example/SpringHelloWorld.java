package org.example;

public class SpringHelloWorld {
    private Message message;

    public SpringHelloWorld(Message message) {
        this.message = message;
    }

    public void outputMessage(){
        System.out.println("You have a new message: "+message.getMessage());
    }
}
