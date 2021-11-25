package big_tasks_from_Saim.social_media;

import day20_strings.AccountNumber;

public abstract class SocialMedia {
    /*
    Social Media

• Create an abstract class for Social Media that has the following features:

 - Direct messaging(String username, String message)
 - Post(String body)
 - Notifications()

• The Social Media will also have the following fields:

 - Personal URl (String)
 - Account length (int)
 - Platform (static String)
     */
    public abstract void directMessaging(String username, String message);
    public abstract void post(String body);
    public abstract void notifications();

    String personalURL;
    int accountLength;
    static String Platform;
}
