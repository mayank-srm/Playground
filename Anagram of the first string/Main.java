a = input()
b = input()
c = ''.join(sorted(a))
d = ''.join(sorted(b))
if (c == d):
  print("Anagram")
else:
  print("Not anagrams")