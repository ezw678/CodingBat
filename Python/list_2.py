
"""Return the number of even ints in the given array. Note: the % "mod" 
operator computes the remainder, e.g. 5 % 2 is 1."""

def count_evens(nums):
  return len([0 for x in nums if x%2==0])

"""Given an array length 1 or more of ints, return the difference between 
the largest and smallest values in the array. Note: the built-in 
min(v1, v2) and max(v1, v2) functions return the smaller or larger 
of two values."""

def big_diff(nums):
  return max(nums) - min(nums)

"""Return the "centered" average of an array of ints, which we'll say is 
the mean average of the values, except ignoring the largest and smallest 
values in the array. If there are multiple copies of the smallest value, 
ignore just one copy, and likewise for the largest value. Use int division 
to produce the final average. You may assume that the array is length 3 
or more."""

def centered_averageOnline1(nums):
  return (sum(nums)-max(nums)-min(nums)) /(len(nums)-2)

"""Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers 
that come immediately after a 13 also do not count."""
     
def sum13(nums):
  if (ln:=len(nums)) == 0: 
    return 0
  
  return sum([0 if nums[i]==13 or (i>0 and nums[i-1]==13) else nums[i] for i in range(ln)])

"""Return the sum of the numbers in the array, except ignore sections 
of numbers starting with a 6 and extending to the next 7 (every 6 will 
be followed by at least one 7). Return 0 for no numbers"""

def sum67(nums):
  found6 = False
  sm = 0
  for n in nums:
    if n==6:
      found6 = True

    if not found6:
      sm += n

    if n == 7:
      found6 = False

  return sm

"""Given an array of ints, return True if the array contains a 2 
next to a 2 somewhere."""

def has22(nums):
  return sum([1 if nums[i]==nums[i-1]==2 else 0 for i in range(1,len(nums))])>0

def main():
  pass

if __name__ == '__main__':
  main()





