package adapter;

public class FacebookAdaper implements SocialMedia {

    private Facebook fb;

    public FacebookAdaper(Facebook fb) {
        this.fb = fb;
    }

    public void postImage(String img) {
        fb.writePost("img", img);
    }

    public void postText(String text) {
        fb.writePost("text", text);
    }

    public void postVideo(String vid) {
        fb.writePost("video", vid);
    }

}
