package Utils;

import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmailGenerator {
    private static String email;

    public static String  randomEmailGenerator(){

        if(email == null){
            String prefix = RandomStringUtils.randomAlphabetic(6);
            email = prefix + "@gmail.com";

        }return email;

    }

}
