import java.util.*;
//
//import org.junit.Test;
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
//import org.junit.runner.notification.Failure;
//
//import static org.junit.Assert.*;

public class Solution {

    public static class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Meeting)) {
                return false;
            }
            final Meeting meeting = (Meeting) o;
            return startTime == meeting.startTime && endTime == meeting.endTime;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = result * 31 + startTime;
            result = result * 31 + endTime;
            return result;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", startTime, endTime);
        }
    }

    public static List<Meeting> mergeRanges(List<Meeting> meetings) {
        Object[] arr=new Object[48];
        for(int i=0;i<meetings.size();i++){
            int strt_time=meetings.get(i).startTime;
            for(int j=strt_time;j<meetings.get(i).endTime;j++){
                arr[j]=Boolean.TRUE;
            }
        }
        List<Meeting> final_meetings=new ArrayList<>();
        int counter=0,strt_time=0,end_time=0;
        System.out.println(Arrays.toString(arr));
        for(int k=0;k<arr.length;k++){
            if(arr[k] == Boolean.TRUE && counter == 0){
                counter=1;
                strt_time=k;
            } else if(arr[k]==null && counter == 1){
                counter=0;
                end_time=k;
                Meeting meeting=new Meeting(strt_time,end_time);
                final_meetings.add(meeting);
            }
        }
        return final_meetings;
    }

    public static void main(String[] args){
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(2, 4),new Meeting(7,9));
        final List<Meeting> actual = mergeRanges(meetings);

    }


}