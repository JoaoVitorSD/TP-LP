ehVazio([]).

% uniaoConj([HeadX|TailX], Y,Z):- ehElemConj(HeadX, Y), !, uniaoConj(TailX, Y, Z).
% uniaoConj([HeadX|TailX], Y,[HeadX| TailZ]):- uniaoConj(TailX, Y, TailZ).


% uniaoConj(A,B): retorna A ∪ B.

uniaoConj([],X,X).
uniaoConj([Head|Tail],Y,[Head|Z]) :- remConj(Y,Head,UpdatedY),uniaoConj(UpdatedY,Tail,Z),!.

% intersConj(A, B): retorna A ∩ B.

intersConj([],_,[]).
intersConj([HeadX|TailX],Y,[HeadX|Z]) :- ehElemConj(Y,HeadX),!,remConj(Y,HeadX,UpdatedY), intersConj(UpdatedY,TailX,Z),!.
intersConj([_|TailX],Y,Z) :- intersConj(TailX,Y,Z),!.


% diffConj(A, B): retorna A \ B.

diffConj([], _,[]).
diffConj([Head| Tail], Y, [Head|Z]) :-  not(ehElemConj(Y,Head)), diffConj(Tail, Y, Z),!.
diffConj([_ | Tail], Y, Z) :-  diffConj(Tail, Y, Z).

% diffSimConj(A,B): retorna A ⊕ B.

diffSimConj(A,B,C):- diffConj(A,B,DiffA), diffConj(B,A,DiffB), uniaoConj(DiffA,DiffB, C).

% addConj(A,x): adiciona o elemento x ao conjunto A.
% Para impedir de um elemento ficar duplicado
addConj([],-1,[]).
addConj([],X,[X]).
addConj([X|Tail],X,[X|A]):-addConj(Tail,-1, A),!.
addConj([Head|Tail],X,[Head|A]):- addConj(Tail,X,A).


% remConj(A,x): remove o elemento x do conjunto A.
remConj([], _, []).
remConj([Element|Tail], Element, Z):- remConj(Tail, Element,Z),!.
remConj([Head|Tail], Element, [Head|Z]):- remConj(Tail, Element, Z),!.


% tamConj(A): retorna o tamanho do conjunto A

tamConj([],0).
tamConj([_|Tail], Tam):- tamConj(Tail,TamLen), Tam is TamLen + 1. 

% ehElemConj(A,x): retorna verdadeiro se o conjunto A contém o elemento x.
ehElemConj([X|_], X).
ehElemConj([_|Tail],X):- ehElemConj(Tail,X). 