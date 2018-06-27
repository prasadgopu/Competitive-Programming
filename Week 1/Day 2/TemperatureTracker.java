import java.util.HashMap;

public class TemperatureTracker {
    static class TempTracker {

        // fill in the TempTracker class methods below
        int min=0;
        int max=0;
        int count=0;
        int mode=0;
        int total=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        // records a new temperature
        public void insert(int temperature) {
            this.count=this.count+1;
            this.total=this.total+temperature;
            if(map.size()==0){
                this.min=temperature;
                this.max=temperature;
                this.mode=temperature;
                map.put(temperature,1);
            } else if(map.containsKey(temperature)){
                map.put(temperature, map.get(temperature) + 1);
                if(map.get(temperature)>map.get(this.mode)){
                    this.mode=temperature;
                }
            } else {
                if(this.min>temperature){
                    this.min=temperature;
                }
                if(this.max<temperature){
                    this.max=temperature;
                }
                map.put(temperature,1);
            }
        }

        // returns the highest temp we've seen so far
        public int getMax() {
            return this.max;
        }

        // returns the lowest temp we've seen so far
        public int getMin() {
            return this.min;
        }

        // returns the mean of all temps we've seen so far
        public double getMean() {
            return this.total/this.count;
        }

        // return a mode of all temps we've seen so far
        public int getMode() {
            return this.mode;
        }
    }
}