n=9
for i in range (1,10):
    for y in range (1, n-i+1):
        print(0, end='')
    for y in range (1,i+1):
        print(i, end='')
    print('')    
