"""When squirrels get together for a party, they like to have cigars. A 
squirrel party is successful when the number of cigars is between 40 
and 60, inclusive. Unless it is the weekend, in which case there is 
no upper bound on the number of cigars. Return True if the party with 
the given values is successful, or False otherwise."""

def cigar_party(cigars, is_weekend):
  return 40 <= cigars <=60 if not is_weekend else cigars>=40

"""You and your date are trying to get a table at a restaurant. The parameter 
"you" is the stylishness of your clothes, in the range 0..10, and "date" 
is the stylishness of your date's clothes. The result getting the table 
is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is 
very stylish, 8 or more, then the result is 2 (yes). With the exception 
that if either of you has style of 2 or less, then the result is 0 (no). 
Otherwise the result is 1 (maybe)."""

def date_fashion(you, date):
  return 2 if you >= 8 and date > 2 or you > 2 and date >= 8 else 0 if you <= 2 or date <= 2 else 1

"""The squirrels in Palo Alto spend most of the day playing. In particular, 
they play if the temperature is between 60 and 90 (inclusive). Unless it 
is summer, then the upper limit is 100 instead of 90. Given an int temperature 
and a boolean is_summer, return True if the squirrels play and False otherwise."""

def squirrel_play(temp, is_summer):
  return True if temp in range(60,91) and not is_summer else True if temp in range (60, 101) and is_summer else False

"""You are driving a little too fast, and a police officer stops you. Write code 
to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 
2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 
and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. 
Unless it is your birthday -- on that day, your speed can be 5 higher in 
all cases."""

def caught_speeding(speed, is_birthday):
  if is_birthday:
    speed -= 5
    
  return 0 if speed<=60 else 1 if 60 <= speed <=80 else 2
   
"""Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
inclusive, are forbidden, so in that case just return 20."""

def sorta_sum(a, b):
  return 20 if sum([a, b]) in range(10,20) else sum([a, b])

"""Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a 
boolean indicating if we are on vacation, return a string of the form 
"7:00" indicating when the alarm clock should ring. Weekdays, the alarm 
should be "7:00" and on the weekend it should be "10:00". Unless we are 
on vacation -- then on weekdays it should be "10:00" and weekends it
should be "off"."""

def alarm_clock(day, vacation):
  if vacation:
    return "10:00" if 1<=day<=5 else "off"
  else:
    return "7:00" if 1<=day<=5 else "10:00"

"""The number 6 is a truly great number. Given two int values, a and b, 
return True if either one is 6. Or if their sum or difference is 6. 
Note: the function abs(num) computes the absolute value of a number."""

def love6(a, b):
  return a==6 or b==6 or a+b==6 or abs(a-b)==6

"""Given a number n, return True if n is in the range 1..10, inclusive. 
Unless outside_mode is True, in which case return True if the number 
is less or equal to 1, or greater or equal to 10."""

def in1to10(n, outside_mode):
  return not n in range(2,10) if outside_mode else n in range(1,11)

"""Given a non-negative number "num", return True if num is within 2 of a 
multiple of 10. Note: (a % b) is the remainder of dividing a by b, so 
(7 % 5) is 2. See also: Introduction to Mod"""

def near_ten(num):
  return not num%10 in range(3,8)

def main():
  pass

if __name__ == '__main__':
  main()

