import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    @Test
    public void testIsChromeInstalled() {
        // Assuming Chrome is installed at the default location
        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        
        // Test if Chrome is installed at the given path
        boolean isInstalled = App.isChromeInstalled(chromePath);
        
        // Assert that Chrome should be installed at the expected path
        assertTrue("Chrome should be installed", isInstalled);
    }
}
