n  = int(input())
l = list(map(int,input().split()))
x = int(input())
if ( x > len(l)):
  print("No node found")
else:
  print (l[x-1])