package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class RecomendBus {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input1 = br.readLine();
//        String input2 = br.readLine();
//        String[] input2Arr = input2.split(" ");
//
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//
//        Date date0 = sdf.parse(input1);
//        Date date1 = sdf.parse(input2Arr[0]);
//        Date date2 = sdf.parse(input2Arr[1]);
//        Date date3 = sdf.parse(input2Arr[2]);
//        Date date4 = sdf.parse(input2Arr[3]);
//        Date date5 = sdf.parse(input2Arr[4]);
//
//        if(date1.getTime() - date0.getTime() < 0){
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(date1);
//            cal.add(Calendar.DATE, 1);
//            date1 = cal.getTime();
//        }
//        if(date2.getTime() - date0.getTime() < 0){
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(date2);
//            cal.add(Calendar.DATE, 1);
//            date2 = cal.getTime();
//        }
//        if(date3.getTime() - date0.getTime() < 0){
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(date3);
//            cal.add(Calendar.DATE, 1);
//            date3 = cal.getTime();
//        }
//        if(date4.getTime() - date0.getTime() < 0){
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(date4);
//            cal.add(Calendar.DATE, 1);
//            date4 = cal.getTime();
//        }
//        if(date5.getTime() - date0.getTime() < 0){
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(date5);
//            cal.add(Calendar.DATE, 1);
//            date5 = cal.getTime();
//        }
//
//        long[] interval = new long[5];
//        interval[0] = (date1.getTime() - date0.getTime())/(1000*60);
//        interval[1] = (date2.getTime() - date0.getTime())/(1000*60);
//        interval[2] = (date3.getTime() - date0.getTime())/(1000*60);
//        interval[3] = (date4.getTime() - date0.getTime())/(1000*60);
//        interval[4] = (date5.getTime() - date0.getTime())/(1000*60);
//
//        System.out.println(Arrays.stream(interval).min().getAsLong());
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();
        String[] input2Arr = input2.split(" ");

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        Date date0 = sdf.parse(input1);
        ArrayList<Date> dateArrayList = new ArrayList<>();
        for (int i = 0 ; i < input2Arr.length; i++) {
            dateArrayList.add(sdf.parse(input2Arr[i]));
        }

        for (int i = 0; i < input2Arr.length; i++){
            if(dateArrayList.get(i).getTime() - date0.getTime() < 0) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(dateArrayList.get(i));
                cal.add(Calendar.DATE, 1);
                dateArrayList.set(i, cal.getTime());
            }
        }

        long[] interval = new long[5];
        for (int i = 0; i < input2Arr.length; i++) {
            interval[i] = (dateArrayList.get(i).getTime() - date0.getTime()) / (1000 * 60);
        }

        System.out.println(Arrays.stream(interval).min().getAsLong());

    }
}
