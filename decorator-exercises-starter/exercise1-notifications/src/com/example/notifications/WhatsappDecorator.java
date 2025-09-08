package decorator-exercises-starter.exercise1-notifications.src.com;

public class WhatsappDecorator extends NotifierDecorator {
    private String whatsappId;

    public WhatsappDecorator(Notifier wrapper, String whatsappId) {
        super(wrapper);
        this.whatsappId = whatsappId;
    }

    @Override
    public void notify(String message) {
        super.notify(message); // Call the wrapped notifier
        System.out.println("Sending WhatsApp to " + whatsappId + ": " + message);
    }
    
}
