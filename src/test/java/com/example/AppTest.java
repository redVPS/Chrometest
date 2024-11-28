import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void testIsChromeInstalled() {
        // Assuming Chrome is installed at the default location
        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        assertTrue("Chrome should be installed", App.isChromeInstalled(chromePath));
    }
}

