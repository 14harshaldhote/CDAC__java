package thread;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ThreadWebExampleSafari {
    public static void main(String[] args) {
        String[] urls = {
            "https://www.google.com",
            "https://www.openai.com",
            "https://era.mkcl.org/lms/#/17771092653531958716",
            "https://www.reddit.com/"
        };

        for (String url : urls) {
            openURLInSafari(url);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void openURLInSafari(String url) {
        try {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(new URI(url));
                System.out.println("Visited: " + url);
            } else {
                System.err.println("Desktop browsing not supported.");
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
