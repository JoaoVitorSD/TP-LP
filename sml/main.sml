fun addElement(set: int list, element: int) = 
    element::set

fun ehVazio(set:int list) =
    null set

fun uniaoConj(a:int list, []) = []  |
    uniaoConj(a: int list, b: int list) = 
    if not containsElement(a, hd b)
        a@b@uniaoConj(a, tl b)
    a@uniaoConj(a, tl b)

fun diffConj(a: int list, b:int list)= 
let fun remove([], part, element) = [] remove(a:int list, part: int list,element: element)= 
    if not exists
       part @hd a@ remove(tl a, part, element)
    else
       part @ remove(tl a,part, element)

in 
    diffConj(remove(a,[], hd b))
end;