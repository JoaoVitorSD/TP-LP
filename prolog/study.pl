
fatorial(0,1).
fatorial(N, Fat):- NewI is N-1,  fatorial(NewI, FatProx),!, Fat is N*FatProx.
