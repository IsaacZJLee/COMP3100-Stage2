import java.io.*;
import java.net.*;

public class Client {
//Declaring variables
//Assigning localhost
public static String hostName = "localhost";

//Assigning server port number
public static int serverPort = 50000;

//Assigning username
public static String userName = "user.name";

//Start initialisation with HELO
public static String HELO = "HELO";

//Authentication username on the system
public static String AUTHusername = "AUTH" + " " + System.getProperty(userName);

//The Client is ready to read
public static String REDY = "REDY";

//Job Submission information
public static String JOBN = "JOBN";

//Scheduling decision
public static String SCHD = "SCHD";

//Job completion
public static String JCPL = "JCPL";

public static String OK = "OK";
public static String JOBP = "JOBP";
public static String QUIT = "QUIT";

}

public static void main(String[] args) {
    
}