package user.delete;


import com.intuit.karate.junit5.Karate;
public class DeleteRunner {

    @Karate.Test
    Karate userDelete(){
        return Karate.run("delete-user").relativeTo(getClass());
    }
}
