package br.pro.diegoquirino.calculadora.ux;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.exceptions.DiffsFoundException;
import com.applitools.eyes.selenium.Eyes;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;

public class EyesSingleton {

    private static Eyes eyes = null;

    private static String appName = "CalculadoraDesconto"; // Change or Externalize o NOME DA APP

    private EyesSingleton() {
        super();
    }

    public static Eyes get() {
        if(eyes==null) {
            eyes = new Eyes();
            // Change or Externalize a APIKEY para a da sua conta, a fim de que seja possível gerenciar mudanças
            // e planos de execução
            eyes.setApiKey("4yYSZLi104Ks8aWh9F820UT8104shQKuz6VcH2u1N1pBKPU110");
        }
        return eyes;
    }

    public static void open(WebDriverFacade driver, String testName) {
        get().open(driver.getProxiedDriver(), appName, testName);
    }

    public static void close() {
        get().close();
    }

    public static void simpleCheck(WebDriverFacade driver, String testName, String tag) {
        try {
            open(driver, testName);
            get().checkWindow(tag);
            close();
        } catch (DiffsFoundException e) {
            System.out.println("******************************************************");
            System.out.println("******************************************************");
            System.out.println("***             DIFERENÇAS ENCONTRADAS             ***");
            System.out.println("******************************************************");
            System.out.println("******************************************************");
            e.printStackTrace();
        }
    }
}
