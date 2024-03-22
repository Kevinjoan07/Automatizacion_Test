package user.put;

import com.intuit.karate.junit5.Karate;
public class PutRunner {
    @Karate.Test
    Karate userPut(){
        return Karate.run("update-user-information").relativeTo(getClass());
    }
}
