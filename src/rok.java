public class rok {
    public static void main(String[] args) {
        int year = -20000;
        String era;

        if(year < 0){
            era ="BC";
        } else {
            era = "AD";
        }

        era = year < 0 ? "BC" : "AD";


    }
}
