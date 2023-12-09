
import Set 
def tests():
    failed = False
    # Test ehVazio
    if(Set.ehVazio([]) != True):
        print("Test ehVazio Error")
        failed = True
    if(Set.ehVazio([1,2,3]) != False):
        print("Test ehVazio Error")
        failed = True 

    # Test uniaoConj

    if(Set.uniaoConj([1,2,3,5],[1,2,3,4,5,6,7,8,9]) != [1,2,3,5,4,6,7,8,9]):
        print("Test uniaoConj Error")
        failed = True 

    # Test intersConj

    if(Set.intersConj([1,2,3,5],[1,2,3,4,5,6,7,8,9]) != [1,2,3,5]):
        print("Test intersConj Error")
        failed = True 
    if(Set.intersConj([1,2,3],[])!= []):
        print("Test intersConj Error")
        failed = True 

    # Test diffConj

    if(Set.diffConj([1,2,3],[2])!= [1,3]):
        print("Test diffConj Error")
        failed = True 

    # Test diffSimConj

    if(Set.diffSimConj([1,2,3],[2])!= [1,3]):
        print("Test diffSimConj Error")
        failed = True 
    if(Set.diffSimConj([1,2,3],[1,2,3])!= []):
        print("Test diffSimConj Error")
        failed = True 

    # Test addConj

    if(Set.addConj([1,2,3,5],4) != [1,2,3,5,4]):
        print("Test addConj Error")
        failed = True 

    # Test remConj

    if(Set.remConj([1,2,3,5],4) != [1,2,3,5]):
        print("Test remConj Error")
        failed = True 

    # Test tamConj

    if(Set.tamConj([1,2,3,5]) != 4):
        print("Test tamConj Error")
        failed = True 

    # Test ehElemConj

    if(Set.ehElemConj([1,2,3,5],4) != False):
        print("Test ehElemConj Error")
        failed = True 
    if(Set.ehElemConj([1,2,3,5],3) != True):
        print("Test ehElemConj Error")
        failed = True 
    if(failed == False):
        print("All tests passed")
    else:
        print("Some tests failed")

tests();