package answers;

public class PageRun {
	WebDriver driver;
	@BeforeTest
	public  void initalize() {
		DriverInit initaldriver=DriverInit.instance_run();
		driver =initaldriver.get_driver();
	}
	@Test
	public void loadpage() {
		driver.get("");
		System.out.println(driver.getTitle());
	}

}
