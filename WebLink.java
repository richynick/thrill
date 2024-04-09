public class WebLink extends Bookmark implements Shearable{
    @Override
    public boolean isKidFriendlyEligible() {
        return false;
    }

    @Override
    public String getItemDate() {
        return null;
    }
}
