public class Main {
    public static void main(String[] args) {
//        EmailLogger logger = new EmailLogger();
//        logger.Log("Log message");

//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        for(BaseLogger logger: loggers){
//            logger.log("Log message");
//        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}