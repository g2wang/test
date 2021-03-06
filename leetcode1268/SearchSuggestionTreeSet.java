/**
1268. Search Suggestions System
Medium

Given an array of strings products and a string searchWord. We want to design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with the searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return list of lists of the suggested products after each character of searchWord is typed. 

Example 1:

Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [
["mobile","moneypot","monitor"],
["mobile","moneypot","monitor"],
["mouse","mousepad"],
["mouse","mousepad"],
["mouse","mousepad"]
]
Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
After typing mou, mous and mouse the system suggests ["mouse","mousepad"]

Example 2:

Input: products = ["havana"], searchWord = "havana"
Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
Example 3:

Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]
Example 4:

Input: products = ["havana"], searchWord = "tatiana"
Output: [[],[],[],[],[],[],[]]
 
Constraints:

1 <= products.length <= 1000
There are no repeated elements in products.
1 <= Σ products[i].length <= 2 * 10^4
All characters of products[i] are lower-case English letters.
1 <= searchWord.length <= 1000
All characters of searchWord are lower-case English letters. 
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;

public class SearchSuggestionTreeSet {

    public static void main(String[] args) {
        String[] products = new String[]{
            "mobile","mouse","moneypot","monitor","mousepad"
        };
        String searchWord = "mouse";
        // String[] products = new String[]{"havana"};
        // String searchWord = "tatiana";
        SearchSuggestionTreeSet ss = new SearchSuggestionTreeSet();
        List<List<String>> ans = ss.suggestedProducts(products, searchWord);
        System.out.println("[");
        for (int i = 0; i < ans.size(); i++) {
            List<String> l = ans.get(i);
            System.out.printf("%s%s\n", Arrays.toString(l.toArray(new String[]{})),
                    i == ans.size()-1?"":","); 
        }
        System.out.println("]");
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>(searchWord.length());
        if (searchWord == null || searchWord.length() == 0) return ans;
        TreeSet<String> treeSet = new TreeSet<>();
        for (String product : products) {
            treeSet.add(product);
        }
        char[] ca = searchWord.toCharArray();
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < ca.length; i++) {
            key.append(ca[i]);
            NavigableSet<String> tailSet = treeSet.tailSet(key.toString(), true);
            Iterator<String> itr = tailSet.iterator();
            int count = 0;
            List<String> top3 = new ArrayList<>(3);
            while (itr.hasNext() && count++ < 3) {
                top3.add(itr.next());    
            }
            ans.add(top3);
        }
        return ans;
    }

}
