package xyz.wongs.es.core.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FindDates
{

    public static void main(String[] args) throws Exception
    {

        /*Calendar cal = Calendar.getInstance();
        String start = "2012-02-01";
        String end = "2012-03-02";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dBegin = sdf.parse(start);
        Date dEnd = sdf.parse(end);
        List<Date> lDate = findDates(dBegin, dEnd);
        List<String> datesStr = new ArrayList<String>();
        for (int i=0; i<lDate.size();i++){
            String dateStr = sdf.format(lDate.get(i)).toString();
            datesStr.add(dateStr);
        }
        for (String date : datesStr)
        {
            System.out.println(date);
        }*/
//        Date date = strToDate("20121212");
//        System.out.println(date);
        Set<String> datesStr = new HashSet<String>();
        datesStr.add("1");
        datesStr.add("1");
        for (String date : datesStr)
        {
            System.out.println(date);
        }
    }

    public static List<Date> findDates(Date dBegin, Date dEnd)
    {
        List lDate = new ArrayList();
        lDate.add(dBegin);
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime()))
        {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            lDate.add(calBegin.getTime());
        }
        return lDate;
    }
    public static Date strToDate(String str) {
        SimpleDateFormat sdf = null;
        if (str.length() == 8){
            String year = str.substring(0,4);
            String month = str.substring(4,6);
            String day = str.substring(6,8);
            str = year +"-" +month + "-" + day;
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else if (str.length() == 6){
            String year = str.substring(0,4);
            String month = str.substring(4,6);
            str = year +"-" +month;
            sdf = new SimpleDateFormat("yyyy-MM");
        }
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}