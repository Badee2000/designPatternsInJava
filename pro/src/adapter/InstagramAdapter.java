package adapter;

public class InstagramAdapter implements SocialMedia {

    private Instagram insta;

    public InstagramAdapter(Instagram insta) {
        this.insta = insta;
    }

    @Override
    public void postImage(String img) {
        insta.addImage(img);
    }

    @Override
    public void postText(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postText'");
    }

    @Override
    public void postVideo(String vid) {
        insta.addVideo(vid);
    }

}
