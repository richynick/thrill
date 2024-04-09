public class Movie extends Bookmark{
    private String cast;
    private String directors;
    @Override
    public boolean isKidFriendlyEligible() {
        return false;
    }
}
