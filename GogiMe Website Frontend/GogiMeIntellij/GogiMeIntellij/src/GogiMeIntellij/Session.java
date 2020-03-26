package GogiMeIntellij;

public class Session {
    private User activeUser;

    public Session(){
        activeUser = null;
        while(activeUser == null){
            /* TEMPORARY HARD FILL #todo*/
            activeUser = Login.login("testcase1@gmail.com", "thisIsTemperary");
        }
    }
}
