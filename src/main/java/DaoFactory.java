public class DaoFactory {
    private static Ads adsDao;
    private static Students studentsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Students getStudentsDao(){
        if(studentsDao == null){
            studentsDao = new ListStudentsDao();
        }
        return studentsDao;
    }

}
