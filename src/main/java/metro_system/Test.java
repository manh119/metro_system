package metro_system;

import java.util.*;

public class Test {
    List<Pair> stationRoutePairs;
    
    Test (List<Pair> stationRoutePairs) {
        this.stationRoutePairs =  stationRoutePairs;
    }         
    
    public static Map<String, List<String>> make_Route_Stations (List<Pair> stationRoutePairs) {
        Map<String, List<String>> graph = new HashMap<>();
        for (Pair pair : stationRoutePairs) {
            graph.computeIfAbsent(pair.route, k -> new ArrayList<>()).add(pair.station);
        }
        return graph;
    }
    
    public static Map<String, List<String>> make_Station_Routes (List<Pair> stationRoutePairs) {
        Map<String, List<String>> graph = new HashMap<>();
        for (Pair pair : stationRoutePairs) {
            graph.computeIfAbsent(pair.station, k -> new ArrayList<>()).add(pair.route);
        }
        return graph;
    }

    // format path : station, route, station next, route next, station next
    public static List<String> findPath(List<Pair> stationRoutePairs, String startStation, String endStation) {
        
        // get key has startStation and key has endStation
        Map<String, List<String>> mapStation_Routes = make_Station_Routes(stationRoutePairs);
        List<String> routeStarts = mapStation_Routes.get(startStation);
        List<String> routeEnds = mapStation_Routes.get(endStation);
        
        // get list Station in route
        // asssume : routeStarts and routeEnds has one element
        Map<String, List<String>> mapRoute_Stations = make_Route_Stations(stationRoutePairs);
        List<String> ListStationStart = mapRoute_Stations.get(routeStarts.get(0));
        List<String> ListStationEnd = mapRoute_Stations.get(routeEnds.get(0));
        
        // get common station have in 2 list key
        // assume : common station have one element
        List<String> commonElements = findCommonElements(ListStationStart, ListStationEnd);
        
        // return list <string> start - common station - end 
        List<String> path = new ArrayList<String>();
        path.add(startStation);
        path.add(routeStarts.get(0));
        path.add(commonElements.get(0));
        path.add(routeEnds.get(0));
        path.add(endStation);
        
        return path;
    }

    
    public static List<String> findCommonElements(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
    
    public static void main(String[] args) {
        List<Pair> stationRoutePairs = new ArrayList<>();
        stationRoutePairs.add(new Pair("LangSon", "Red"));
        stationRoutePairs.add(new Pair("HaNoi", "Red"));
        stationRoutePairs.add(new Pair("HCM", "Red"));
        stationRoutePairs.add(new Pair("HaNoi", "Blue"));
        stationRoutePairs.add(new Pair("DaNang", "Blue"));
        stationRoutePairs.add(new Pair("NgheAn", "Blue"));

        String startStation = "LangSon";
        String endStation = "DaNang"; 
        
        List<String> path = findPath(stationRoutePairs, startStation, endStation);

        System.out.println("path : " + path);
    }

    static class Pair {
        String station;
        String route;

        Pair(String station, String route) {
            this.station = station;
            this.route = route;
        }
    }
}
