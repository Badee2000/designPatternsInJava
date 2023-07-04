package adapter;

public class Facebook {

    public void writePost(String type, String post) {
        if (type.equals("text")) {
            System.out.println("Posting text to facebook " + post);
        } else if (type.equals("img")) {
            System.out.println("Posting image to facebook " + post);
        } else {
            System.out.println("Posting video to facebook " + post);
        }
    }

}
