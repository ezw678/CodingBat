def make_bricks(small, big, goal):
  needed = 0
  
  if goal>=big*5:
    needed = goal-big*5
  else:
    needed = goal%5
    
  return True if small>=needed else False

def make_bricks(small, big, goal):
  needed = 0
  if (big*5> goal):
    needed = goal%5
  else:
    needed = goal-big*5
    
  return small >= needed
    
# wow. this takes me a while
def lone_sum(a, b, c):
  ol = [a, b, c]
  nl = []
  dl = []
  
  for n in ol:
    if not n in nl:
      nl.append(n)
    else:
      dl.append(n)
      
  sm = 0
  for n in ol:
    if n not in dl:
      sm += n
  
  return sm

def lone_sum_2(a, b, c):
  ol = [a, b, c]
  nl = []
  dl = []
  
  for n in ol:
    if not n in nl:
      nl.append(n)
    else:
      dl.append(n)

  fl = list(set(ol)-set(dl))      #nice. exactly i want to figure out

  return sum(fl)

# very interesting. code works on all cases on codingbat, but not working here
# when a == b != c. doesn't make sense why it won't work
def lone_sum_3(a, b, c):
  ol = [a, b, c]
  nl = []
  fl = ol.copy()    #copy() not recognized on codingbat.com. used list(ol)
  for n in ol:
    if n not in nl:
      nl.append(n)
    else:
      fl = filter(lambda a: a!=n, fl)
      
  return sum(fl)

# does't work in these cases
# print(lone_sum(3, 3, 7)) # → 0	0	OK	    
# print(lone_sum(2, 2, 9)) # → 9	9	OK	

# print(lone_sum(1, 2, 3)) # → 6	6	OK	
# print(lone_sum(3, 2, 3)) # → 2	2	OK	
# print(lone_sum(3, 3, 3)) # → 0	0	OK	
# print(lone_sum(9, 2, 2)) # → 9	9	OK	
# print(lone_sum(2, 9, 2)) # → 9	9	OK	
# print(lone_sum(2, 9, 3)) # → 14	14	OK	
# print(lone_sum(4, 2, 3)) # → 9	9	OK	
# print(lone_sum(1, 3, 1)) # → 3	3	OK	

# not scalable, but good for only 3 nbrs
def lone_sum_online(a, b, c):
  """
  Given 3 int values, a b c, return their sum. However, if one of the values 
  is the same as another of the values, it does not count towards the sum. 
  """
  sum = 0
  sum += a if a not in [b,c] else 0
  sum += b if b not in [a,c] else 0
  sum += c if c not in [a,b] else 0
  return sum

# wow. very nice
def lone_sum_5(a, b, c):
  dct = {}
  for x in [a,b,c]:
    # or
    # if not dct.has_key(x):
    if x not in dct.keys():
      dct[x] = 1
    else:
      dct[x] = dct[x] + 1
  
  sm = 0
  for k,v in dct.items():
    sm += k if v == 1 else 0
    
  return sm
  # or even nicer
  # return sum([k for k, v in dct.items() if v==1])

def lone_sum_6(a, b, c):
  nums = [a, b, c]
  set1 = set(nums)
  temp = []
  for n in set1:
    if nums.count(n)==1:
      temp.append(n)
      
  return sum(temp)

# wow, wow. this is really nice
def lone_sum_7(a, b, c):
  nums = [a, b, c]
  nums_set = set(nums)
  
  return sum([n for n in nums_set if nums.count(n)==1])


"""Given 3 int values, a b c, return their sum. However, if one of the 
values is 13 then it does not count towards the sum and values to its 
right do not count. So for example, if b is 13, then both b and c do not 
count."""

def lucky_sum(a, b, c):
  sm = 0
  if a !=13:
    sm += a
  
  if a != 13 and b != 13:
    sm += b
    
  if a != 13 and b != 13 and c != 13:
    sm += c
    
  return sm
    
def lucky_sum_2(a, b, c):
  sm = 0
  if a ==13:
    sm = 0
  
  if a != 13 and b == 13:
    sm = a
    
  if a != 13 and b != 13 and c == 13:
    sm = a + b

  if a != 13 and b != 13 and c != 13:
    sm = a + b + c

  return sm

# wow. this is pretty clever
def lucky_sum_online(a, b, c):
  sum = 0
  list = [a,b,c,13]               #add 13 just in case there is no 13 in list
  for n in list[:list.index(13)]:      #find the first index of 13 and use it to make a list from prior items
    sum += n
  return sum
    
def lucky_sum_my_revised(a, b, c):
  ol = [a, b, c, 13]
  nl = ol[:ol.index(13)]

  return sum(nl)

def lucky_sum(a, b, c):
  ol = [a, b, c, 13]

  return sum(ol[:ol.index(13)])
    
def lucky_sum_online2(a, b, c):
  sm = 0
  
  for n in [a, b, c]:
    if n!=13:
      sm += n
    else:
      break

  return sm
    
def no_teen_sum(a, b, c):
  sm = 0
  for n in list([a, b, c]):
#   for n in [a, b, c]:       #this is fine too
    if not fix_teen(n):
      sm += n
  
  return sm
  
def fix_teen(n):
  if 13 <= n <=19 and n not in [15, 16]:
    return True
  else:
    return False

def no_teen_sum_2(a, b, c):
  return fix_teen(a) +  fix_teen(b) + fix_teen(c)
  
def fix_teen_2(n):
  return n if n==15 or n==16 else 0 if 12<n<20 else n
  # return 0 if 12<n<20 and n not in [15,16] else n    #better

print(no_teen_sum(2, 13, 1))

def no_teen_sum_3(a, b, c):
  return sum([x for x in [a,b,c] if x not in range(13,15) and x not in range(17,20)])

def no_teen_sum_4(a, b, c):
  return sum([n for n in [a,b,c] if n not in range(13, 20) or n in (15,16)])

# nice
def round_sum(a, b, c):
  sm = 0
  for n in [a, b, c]:
    sm += round10(n)
    
  return sm
  
def round10(num):
  rmdr = num%10
  if rmdr>=5:
    return num + 10-rmdr
  else:
    return num - rmdr

  # or 
  # return n + 10-rmdr if rmdr>=5 else n - rmdr

# somehow this doesn't work
# def round_sum(a, b, c):
#   return sum([x + 10 - x%10 for x in [a,b,c] if x%10>=5 else x - x%10])

# but this works. wow
def round_sum_2(a, b, c):
  return sum([x + 10 - x%10 if x%10>=5 else x- x%10 for x in [a,b,c]])

def round_sum_3(a, b, c):
  sm = 0
  for n in [a, b, c]:
    rmdr = n%10
    if rmdr >= 5:
      sm += n + 10 - rmdr
    else:
      sm += n - rmdr
      
  return sm

def close_far(a, b, c):
  if (abs(a-b) <=1 or abs(a-c)<=1) and ((abs(a-b) >= 2 and abs(b-c)>=2) or (abs(a-c) >= 2 and abs(b-c)>=2)):
    return True
  else:
    return False
  
def close_far(a, b, c):
  return abs(a-b)<=1 and abs(a-c)>=2 and abs(b-c)>=2 or abs(a-c)<=1 and abs(a-b)>=2 and abs(b-c)>=2

def make_chocolate(small, big, goal):
  needed = 0
  
  if goal>=big*5:
    needed = goal-big*5
  else:
    needed = goal%5
  
  return -1 if small < needed else needed

def gcd(n, m):
    """Compute the GCD of two integers by Euclid's algorithm."""

    n, m = abs(n), abs(m)
    n, m = min(n, m), max(n, m)  # Sort their absolute values.

    if not n:
      return m
    
    while m % n:         # While `n` doesn't divide into `m`:
        n, m = m % n, n  # update the values of `n` amd `m`.
    return n