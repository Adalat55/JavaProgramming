package big_tasks_from_Saim.Entertainment;

import java.util.ArrayList;

public class Youtube extends Streaming {
    /*
    create a class Youtube
  -> Youtube is a child of Streaming

  instance variables:
   - video name (String)
   - channel name (String)
   - view count (int)
   - comments (ArrayList of Strings)

  constructor:
   - initialize name, company, duration, video name, channel name, view
count, and comments
   -> call super constructor
     */

    String videoName;
    String channelName;
    int viewCount;
    ArrayList<String> comments;

    public Youtube(String company, double duration, String videoName, String channelName, int viewCount, ArrayList<String> comments) {
        super("Streming",company, duration);
        this.videoName = videoName;
        this.channelName = channelName;
        this.viewCount = viewCount;
        this.comments = comments;
    }
}
