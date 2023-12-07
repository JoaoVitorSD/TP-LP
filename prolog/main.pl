ehVazio([]).

% uniaoConj([HeadX|TailX], Y,Z):- ehElemConj(HeadX, Y), !, uniaoConj(TailX, Y, Z).
% uniaoConj([HeadX|TailX], Y,[HeadX| TailZ]):- uniaoConj(TailX, Y, TailZ).


% uniaoConj(A,B): retorna A ∪ B.

uniaoConj([],Z,Z).
uniaoConj([Head|Tail],Y,[Head|Z]) :- ehElemConj(Y,Head),remConj(Head,Y,UpdatedY),uniaoConj(UpdatedY,Tail,Z),!.
uniaoConj([Head|Tail],Y,[Head|Z]) :- uniaoConj(Y,Tail,Z),!.

% intersConj(A, B): retorna A ∩ B.

intersConj([],Z,[]).
intersConj([HeadX|TailX],Y,[HeadX|Z]) :- ehElemConj(Y,HeadX),!,remConj(Head,Y,UpdatedY), intersConj(UpdatedY,TailX,Z),!.
intersConj([Head|TailX],Y,Z) :- intersConj(TailX,TailY,Z),!.


% diffConj(A, B): retorna A \ B.

diffConj([], Y,[]).
diffConj([Head| Tail], Y, [Head|Z]) :-  not(ehElemConj(Y,Head)), diffConj(Tail, Y, Z),!.
diffConj([Head | Tail], Y, Z) :-  diffConj(Tail, Y, Z).

% diffSimConj(A,B): retorna A ⊕ B.

diffSimConj(A,B,C):- diffConj(A,B,DiffA), diffConj(B,A,DiffB), uniaoConj(DiffA,DiffB, C).

% addConj(A,x): adiciona o elemento x ao conjunto A.

addConj(A,X,[X|A]). 

% remConj(A,x): remove o elemento x do conjunto A.
remConj([], Element, []).
remConj([Element|Tail], Element, Z):- remConj(Tail, Element,Z),!.
remConj([Head|Tail], Element, [Head|Z]):- remConj(Tail, Element, Z),!.


% tamConj(A): retorna o tamanho do conjunto A

tamConj([],0).
tamConj([_|Tail], Tam):- tamConj(Tail,TamLen), Tam is TamLen + 1. 

% ehElemConj(A,x): retorna verdadeiro se o conjunto A contém o elemento x.
ehElemConj([X|Tail], X).
ehElemConj([Head|Tail],X):- ehElemConj(Tail,X),!. 