import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Set {

    private List<String> elements;

    private Set() {
        this.elements = new ArrayList<>();
    }

    private Set(List<String> elements){
        this.elements = elements;
    }
    private void addElement(String element) {
        this.elements.add(element);
    }
    public static Set readSetEntry(){
        Scanner sc = new Scanner(System.in);

        Set set = new Set();
        int size = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< size; i++){
            set.addElement(sc.nextLine());
        }
        sc.close();
        return set;
    }
    @Override
    public String toString() {
        return elements.toString();
    }
    public static boolean ehVazio(Set a){
        return a.elements.isEmpty();
    }

    public static Set uniaoConj(Set a, Set b){
        List<String> union = new ArrayList<>(a.elements);
        union.addAll(b.elements);
        return  new Set(union);
    }

    public static Set insersConj(Set a, Set b){
        List<String> inters = new ArrayList<>(a.elements);
        inters.retainAll(b.elements);
        return new Set(inters);
    }

    public static Set diffConj(Set a, Set b){
        List<String> diff = new ArrayList<>(a.elements);
        diff.removeAll(b.elements);
        return new Set(diff);
    }

    public static Set diffSimConj(Set a, Set b){
        List<String> diffSim = new ArrayList<>(a.elements);
        diffSim.removeAll(b.elements);
        List<String> diffSim2 = new ArrayList<>(b.elements);
        diffSim2.removeAll(a.elements);
        diffSim.addAll(diffSim2);
        return new Set(diffSim);
    }

    public static void addConj(Set a, String x){
        a.elements.add(x);
    }

    public static void remConj(Set a, String x){
        a.elements.remove(x);
    }

    public static Integer tamConj(Set a){
        return a.elements.size();
    }

    public static boolean ehElemConj(Set a, String x){
        return a.elements.contains(x);
    }
}
