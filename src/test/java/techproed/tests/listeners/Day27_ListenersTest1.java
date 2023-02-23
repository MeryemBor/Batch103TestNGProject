package techproed.tests.listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;
@Listeners(techproed.utilities.Listeners.class)
public class Day27_ListenersTest1 {
    @Test
    public void test1(){
        System.out.println("PASS");
        Assert.assertTrue(true);
    }
    @Test
    public void test2(){
        System.out.println("FAIL");
        Assert.assertTrue(false);
    }
    @Test
    public void test3(){
        System.out.println("SKIP");
        throw new SkipException("Metotu Atla");
    }
    @Test
    public void test4(){
        System.out.println("EXCEPTION");
//        throw new NoSuchElementException("No Such Element Exception");
        Driver.getDriver().get("https://www.techproeducation.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));
    }
}

/*
1.listeners paketi olustur
2. ListenersTest1 classi olustur
3. 4 tane metot olustur: test1(PASS), test2(FAIL), test3(SKIP), test4(NOSUCHELEMETNEXCEPTION)
4. Test classi Listeners class ile iliskilendir : @Listeners(utilities.Listeners.class)
 */