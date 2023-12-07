fun ehVazio(set:int list):bool =
    null set;

fun ehElemenConj([], element: int) = false |
        ehElemenConj(a:int list, element: int) = 
            hd a = element orelse ehElemenConj(tl a,element);

fun diffConj([],b: int list):int list = [] |
        diffConj(a: int list, b:int list): int list= 
           if not (ehElemenConj(b,(hd a))) then
           [hd a]@ diffConj(tl a, b)
            else diffConj(tl a,b);

fun remConj(a:int list, b:int)= diffConj(a,[b]);


fun uniaoConj(a:int list, []):int list = a  |
    uniaoConj([], b:int list):int list = b  |
    uniaoConj(a: int list, b: int list): int list = 
let       
      val newa = remConj(tl a, hd b)
      val newb = remConj(tl b, hd a)
in
       if hd a = hd b then
       [hd a]@uniaoConj(newa, newb)
       else [hd a]@[hd b]@uniaoConj(newa, newb)
end;

fun diffSimConj(a:int list,b: int list) = 
        (diffConj(a,b))@(diffConj(b,a));


fun addConj(a:int list, b: int) = a@[b];

fun tamConj([]) = 0 |
        tamConj(a:int list) = 
            1+tamConj(tl a);

fun intersConj(a: int list, []:int list)= []
        | intersConj(a: int list, b:int list)= 
        if ehElemenConj(a, hd b) then
            [hd b]@intersConj(a, tl b)
        else
            intersConj(a, tl b);