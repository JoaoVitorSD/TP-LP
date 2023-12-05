import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class  Set {

    private List<String> elements;

    private Set() {
        this.elements = new ArrayList<>();
    }

    public Set(List<String> elements){
        this.elements = new ArrayList<>(elements);
    }

    public List<String> getElements() {
        return elements;
    }


    @Override
    public String toString() {
        return elements.toString();
    }
    public boolean ehVazio(){
        return elements.isEmpty();
    }

    public Set uniaoConj(Set b){
        List<String> union = new ArrayList<>(elements);
        union.addAll(b.elements.stream().filter(x -> !elements.contains(x)).toList());
        return new Set(union);
    }

    public Set intersConj(Set b){
        List<String> inters = new ArrayList<>(elements);
        inters.retainAll(b.elements);
        return new Set(inters);
    }

    public Set diffConj(Set b){
        List<String> diff = new ArrayList<>(elements);
        diff.removeAll(b.elements);
        return new Set(diff);
    }

    public Set diffSimConj(Set b){
        List<String> diffSim = new ArrayList<>(diffConj(b).elements);
        diffSim.addAll(b.diffConj(this).elements);
        return new Set(diffSim);
    }

    public void addConj(String x){
        if(!elements.contains(x))
            elements.add(x);
    }

    public void remConj( String x){
        if(elements.contains(x))
            elements.remove(x);
    }

    public Integer tamConj(){
        return elements.size();
    }

    public boolean ehElemConj(String x){
        return elements.contains(x);
    }
}
