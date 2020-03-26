package GogiMeIntellij;

import java.util.ArrayList;

public class Login {


    /* TEMPORARY FIELD */
    private static ArrayList<User> tempUserList;

    /* TEMPORARY FILLING METHOD */
    public void testSetup(){
        tempUserList = new ArrayList<User>();
        SportsEnthusiast tempUser1 = new SportsEnthusiast("Test", "User1", "thisIsTemperary", Gender.MALE, "testcase1@gmail.com");
        SportsEnthusiast tempUser2 = new SportsEnthusiast("Test", "User2", "temporaryFight", Gender.FEMALE, "testcase2@gmail.com");
        EmergencyService tempUser3 = new EmergencyService("Test", "User2", "temporaryPlight", Gender.MALE, "testcase3@gmail.com", "YoungstownFD");
        tempUserList.add(tempUser1);
        tempUserList.add(tempUser2);
        tempUserList.add(tempUser3);
    }



    public Login(){
        testSetup();
    }

    /**
     * The main loginSequence
     * @return
     */
    public static User login(String email, String password){
        // #todo how are we doing input here?
        // #todo how do we access a database for verification and finding the user? How do we implement social media loggin?
        boolean successfulLogin = false;

        /* TEMPORARY CODE, REPLACE tempUserList WITH DB CALL #todo*/
        for(User user : tempUserList){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                user.logIn();
                return user;
            }
        }
        return null;
    }

    public static void signUp(){
        String firstname;
        String lastName;
        String password;
        Gender gender;
        // #todo where do we put newly created user?
    }

    public static void forgotPassword(){
        //#todo
    }

    public static void forgotUserName(){
        //#todo
    }
}
