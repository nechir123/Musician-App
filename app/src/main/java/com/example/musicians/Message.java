package com.example.musicians;

public class Message {//extends ForumPage {
    String username;
    String message;

    public Message() {}

    public Message(String username, String message) {
        this.username = username; // The username of the event.
        this.message = message; // The message body: actual message.
    }
}