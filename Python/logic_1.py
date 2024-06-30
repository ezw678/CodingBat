"""When squirrels get together for a party, they like to have cigars. A 
squirrel party is successful when the number of cigars is between 40 
and 60, inclusive. Unless it is the weekend, in which case there is 
no upper bound on the number of cigars. Return True if the party with 
the given values is successful, or False otherwise."""

def cigar_party(cigars, is_weekend):
  return 40 <= cigars <=60 if not is_weekend else cigars>=40



def date_fashion(you, date):
  if (you>=8 and date>2) or (you>2 and date>=8):
    return 2
  elif you <= 2 or date <=2:
    return 0
  else:
    return 1

def date_fashion(you, date):
  return 2 if you >= 8 and date>2 or you >2 and date>=8 else 0 if you <=2 or date<=2 else 1

def squirrel_play(temp, is_summer):
  if not is_summer:
    return True if temp in range(60, 91) else False
  else:
    return True if temp in range(60, 101) else False
    
  return False
    
def squirrel_play(temp, is_summer):
  if is_summer:
      return temp in range(60, 101)
  else:
      return temp in range(60, 91)

def squirrel_play(temp, is_summer):
  return True if temp in range(60,91) and not is_summer else True if temp in range (60, 101) and is_summer else False

def squirrel_play(temp, is_summer):
  return temp in range(60, 101) if is_summer else temp in range(60,91)

def caught_speeding(speed, is_birthday):
  ticket = 0
  if not is_birthday:
    if speed <= 60:
      ticket = 0
    elif speed in range(61,81):
      ticket = 1
    else:
      ticket = 2
  else:
    if speed <= 60+5:
      ticket = 0
    elif speed in range(61+5,81+5):
      ticket = 1
    else:
      ticket = 2
      
  return ticket

# clever
def caught_speeding_online(speed, is_birthday):
  if is_birthday:
    speed -= 5;               #; is fine
    
  if speed <=60:
    return 0
    
  return 1 if 60 <= speed <=80 else 2

# this is nice
def caught_speeding2(speed, is_birthday):
  if is_birthday:
    speed -= 5
    
  return 0 if speed<=60 else 1 if 60 <= speed <=80 else 2;     #can't use elif in ternary operator
    
def caught_speeding_3(speed, is_birthday):
  limit1 = 60
  limit2 = 80
  if is_birthday:
    limit1 += 5
    limit2 += 5
    
  return 0 if speed<=limit1 else 1 if limit1 <speed <= limit2 else 2

def caught_speeding(speed, is_birthday):
  speed = speed if not is_birthday else speed - 5
  return 0 if speed <=60 else 1 if speed in range(61, 81) else 2

def caught_speeding(speed, is_birthday):
  if is_birthday:
    speed -= 5
    
  return 0 if speed <=60 else 1 if speed in range(61, 81) else 2

def sorta_sum(a, b):
  sm = a + b
  return 20 if 10 <= sm <= 19 else sm

def sorta_sum_2(a, b):
  return a + b if not a+b in range(10, 20) else 20

def sorta_sum_3(a, b):
  return 20 if sum([a, b]) in range(10,20) else sum([a, b])

def alarm_clock(day, vacation):
  if vacation:
    return "10:00" if 1<=day<=5 else "off"
  else:
    return "7:00" if 1<=day<=5 else "10:00"

def alarm_clock(day, vacation):
  if not vacation:
    return '7:00' if day in range(1,6) else '10:00'
  else:
    return '10:00' if day in range(1,6) else 'off'

# only a-b needs abs() b/c it can be either a-b or b-a
def love6(a, b):
  return True if a==6 or b==6 or abs(a-b)==6 or a+b==6 else False

# ew
def love6(a, b):
  return a==6 or b==6 or a+b==6 or abs(a-b)==6


def in1to10(n, outside_mode):
  if not outside_mode:
    return True if 1<=n<=10 else False
  else:
    return True if n<=1 or n>=10 else False

def in1to10(n, outside_mode):
  if not outside_mode:
    return True if n in range(1,11) else False
  else:
    return True if not n in range(2,10) else False

#ew. wow
def in1to10(n, outside_mode):
  if not outside_mode:
    return n in range(1,11)
  else:
    return not n in range(2,10)

def in1to10(n, outside_mode):
  if not outside_mode:
    return n in range(1,11)
  else:
    return n<=1 or n>=10

def in1to10(n, outside_mode):
  return not n in range(2,10) if outside_mode else n in range(1,11)

# wow. clever
def near_ten_online(num):
  rmdr =  num%10
  
  return True if rmdr <= 2 or rmdr >=8 else False

# also nice
def near_ten_online2(num):
 # return 0 <= (num % 10) <= 2 or 8 <= (num % 10) <= 10
 return num % 10 in [0,1,2,8,9,10]

#ew
def near_ten(num):
  return not num%10 in range(3,8)

def near_ten(num):
  rmdr = num%10
  return not rmdr in range(3,8)

if __name__ == '__main__':
    pass