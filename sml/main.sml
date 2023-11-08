fun addElement(set: int list, element: int): int list = 
    set@[element];

fun ehVazio(set:int list):bool =
    null set;

fun uniaoConj(a:int list, []):int list = []  |
    uniaoConj(a: int list, b: int list): int list = 
    (* if not containsElement(a, hd b) *)
      [hd a]@[hd b]@uniaoConj(tl a, tl b);
    (* else *)
    (* a@uniaoConj(a, tl b) *)

fun  isPresent([]: int list, element:int):bool = false
        |isPresent(a:int list, element:int): bool =
            hd a = element orelse isPresent(tl a, element);
            

fun diffConj([],b: int list):int list = [] |
        diffConj(a: int list, b:int list): int list= 
           if not (isPresent(b,hd a)) then
           [hd a]@ diffConj(tl a, b)
            else diffConj(tl a,b);


fun diffSumConj(a:int list,b: int list) = 
        (diffConj(a,b))@(diffConj(b,a));


diffSumConj([1,2,5,6],[1,2,3,4])
fun intersConj(a: int list, []:int list)= []
        | intersConj(a: int list, b:int list)= 
        if isPresent(a, hd b) then
            [hd b]@intersConj(a, tl b)
        else
            intersConj(a, tl b);
