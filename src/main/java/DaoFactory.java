
public class DaoFactory {

    private static Ads adsDao;
    private static Authors authorsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Authors getAuthorsDao() {
        if (authorsDao == null) {
            authorsDao = new AuthorMySQLDao();
        }
        return authorsDao;
    }


}
