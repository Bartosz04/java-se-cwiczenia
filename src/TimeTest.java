public class TimeTest {
    public static void main(String[] args) {

        double myPoint = 98.123;
        double myTimeHour = 10;
        double myTimeMinutes = 25;
        Hemisphere myHemisphere = Hemisphere.EAST;

        double destPoint = 123.123;
        Hemisphere destHemisphere = Hemisphere.WEST;

        final int minutesPerDeg = 4;   // przypisanie final do zmiennej sprawia, ze juz nie mozna zmienic pozniej wartosci

        // Dest Point: 15:40

        Double minuteDiff = 0.0;

        if(myHemisphere != destHemisphere){
            destPoint *= -1;
        }

        if (myPoint > destPoint){
            minuteDiff = (myPoint - destPoint) * 4;
        } else {
            minuteDiff = (destPoint - myPoint) * 4;
        }

        double myMinutes = myTimeHour * 60 + myTimeMinutes;
        double destMinutes = myMinutes + minuteDiff;

        int destTimeHour = (int) destMinutes / 60;
        int destTimeMinutes = (int) destMinutes % 60;

        System.out.println(destTimeHour);
        System.out.println(destTimeMinutes);

        System.out.println("Czas "+destTimeHour+":"+destTimeMinutes);

    }
    enum Hemisphere{
        WEST, EAST
    }
}
