package decorator-exercises-starter.exercise1-notifications.src.com.example.notifications;

public class NotifierDecorator implements Notifier {
    protected Notifier wrapper;

    public NotifierDecorator(Notifier wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void notify(String message) {
        wrapper.notify(message);
    }
}
