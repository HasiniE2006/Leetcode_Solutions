class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            String row = "";
            if (row1.indexOf(word.charAt(0)) != -1)
                row = row1;
            else if (row2.indexOf(word.charAt(0)) != -1)
                row = row2;
            else
                row = row3;

            boolean ok = true;
            for (int j = 1; j < word.length(); j++) {
                if (row.indexOf(word.charAt(j)) == -1) {
                    ok = false;
                    break;
                }
            }
            if (ok)
                list.add(words[i]);
        }
     return list.toArray(new String[0]);
    }
}
