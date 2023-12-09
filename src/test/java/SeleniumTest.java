import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {

	private WebDriver driver;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com.br/");

		String currentUrl = driver.getCurrentUrl();
		String expected = "https://www.google.com.br/";

		assertEquals(expected, currentUrl);

		driver.quit();
	}

	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com.br/");

		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium", Keys.ENTER);


		String expected = "https://www.selenium.dev/";

		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"))
				.click();

		String currentUrl = driver.getCurrentUrl();

		assertEquals(expected, currentUrl);

		driver.quit();

	}

	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).click();

		String expected = "https://doodles.google/";
		String currentUrl = driver.getCurrentUrl();
		assertEquals(expected, currentUrl);

		driver.quit();

	}

	@Test
	public void test4() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");

		boolean estala = driver.findElement(By.id("hplogo")).isDisplayed();

		assertTrue(estala);
		driver.quit();

	}

	@Test
	public void test5() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");

		boolean naoestala = !driver.findElement(By.id("hplogo")).isDisplayed();

		assertFalse(naoestala);
		driver.quit();

	}

	@Test
	public void test6() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");
		Actions actions = new Actions(driver);

		WebElement gmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));

		actions.moveToElement(gmail).click().perform();

		String expected = "https://www.google.com/intl/pt-BR/gmail/about/";
		String currentUrl = driver.getCurrentUrl();

		assertEquals(expected, currentUrl);
		driver.quit();

	}

	@Test
	public void test7(){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");


		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).submit();;

		String currentUrl = driver.getCurrentUrl();
		String expected = "https://www.google.com.br/";

		assertTrue(currentUrl != expected); 
		// estou fazendo isso nao para testar a url mas sim para a função submit() mas como o google toda vez que se pesquisa algo a sua url muda não tenho como pegar um valor fixo para serem iguais por isoo !=
		
		driver.quit();

	}
	@Test 
	public void tes8(){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();

		String expected = "https://www.google.com/imghp?hl=pt-BR&ogbl";
		String currentUrl = driver.getCurrentUrl();
		
		assertEquals(expected, currentUrl);

		driver.quit();

		
	}
	@Test 
	public void test9(){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[2]")).click();

		String expected = "https://ads.google.com/intl/pt-BR_br/home/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1";
		String currentUrl = driver.getCurrentUrl();
		
		assertEquals(expected, currentUrl);

		driver.quit();

		
	}

	@Test
	public void tes10(){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com.br/");

		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("daniel");


		String expected = "https://daniel.art.br/";

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).click();

		String currentUrl = driver.getCurrentUrl();

		assertEquals(expected, currentUrl);




	}

	

	

}
