:- consult('tp').


% ehVazio_test():- not(ehVazio([])), not(ehVazio([0])), not(ehVazio([1,1])), (ehVazio([])).
% test_ehVazio(X, Expect)- ehVazio(X).
test_ehVazio_true(X):-ehVazio(X),!; write('Teste ehVazio deu Erro\n').
test_ehVazio_false(X):- not(ehVazio(X)),!; write('Teste ehVazio deu Erro\n').

test_uniaoConj(X,Y,Expect):- uniaoConj(X,Y,Expect),!; write('Teste uniaoConj deu Erro\n').
test_intersConj(X,Y,Expect):- intersConj(X,Y,Expect),!; write('Teste intersConj deu Erro\n').
test_diffConj(X,Y,Expect):- diffConj(X,Y,Expect),!; write('Teste diffConj deu Erro\n').
test_diffSimConj(X,Y,Expect):- diffSimConj(X,Y,Expect),!; write('Teste diffSimConj deu Erro\n').
test_addConj(X,Y,Expect):- addConj(X,Y,Expect),!; write('Teste addConj deu Erro\n').
test_remConj(X,Y,Expect):- remConj(X,Y,Expect),!; write('Teste remConj deu Erro\n').
test_tamConj(X,Expect):- tamConj(X,Expect),!; write('Teste tamConj deu Erro\n').
test_ehElemConj(X,Y):- ehElemConj(X,Y),!; write('Teste ehElemConj deu Erro\n').


run_tests:-
    test_ehVazio_true([]),
    test_ehVazio_false([1]),
    test_uniaoConj([1,2,3],[4,5,6],[1,4,2,5,3,6]),
    test_uniaoConj([1,2,3],[],[1,2,3]),
    test_uniaoConj([1,2,3],[1,2,3],[1,2,3]),
    test_intersConj([1,2,3],[4,5,6],[]),
    test_intersConj([1,2,3],[1,2,3],[1,2,3]),
    test_intersConj([],[],[]),
    test_diffConj([1,2,3],[4,5,6],[1,2,3]),
    test_diffConj([1,2,3],[],[1,2,3]),
    test_diffConj([1,2,3],[1,2,3],[]),
    test_diffConj([],[],[]),
    % test_diffSimConj([1,2,3],[4,5,6],[1,2,3,4,5,6]),
    test_diffSimConj([1,2,3],[],[1,2,3]),
    test_diffSimConj([1,2,3],[1,2,3],[]),
    test_diffSimConj([],[],[]),
    test_addConj([1,2,3],4,[1,2,3,4]),
    test_addConj([1,2,3],2,[1,2,3]),
    test_addConj([],1,[1]),
    test_remConj([1,2,3],4,[1,2,3]),
    test_remConj([1,2,3],2,[1,3]),
    test_remConj([],1,[]),
    test_tamConj([1,2,3],3),
    test_tamConj([1,2,3,6,5,4],6),
    test_ehElemConj([1,2,3],1),
    test_ehElemConj([1,2,3],2),
    test_ehElemConj([1,2,3],3),
    test_tamConj([],0),

    write('Testes executados!\n').

?- run_tests.
% uniaoConj([1,2,3],[4,5,6],[1,2,3,4,5,6]):- print('Test uniaoConj deu certo').
% uniaoConj([1,2,3],[],[1,2,3]):- print('Test uniaoConj deu certo').
% uniaoConj([1,2,3],[1,2,3],[1,2,3]):- print('Test uniaoConj deu certo').
% % Teste intersConj
% intersConj([1,2,3],[4,5,6],[]):- print('Test intersConj deu certo').

% intersConj([1,2,3],[1,2,3],[1,2,3]):- print('Test intersConj deu certo').
% intersConj([],[],[]):- print('Test intersConj deu certo').


