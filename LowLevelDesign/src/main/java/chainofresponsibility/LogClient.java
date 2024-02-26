package chainofresponsibility;

public class LogClient {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.INFO,"Initiating application");
        logProcessor.log(LogProcessor.ERROR,"Error occurred during initiation");
        logProcessor.log(LogProcessor.DEBUG,"Debugging logs");
    }
}
