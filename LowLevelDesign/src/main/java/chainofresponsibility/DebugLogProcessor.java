package chainofresponsibility;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message){

        if(logLevel == DEBUG){
           System.out.println("DEBUG: "+message);
        }else {
            nextLogProcessor.log(logLevel,message);
        }
    }
}
