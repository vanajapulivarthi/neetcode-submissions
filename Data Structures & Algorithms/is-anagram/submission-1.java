class Solution {
    public boolean isAnagram(String s, String t) {

        StringBuffer s1 = new StringBuffer(s);
        StringBuffer s2 = new StringBuffer(t);

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);




        

    }
}
