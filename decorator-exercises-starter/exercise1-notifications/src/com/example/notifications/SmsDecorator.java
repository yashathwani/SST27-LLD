public class SmsDecorator extends NotifierDecorator {
    private final String phoneNumber;

    public SmsDecorator(Notifier wrapper, String phoneNumber) {
        super(wrapper);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message) {
        // First, delegate to the wrapped notifier
        super.notify(message);
        // Then, add SMS notification
        System.out.println("[SMS -> " + phoneNumber + "]: " + message);
    }
}
