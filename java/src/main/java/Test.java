import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // Test ehVazio

        Set set = getBasicSet();
        compareOutputs(false, set.ehVazio());

        set = new Set(List.of());
        compareOutputs(true, set.ehVazio());


        // Test unionConj
        set = getBasicSet();

        set = set.uniaoConj(new Set(Arrays.asList("1", "5", "3")));

        compareOutputs(Arrays.asList("1", "2", "3", "5"), set.getElements());

        set = getBasicSet();

        set = set.uniaoConj(getBasicSet());
        compareOutputs(getBasicSet().getElements(), set.getElements());

        set = set.uniaoConj(new Set(List.of()));
        compareOutputs(getBasicSet().getElements(), set.getElements());

        // Test insertConj

        set = getBasicSet();
        set = set.intersConj(new Set(Arrays.asList("1", "5", "3")));
        compareOutputs(Arrays.asList("1", "3"), set.getElements());

        set = getBasicSet();
        set = set.intersConj(getBasicSet());
        compareOutputs(getBasicSet().getElements(), set.getElements());

        set = getBasicSet();
        set = set.intersConj(new Set(List.of()));
        compareOutputs(List.of(), set.getElements());

        set = getBasicSet();
        set = set.intersConj(new Set(Arrays.asList("4", "5", "6")));
        compareOutputs(List.of(), set.getElements());


        // Test diffConj
        set = getBasicSet();
        set = set.diffConj(new Set(Arrays.asList("1", "5", "3")));
        compareOutputs(List.of("2"), set.getElements());

        set = getBasicSet();
        set = set.diffConj(getBasicSet());
        compareOutputs(List.of(), set.getElements());

        set = getBasicSet();
        set = set.diffConj(new Set(List.of()));
        compareOutputs(getBasicSet().getElements(), set.getElements());


        // Test diffSimConj

        set = getBasicSet();
        set = set.diffSimConj(new Set(Arrays.asList("1", "5", "3")));
        compareOutputs(Arrays.asList("2", "5"), set.getElements());

        set = getBasicSet();
        set = set.diffSimConj(getBasicSet());

        compareOutputs(List.of(), set.getElements());

        set = getBasicSet();
        set = set.diffSimConj(new Set(List.of()));
        compareOutputs(getBasicSet().getElements(), set.getElements());

        // Test addConj

        set = getBasicSet();
        set.addConj("4");
        compareOutputs(Arrays.asList("1", "2", "3", "4"), set.getElements());

        set = getBasicSet();
        set.addConj("1");
        compareOutputs(Arrays.asList("1", "2", "3"), set.getElements());

        set = getBasicSet();
        set.addConj("5");
        compareOutputs(Arrays.asList("1", "2", "3", "5"), set.getElements());


        // Test remConj
        set = getBasicSet();
        set.remConj("1");

        compareOutputs(Arrays.asList("2", "3"), set.getElements());

        set = getBasicSet();
        set.remConj("2");
        compareOutputs(Arrays.asList("1", "3"), set.getElements());

        set = getBasicSet();
        set.remConj("5");
        compareOutputs(Arrays.asList("1", "2", "3"), set.getElements());


        // Test tamConj

        set = getBasicSet();
        compareOutputs(3, set.tamConj());

        set = new Set(List.of());
        compareOutputs(0, set.tamConj());

        set = new Set(Arrays.asList("1", "2", "3", "4", "5"));
        compareOutputs(5, set.tamConj());

        // Test ehElemConj

        set = getBasicSet();
        compareOutputs(true, set.ehElemConj("1"));
        compareOutputs(true, set.ehElemConj("2"));
        compareOutputs(true, set.ehElemConj("3"));
        compareOutputs(false, set.ehElemConj("4"));

        set = new Set(List.of());
        compareOutputs(false, set.ehElemConj("1"));

        set = new Set(Arrays.asList("1", "2", "3", "4", "5"));
        compareOutputs(true, set.ehElemConj("1"));
        compareOutputs(true, set.ehElemConj("2"));
        compareOutputs(true, set.ehElemConj("3"));
        compareOutputs(true, set.ehElemConj("4"));
        compareOutputs(true, set.ehElemConj("5"));


        // Joining tests

        set = getBasicSet();
        set = set.uniaoConj(new Set(Arrays.asList("1", "5", "3")));

        compareOutputs(true, set.ehElemConj("5"));

        set = getBasicSet();
        set = set.intersConj(new Set(Arrays.asList("1", "5", "3")));

        compareOutputs(true, set.ehElemConj("1"));
        compareOutputs(false, set.ehElemConj("5"));

        System.out.println("All tests passed!");
    }

    private static Set getBasicSet(){
        return new Set(Arrays.asList("1", "2", "3"));
    }
    private static void compareOutputs(List<String> expected, List<String> actual){
        if(!expected.equals(actual))
            throw new RuntimeException(String.format("Expected: %s, Actual: %s", expected, actual));
    }

    private static void compareOutputs(Integer expected, Integer actual){
        if(!expected.equals(actual))
            throw new RuntimeException(String.format("Expected: %s, Actual: %s", expected, actual));
    }
    private static void compareOutputs(boolean expected, boolean actual){
        if(expected != actual)
            throw new RuntimeException(String.format("Expected: %s, Actual: %s", expected, actual));
    }
}
