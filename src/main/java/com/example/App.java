import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

public class App {
    public static void main(String[] args) {
        try {
            // Step 1: Verify Chrome is installed
            String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
            if (isChromeInstalled(chromePath)) {
                System.out.println("Chrome is installed at: " + chromePath);
                
                // Step 2: Open a link in Chrome
                String url = "https://www.example.com";
                openInChrome(url);

                // Step 3: Print a message
                System.out.println("Successfully opened the link in Chrome.");
            } else {
                System.out.println("Chrome is not installed at the expected location.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Static method to check if Chrome is installed
    private static boolean isChromeInstalled(String path) {
        return new java.io.File(path).exists();
    }

    // Static method to open URL in Chrome
    private static void openInChrome(String url) throws IOException {
        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        // Launch Chrome with the URL if installed
        if (isChromeInstalled(chromePath)) {
            Runtime.getRuntime().exec(new String[]{chromePath, url});
        } else {
            // Fall back to the default browser if Chrome is not found
            Desktop.getDesktop().browse(URI.create(url));
        }
    }
}
