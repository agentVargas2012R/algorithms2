package are.similar;

import java.util.ArrayList;
import java.util.List;

/**
 * Two arrays are called similar if one can be obtained from another by swapping
 * at most one pair of elements in one of the arrays.
 *
 * Given two arrays a and b, check whether they are similar.
 *
 *
 * For a = [1, 2, 3] and b = [1, 2, 3], the output should be
 *      areSimilar(a, b) = true
 *
 *
 * The arrays are equal, no need to swap any elements.
 *
 * For a = [1, 2, 3] and b = [2, 1, 3], the output should be
 * areSimilar(a, b) = true.
 *
 * We can obtain b from a by swapping 2 and 1 in b
 *
 * For a = [1, 2, 2] and b = [2, 1, 1], the output should be
 * areSimilar(a, b) = false.
 *
 * Any swap of any two elements either in a or in b won't make a and b equal.
 */
public class AreSimilar {

    /**
     * Go through each element and swap and then compare, assume they don't match
     */

    public boolean areSimilar2(int[] a, int[] b){
        List<Integer> diff = new ArrayList<Integer>();
        for(int i = 0; i < a.length; ++i) {
            if(a[i] != b[i]) diff.add(i);
        }
        int diffCount = diff.size();
        if(diffCount == 0) return true;
        if(diffCount == 2) {
            int index1 = diff.get(0);
            int index2 = diff.get(1);
            if(a[index1] == b[index2] && a[index2] == b[index1]) return true;
        }
        return false;
    }

}
