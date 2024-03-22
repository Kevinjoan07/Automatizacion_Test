package user.post;

import com.intuit.karate.junit5.Karate;
public class PostRunner {

    @Karate.Test
    Karate userPost(){
        return Karate.run("new-user").relativeTo(getClass());
    }
}
