import adapter.Facebook;
import adapter.FacebookAdaper;
import adapter.Instagram;
import adapter.InstagramAdapter;
import adapter.SocialMedia;

public class Adapter {
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        SocialMedia post = new FacebookAdaper(fb);
        post.postImage("img");
        post.postVideo("VID");
        Instagram insta = new Instagram();
        SocialMedia post2 = new InstagramAdapter(insta);
        post2.postImage("Image");

    }
}
