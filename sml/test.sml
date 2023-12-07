use "main.sml";
(* Teste ehVazio *)
if ehVazio([1])<> false
    then print("Teste ehVazio deu erro\n")
    else ();
(* Teste ehElemenConj  *)
if ehElemenConj([1,2,3],1)<>true
    then print("Teste ehElemenConj deu erro\n")
    else ();

if ehElemenConj([1,2,3],4)<>false
    then print("Teste ehElemenConj deu erro\n")
    else ();

(* Teste ehElemenConj  *)
if ehElemenConj([1,2,3],1)<>true
    then print("Teste ehElemenConj deu erro\n")
    else ();

if ehElemenConj([1,2,3],4)<>false
    then print("Teste ehElemenConj deu erro\n")
    else ();


(* Teste diffConj  *)
if diffConj([1,2,3],[1,2])<>[3]
    then print("Teste diffConj deu erro\n")
    else ();

if diffConj([1,2,3],[1,2,3])<>[]
    then print("Teste diffConj deu erro\n")
    else ();

(* Teste remConj *)

if remConj([1,2,3],1)<>[2,3]
    then print("Teste remConj deu erro\n")
    else ();
if remConj([1,2,3],4)<>[1,2,3]
    then print("Teste remConj deu erro\n")
    else ();


(* Teste uniaoConj *)
if uniaoConj([1,2,3],[1,2])<>[1,2,3]
    then print("Teste uniaoConj deu erro\n")
    else ();

if uniaoConj([1,2,3],[4,5])<>[1,4,2,5,3]
    then print("Teste uniaoConj deu erro\n")
    else ();

(* Teste diffSimConj *)

if diffSimConj([1,2,3],[1,2])<>[3]
    then print("Teste diffSimConj deu erro\n")
    else ();

if diffSimConj([1,2,3],[1,2,3])<>[]
    then print("Teste diffSimConj deu erro\n")
    else ();

if diffSimConj([1,2,3],[4,5])<>[1,2,3,4,5]
    then print("Teste diffSimConj deu erro\n")
    else ();

(* Teste addConj *)

if addConj([1,2,3],4)<>[1,2,3,4]
    then print("Teste addConj deu erro\n")
    else ();

if addConj([1,2,3],5)<>[1,2,3,5]
    then print("Teste addConj deu erro\n")
    else ();
(* Teste tamConj  *)
if tamConj([1,2])<>2
    then print("Teste tamConj deu erro\n")
    else ();

if tamConj([1,2,3])<>3
    then print("Teste tamConj deu erro\n")
    else ();


(* Teste intersConj *)

if intersConj([1,2,3],[1,2])<>[1,2]
    then print("Teste intersConj deu erro\n")
    else ();

if intersConj([1,2,3],[4,5])<>[]
    then print("Teste intersConj deu erro\n")
    else ();