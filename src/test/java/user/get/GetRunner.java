package user.get;

import com.intuit.karate.junit5.Karate;

public class GetRunner {
    @Karate.Test
    Karate userGet(){
        return Karate.run("search-new-user").relativeTo(getClass());
    }
}
