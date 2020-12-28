package answers;

public class DriverInit {
	
	private static DriverInit driver_instance=null;
	private DriverInit() {
		
	}
	public WebDriver driver;
	
	public WebDriver get_driver() {
		System.setProperty("webdriver.chrome.driver", "");
		driver.new ChromeDriver();
		return driver;
		}

	public static DriverInit instance_run() {
		if(driver_instance==null)
		{
			driver_instance=new DriverInit();
		}
	}
}
