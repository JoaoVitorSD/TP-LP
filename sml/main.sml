fun addElement(set: int list, element: int): int list = 
    set@[element];

fun ehVazio(set:int list):bool =
    null set;

fun uniaoConj(a:int list, []):int list = []  |
    uniaoConj(a: int list, b: int list): int list = 
      [hd a]@[hd b]@uniaoConj(tl a, tl b);

fun  isPresent([]: int list, element:int):bool = false
        |isPresent(a:int list, element:int): bool =
            hd a = element orelse isPresent(tl a, element);
            

fun diffConj([],b: int list):int list = [] |
        diffConj(a: int list, b:int list): int list= 
           if not (isPresent(b,hd a)) then
           [hd a]@ diffConj(tl a, b)
            else diffConj(tl a,b);


fun diffSimConj(a:int list,b: int list) = 
        (diffConj(a,b))@(diffConj(b,a));


fun addConj(a:int list, b: int) = a@[b];
fun remConj(a:int list, b:int)= diffConj(a,[b]);

fun tamConj([]) = 0 |
        tamConj(a:int list) = 
            1+tamConj(tl a);

fun ehElemenConj([], element: int) = false |
        ehElemenConj(a:int list, element: int) = 
            hd a = element orelse ehElemenConj(tl a,element);

fun intersConj(a: int list, []:int list)= []
        | intersConj(a: int list, b:int list)= 
        if isPresent(a, hd b) then
            [hd b]@intersConj(a, tl b)
        else
            intersConj(a, tl b);
