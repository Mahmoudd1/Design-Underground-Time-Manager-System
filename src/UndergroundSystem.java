import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class UndergroundSystem {
    HashMap<Integer,Integer> usersMap;
    HashMap<String, List<Integer>>stationsMap;
    HashMap<Integer,String>userStation;
    public UndergroundSystem() {
    usersMap=new HashMap<>();
    stationsMap=new HashMap<>();
    userStation=new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {

        usersMap.put(id,t);
        userStation.put(id,stationName);

    }

    public void checkOut(int id, String stationName, int t) {
        String name1=userStation.get(id);
        if(!stationsMap.containsKey(name1+" "+stationName))
        {
            stationsMap.put(name1+" "+stationName,new ArrayList<>());
        }
        stationsMap.get(name1+" "+stationName).add(t-usersMap.get(id));

    }

    public double getAverageTime(String startStation, String endStation) {
        double result =0;
        for (int temp:stationsMap.get(startStation+" "+endStation))
        {
            result+=temp;
        }
        return result/stationsMap.get(startStation+" "+endStation).size();
    }
}