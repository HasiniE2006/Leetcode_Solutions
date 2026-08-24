import java.util.*;
class Solution {
    public String reformatDate(String date) {
        String[] p = date.split(" ");
        String day = p[0].replaceAll("[a-zA-Z]", "");
        if (day.length() == 1) day = "0" + day;
        Map<String, String> month = new HashMap<>();
        month.put("Jan", "01");
        month.put("Feb", "02");
        month.put("Mar", "03");
        month.put("Apr", "04");
        month.put("May", "05");
        month.put("Jun", "06");
        month.put("Jul", "07");
        month.put("Aug", "08");
        month.put("Sep", "09");
        month.put("Oct", "10");
        month.put("Nov", "11");
        month.put("Dec", "12");
        return p[2] + "-" + month.get(p[1]) + "-" + day;
    }
}
