package xyz.wongs.es.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Wang Yiren
 * @Title:
 * @Description: 两个时间点之间获取 日账期 与 月账期
 * @版权 FFCS（C） 2017
 * @date ${date}
 */
public class GetEveryDaysOrMonthsUtil {
    /**
     * @获取两个时间段之间的每天：日账期：20180101
     * @author wangyiren
     * @param minDate
     *            最小时间 20150101
     * @param maxDate
     *            最大时间 20180101
     * @return 日期集合 格式为： 年月日
     * @throws Exception
     */
    public static List<String> getDayBetween(String minDate, String maxDate)
            throws Exception {
        ArrayList<String> result = new ArrayList<String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");// 格式化为年月日

        Date dateOne = sdf.parse(minDate);
        Date dateTwo = sdf.parse(maxDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOne);

        while (calendar.getTime().before(dateTwo)) {
            result.add(sdf.format(calendar.getTime()));
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return result;

    }

    /**
     * @获取两个时间段之间的每个月：月账期：201801
     * @author wangyiren
     * @param minDate
     *            最小时间 201501
     * @param maxDate
     *            最大时间 201510
     * @return 日期集合 格式为: 年月
     * @throws Exception
     */
    public static List<String> getMonthBetween(String minDate, String maxDate)
            throws Exception {
        ArrayList<String> result = new ArrayList<String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");// 格式化为年月

        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();

        min.setTime(sdf.parse(minDate));
        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

        max.setTime(sdf.parse(maxDate));
        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

        Calendar curr = min;
        while (curr.before(max)) {
            result.add(sdf.format(curr.getTime()));
            curr.add(Calendar.MONTH, 1);
        }

        return result;
    }
}
