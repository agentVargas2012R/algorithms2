package alternating.sums;

/**
 * Several people are standing in a row and need to be divided into two teams.
 * first person goes into team 1, the second goes into team 2,
 * the third goes into team 1 again, the fourth into team 2, and so on.
 *
 * You are given an array of positive integers - the weights of the people.
 * Return an array of two integers, where the first element is the total weight of team 1, and the second element is
 * the total weight of team 2 after the division is complete.
 */
public class AlternatingSums {

    /**
     * For a = [50, 60, 60, 45, 70],
     * the output should be
     *
     * alternatingSums(a) = [180, 105]
     *
     * @param a
     * @return
     */
    public int[] alternatingSums(int[] a) {
        int team1 = 0;
        int team1Counter = 0;

        int team2 = 0;
        int teamCounter2 = 0;

        for(int i =0; i < a.length; i++){
            //team 1
            if(i%2 == 0){
                team1 += a[i];
                team1Counter++;
            } //team 2
            else{
                team2 += a[i];
                teamCounter2++;
            }
        }

        int[] teams = new int[2];
        teams[0] = team1;
        teams[1] = team2;
        return teams;
    }

}
