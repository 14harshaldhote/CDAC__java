package thread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ThreadWebExample1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver_executable");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("path_to_brave_executable");

        String[] urls = {
            "https://www.google.com",
            "https://www.openai.com",
            "https://era.mkcl.org/lms/#/17771092653531958716",
            "https://www.reddit.com/"
        };

        for (String url : urls) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    WebDriver driver = new ChromeDriver(options);
                    driver.get(url);
                    System.out.println("Visited: " + url);
                    driver.quit();
                }
            });
            thread.setName("Thread-" + url); // Set a unique name for each thread
            thread.start();

            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
