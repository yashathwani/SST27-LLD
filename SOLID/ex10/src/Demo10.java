class ConsoleLogger {
    void log(String msg){ System.out.println("[LOG] " + msg); }
}
class ReportService {
    void generate(){
        ConsoleLogger logger = new ConsoleLogger();
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}
public class Demo10 {
    public static void main(String[] args) {
        new ReportService().generate();
    }
}
