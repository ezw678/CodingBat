# Given a string, return a string where for every char in the original, there are two chars.

def double_char(str):
  return ''.join([c*2 for c in str])

# Return the number of times that the string "hi" appears anywhere in the given string.

def count_hi(str):
  return str.count("hi")

"""Return True if the string "cat" and "dog" appear the same number of times in the 
given string."""

def cat_dog_2(str):
  return str.count("cat")==str.count("dog")

"""Return the number of times that the string "code" appears anywhere in the given 
string, except we'll accept any letter for the 'd', so "cope" and "cooe" count."""

def count_code_1(str):
  ln = len(str)
  return sum([1 if str[i:i+2]=='co' and str[i+3]=='e' else 0 for i in range(ln-3)])

import re
def count_code_2(str):
  return len(re.findall('co.e', str))

"""Given two strings, return True if either of the strings appears at the very end 
of the other string, ignoring upper/lower case differences (in other words, the 
computation should not be "case sensitive"). Note: s.lower() returns the lowercase 
version of a string."""

def end_other_2(a, b):
  a = a.lower()
  b = b.lower()
  
  return a.endswith(b) or b.endswith(a)

"""Return True if the given string contains an appearance of "xyz" where the xyz 
is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not."""

def xyz_there(str):
  return str.replace('.xyz','').count('xyz')>=1
