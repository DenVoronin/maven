import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main (String[] args) throws IOException {

        Properties props = new Properties();
        props.load(Main.class.getClassLoader().getResourceAsStream("lower-case.properties"));
        String isSmall = props.getProperty("isSmall");

        if (isSmall.equals("yes")) {
            System.out.println(StringUtils.lowerCase(args[0]));
        } else {
            System.out.println(StringUtils.upperCase(args[0]));
        }
    }
}