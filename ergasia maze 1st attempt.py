
maze=input("Please enter the maze's content, incerting a space between the content of every row: ")#eisagoyme to periexomeno twn keliwn toy pinaka me keno ana seira
row=maze.split(' ')                     # xwrizoume ana seira
i=len(row)                              #metrame seires
j=len(row[0])                           #metrame stiles
maze=maze.replace(' ','')               #afairoume ta kena
monopati=[]                             #dimiourgoume to monopati
k=0
l=0
for a in range (0,i):                   #prwto stoixeio tis listas monopati einai to keli ekkinisis
   for b in range (0,j):
       if maze[a*j+b]=='S':
           monopati=[(a+1,b+1)]
           k, l =a, b



#   se kathe vima elegxoume ta 4 geitonika kelia tou keliou pou briskomaste
#   pano, dexia, kato, aristera
#   an einai to keli stoxos, to prosthetoume sto monopati kai typonoume to monopati
#   an einai eleythera k den ta exoume episkeftei, metaferomaste ekei,
#   ta markaroume oti ta exoume episkeftei, ta prosthetoume sto monopati pou exoyme
#   dimiourgisei kai epanalamvanoume tin anazitisi sta geitonika tous kelia

def anazitisi(x,y):
    if x-1>=0:
        if maze[(x-1)*j+y]=='G':
            monopati.append((x,y+1))
            return monopati
        elif maze[(x-1)*j+y]=='_':
            maze[(x-1)*j+y]='H'
            monopati.append((x,y+1))
            return anazitisi(x-1,y)
    if y-1>=0:
        if maze[x*j+y-1]=='G':
            monopati.append((x+1,y))
            return monopati
        elif maze[x*j+y-1]=='_':
            maze[x*j+y-1]='H'
            monopati.append((x+1,y))
            return anazitisi(x,y-1)
    if x+1<i:
        if maze[(x+1)*j+y]=='G':
            monopati.append((x+2,y+1))
            return monopati
        elif maze[(x+1)*j+y]=='_':
            maze[(x+1)*j+y]='H'
            monopati.append((x+2,y+1))
            return anazitisi(x+1,y)
    if y+1<j:
        if maze[x*j+y+1]=='G':
            monopati.append((x+1,y+2))
            return monopati
        elif maze[x*j+y+1]=='_':
            maze[x*j+y+1]='H'
            monopati.append((x+1,y+2))
            return anazitisi(x,y+1)


anazitisi(k,l)
print(monopati)

