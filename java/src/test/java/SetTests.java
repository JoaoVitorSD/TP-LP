import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SetTests {
    @Test
    public void WhenReadingEntrySet_With3ElementsEntry_ShouldReturn3ElementsSet(){
        String input = "3\n7\n5\n2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));


        Set set = Set.readSetEntry();
        Assert.assertTrue(set.toString().equals("[7, 5, 2]"));
    }


    @Test
    public void  WhenCheckingSetIsEmptyWith0Elements_ShouldReturnTrue(){
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));


        Set set = Set.readSetEntry();
        Assert.assertTrue(Set.ehVazio(set));
    }
    @Test
    public void  WhenCheckingSetIsEmptyWithMoreThan0Elements_ShouldReturnFalse(){
        String input = "1\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));


        Set set = Set.readSetEntry();
        Assert.assertFalse(Set.ehVazio(set));
    }

    @Test
    public void WhenUnionSetWith3Elements_WhenBSetHas3Elements_ShouldReturn6elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input = "3\n4\n5\n6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[1, 2, 3, 4, 5, 6]", Set.uniaoConj(set, set2).toString());
    }

    @Test
    public void WhenUnionSetWith3Elements_WhenBSetHas0Elements_ShouldReturn3elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[1, 2, 3]", Set.uniaoConj(set, set2).toString());
    }

    @Test
    public void WhenIntersectSetWith3Elements_With2EqualElementsShouldReturn2elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input = "3\n1\n5\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[1, 3]", Set.insersConj(set, set2).toString());
    }
    @Test
    public void WhenIntersectSetWith3Elements_With0EqualElementsShouldReturn0elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input = "3\n4\n5\n6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[]", Set.insersConj(set, set2).toString());
    }

    @Test
    public void WhenDiffSetWith3Elements_With1EqualElementsShouldReturn2elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input = "3\n1\n5\n6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[2, 3]", Set.diffConj(set, set2).toString());
    }


    @Test
        public void WhenDiffSetWith3Elements_With0EqualElementsShouldReturn3elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input = "3\n4\n5\n6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[1, 2, 3]", Set.diffConj(set, set2).toString());
    }


    @Test
    public void WhenDiffSetWith3Elements_With3EqualElementsShouldReturn0elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input =  "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[]", Set.diffConj(set, set2).toString());
    }

    @Test
    public void WhenDiffSimSetWith3Elements_With0EqualElementsShouldReturn6elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input =  "3\n4\n5\n6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[1, 2, 3, 4, 5, 6]", Set.diffSimConj(set, set2).toString());
    }

    @Test
    public void WhenDiffSimSetWith3Elements_With3EqualElementsShouldReturn0elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input =  "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[]", Set.diffSimConj(set, set2).toString());
    }

    @Test
    public void WhenDiffSimSetWith3Elements_With2EqualElementsShouldReturn2elements() {
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        input =  "3\n1\n2\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Set set2 = Set.readSetEntry();

        Assert.assertEquals("[3, 4]", Set.diffSimConj(set, set2).toString());
    }

    @Test
    public void WhenAddingElementWith3Elements_ShouldReturn4elements(){
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        Set.addConj(set,"4");
        Assert.assertEquals("[1, 2, 3]",set.toString());
    }


    @Test
    public void WhenRemovingElementWith3Elements_WhenContainingInSet_ShouldReturn2elements(){
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        Set.remConj(set,"3");
        Assert.assertEquals("[1, 2]",set.toString());
    }

    @Test
    public void WhenRemovingElementWith3Elements_WhenNotContainingInSet_ShouldReturn3elements(){
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        Set.remConj(set,"4");
        Assert.assertEquals("[1, 2, 3]",set.toString());
    }

    @Test
    public void WhenCheckingSizeElementWith3Elements_ShouldReturn3elements(){
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        Assert.assertEquals("3",Set.tamConj(set).toString());
    }


    @Test
    public void WhenCheckingSizeElementWith0Elements_ShouldReturn0elements(){
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        Assert.assertEquals("0",Set.tamConj(set).toString());
    }

    @Test
    public void WhenCheckingElementContainedInList_WhenContained_ShouldReturnTrue(){
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        Assert.assertTrue(Set.ehElemConj(set,"3"));
    }

    @Test
    public void WhenCheckingElementContainedInList_WhenNotContained_ShouldReturnFalse(){
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Set set = Set.readSetEntry();
        Assert.assertFalse(Set.ehElemConj(set,"4"));
    }
}
