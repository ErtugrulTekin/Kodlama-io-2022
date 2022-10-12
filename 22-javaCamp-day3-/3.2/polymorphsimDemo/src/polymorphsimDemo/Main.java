package polymorphsimDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new DataBaseLogger(), new
		 * FileLogger(), new EmailLogger(), new ConsoleLogger()}; for(BaseLogger
		 * logger:loggers) { logger.log("Log mesajı"); }
		 */
		
		
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.add();
	}

}
