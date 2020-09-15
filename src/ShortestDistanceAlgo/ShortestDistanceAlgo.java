package ShortestDistanceAlgo;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ShortestDistanceAlgo{
    
//method to print path to destination
        public static List<Node> printPath(Node destination)
        {
                List<Node> path = new ArrayList<>();
                
        //traversal to destination through adjacent nodes
        for(Node node = destination; node!=null; node = node.parent){
            path.add(node);
        }
        
//reversing nodes in array
        Collections.reverse(path);
        return path;
        }

 
        public static void ShortestPathAlgorithm(Node departure, Node destination){
//initialiing a hashset that will include all nodes that have been explored
                Set<Node> explored = new HashSet<>();

                PriorityQueue<Node> queue;
            queue = new PriorityQueue<>(20, (Node i, Node j) -> {
                if(i.f_scores > j.f_scores){
                    return 1;
                }
                
                else if (i.f_scores < j.f_scores){
                    return -1;
                }
                
                else{
                    return 0;
                }
                }
                );

                //cost from start
                departure.g_scores = 0;

                queue.add(departure);

                boolean found = false;

                while((!queue.isEmpty())&&(!found))
                {
                        //the node in having the lowest f_score value
                        Node current = queue.poll();

                        explored.add(current);

                        //goal found
                        if(current.value.equals(destination.value)){
                                found = true;
                        }
                        //check every child of current node
                        for(Edge e : current.adjacencies){
                                Node child = e.Destination;
                                double cost = e.distance;
                                double temp_g_scores = current.g_scores + cost;
                                double temp_f_scores = temp_g_scores + child.h_scores;

                                if((explored.contains(child)) && 
                                        (temp_f_scores >= child.f_scores)){
                                }

                                else if((!queue.contains(child)) || 
                                        (temp_f_scores < child.f_scores)){

                                        child.parent = current;
                                        child.g_scores = temp_g_scores;
                                        child.f_scores = temp_f_scores;

                                        if(queue.contains(child)){
                                                queue.remove(child);
                                        }
                                        queue.add(child);
                                }
                        }

                }

        }
        
}


class Node
{
        public final String value;
        public double g_scores;
        public final double h_scores;
        public double f_scores = 0;
        public Edge[] adjacencies;
        public Node parent;

        public Node(String val, double hVal){
            //name of city and heuristic value is stored
                value = val;
                h_scores = hVal;
        }


        public String toString(){
            //returns name of city
                return value;
        }
}

class Edge
{
        public final double distance;
        public final Node Destination;

        public Edge(Node targetNode, double dInKM){
            //edge to targetNode with distance b/w them in kilometres
                Destination = targetNode;
                distance = dInKM;
        }
}
