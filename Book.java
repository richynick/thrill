public class Book extends Bookmark {

    private String authors;
    @Override
    public boolean isKidFriendlyEligible() {
        return false;
    }
}
