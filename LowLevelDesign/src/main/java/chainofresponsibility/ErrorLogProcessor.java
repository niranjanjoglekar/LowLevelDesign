package chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message){

        if(logLevel == ERROR){
            System.out.println("ERROR: "+message);
        }else{
            nextLogProcessor.log(logLevel,message);
        }
    }
}
