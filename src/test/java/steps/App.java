package steps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dante on 4/12/17.
 */
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        String command = "ls";

        Process proc = Runtime.getRuntime().exec(command);

        // Read the output

        for(int i = 0; i < 1000; i++) {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.print(line + "\n");
            }

            proc.waitFor();
            Thread.sleep(5);
        }
    }

}
