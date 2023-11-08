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
let fun remove(a:int list, part: int list,element: element)= 
    