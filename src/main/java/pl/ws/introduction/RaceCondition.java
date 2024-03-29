package pl.ws.introduction;

public class RaceCondition {

	//private static volatile boolean done; resolves visibility of value changed another way getter and setter synchronized
	private static boolean done;
	public static void main(final String[] args) throws InterruptedException{
		new Thread(
				new Runnable() {
					public void run() {
						int i = 0;
						while(!done) { i++; }
						System.out.println("Done!");
					}
				}
		).start();
		System.out.println("OS: " + System.getProperty("os.name"));
		Thread.sleep(2000);
		done = true;
		System.out.println("flag done set to true");
	}
}
