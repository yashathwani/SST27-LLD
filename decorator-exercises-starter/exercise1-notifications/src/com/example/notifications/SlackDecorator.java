package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private String channel;

    public SlackDecorator(Notifier wrapper, String channel) {
        super(wrapper);
        this.channel = channel;
    }

    @Override
    public void notify(String message) {
        super.notify(message); // Call the wrapped notifier
        System.out.println("Sending Slack message to channel " + channel + ": " + message);
    }

}