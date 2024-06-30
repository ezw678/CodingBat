import warmup_1 as w1
import warmup_2 as w2
import list_1 as lst1
import list_2 as lst2
import logic_1 as lg1
import logic_2 as lg2
import string_1 as str1
import string_2 as str2

def test_w1_sleep_in():
   assert w1.sleep_in(False, False) == True
   assert w1.sleep_in(True, False) == False
   assert w1.sleep_in(False, True) == True
   assert w1.sleep_in(True, True) ==True

def test_monkey_trouble():
   assert w1.monkey_trouble(True, True) == True	
   assert w1.monkey_trouble(False, False) ==  True	
   assert w1.monkey_trouble(True, False) ==  False	
   assert w1.monkey_trouble(False, True) ==  False	

def test_w1_sum_double():
   assert w1.sum_double(1, 2) == 3	
   assert w1.sum_double(3, 2) == 5	
   assert w1.sum_double(2, 2) == 8	
   assert w1.sum_double(-1, 0) == -1
   assert w1.sum_double(3, 3) == 12
   assert w1.sum_double(0, 0) == 0	
   assert w1.sum_double(0, 1) == 1	
   assert w1.sum_double(3, 4) == 7	

def test_w1_diff21():
   assert w1.diff21(19)== 2	
   assert w1.diff21(10)== 11		
   assert w1.diff21(21)== 0	
   assert w1.diff21(22)== 2	
   assert w1.diff21(25)== 8	
   assert w1.diff21(30)== 18		
   assert w1.diff21(0) ==21		
   assert w1.diff21(1) ==20		
   assert w1.diff21(2) ==19		
   assert w1.diff21(-1)== 22		
   assert w1.diff21(-2)== 23		
   assert w1.diff21(50)== 58		

def test_w1_parrot_trouble():
   assert w1.parrot_trouble(True, 6) == True
   assert w1.parrot_trouble(True, 7) == False
   assert w1.parrot_trouble(False, 6) == False	
   assert w1.parrot_trouble(True, 21) == True
   assert w1.parrot_trouble(False, 21) == False
   assert w1.parrot_trouble(False, 20) == False
   assert w1.parrot_trouble(True, 23) == True
   assert w1.parrot_trouble(False, 23) == False
   assert w1.parrot_trouble(True, 20) == False	
   assert w1.parrot_trouble(False, 12) == False

def test_w1_makes10():
   assert w1.makes10(9, 10) == True		
   assert w1.makes10(9, 9) == False	
   assert w1.makes10(1, 9) == True	
   assert w1.makes10(10, 1) == True		
   assert w1.makes10(10, 10) == True	
   assert w1.makes10(8, 2) == True	
   assert w1.makes10(8, 3) == False		
   assert w1.makes10(10, 42)== True	
   assert w1.makes10(12, -2)== True	

def test_w1_near_hundred():
   assert w1.near_hundred(93) == True
   assert w1.near_hundred(90) == True
   assert w1.near_hundred(89) == False	
   assert w1.near_hundred(110) == True
   assert w1.near_hundred(111) == False	
   assert w1.near_hundred(121) == False	
   assert w1.near_hundred(-101) == False	
   assert w1.near_hundred(-209) == False	
   assert w1.near_hundred(190) == True
   assert w1.near_hundred(209) == True
   assert w1.near_hundred(0) == False	
   assert w1.near_hundred(5) == False	
   assert w1.near_hundred(-50) == False	
   assert w1.near_hundred(191) == True
   assert w1.near_hundred(189) == False	
   assert w1.near_hundred(200) == True
   assert w1.near_hundred(210) == True
   assert w1.near_hundred(211) == False	
   assert w1.near_hundred(290) == False	

def test_w1_pos_neg():
   assert w1.pos_neg(1, -1, False) == True	
   assert w1.pos_neg(-1, 1, False) == True	
   assert w1.pos_neg(-4, -5, True) == True	
   assert w1.pos_neg(-4, -5, False) == False	
   assert w1.pos_neg(-4, 5, False) == True	
   assert w1.pos_neg(-4, 5, True) == False	
   assert w1.pos_neg(1, 1, False) == False	
   assert w1.pos_neg(-1, -1, False) == False	
   assert w1.pos_neg(1, -1, True) == False	
   assert w1.pos_neg(-1, 1, True) == False	
   assert w1.pos_neg(1, 1, True) == False	
   assert w1.pos_neg(-1, -1, True) == True	
   assert w1.pos_neg(5, -5, False) == True	
   assert w1.pos_neg(-6, 6, False) == True	
   assert w1.pos_neg(-5, -6, False) == False	
   assert w1.pos_neg(-2, -1, False) == False	
   assert w1.pos_neg(1, 2, False) == False	
   assert w1.pos_neg(-5, 6, True) == False	
   assert w1.pos_neg(-5, -5, True) == True

def test_w1_not_string():
   assert w1.not_string('candy') == 'not candy'	
   assert w1.not_string('x') == 'not x'	
   assert w1.not_string('not bad') == 'not bad'
   assert w1.not_string('bad') == 'not bad'	
   assert w1.not_string('not') == 'not'
   assert w1.not_string('is not') == 'not is not'
   assert w1.not_string('no') == 'not no'	

def test_w1_missing_char():
   assert w1.missing_char('kitten', 1) == 'ktten'	
   assert w1.missing_char('kitten', 0) == 'itten'	
   assert w1.missing_char('kitten', 4) == 'kittn'	
   assert w1.missing_char('Hi', 0) == 'i'		
   assert w1.missing_char('Hi', 1) == 'H'		
   assert w1.missing_char('code', 0) == 'ode'	
   assert w1.missing_char('code', 1) == 'cde'		
   assert w1.missing_char('code', 2) == 'coe'	
   assert w1.missing_char('code', 3) == 'cod'	
   assert w1.missing_char('chocolate', 8) == 'chocolat'	

def test_w1_front_back():
   assert w1.front_back('code') == 'eodc'
   assert w1.front_back('a') == 'a'	
   assert w1.front_back('ab') == 'ba'	
   assert w1.front_back('abc') == 'cba'
   assert w1.front_back('') == ''
   assert w1.front_back('Chocolate') == 'ehocolatC'
   assert w1.front_back('aavJ') == 'Java'	
   assert w1.front_back('hello') == 'oellh'	

def test_w1_front3():
   assert w1.front3('Java') == 'JavJavJav'
   assert w1.front3('Chocolate') == 'ChoChoCho'
   assert w1.front3('abc') == 'abcabcabc'
   assert w1.front3('abcXYZ') == 'abcabcabc'	
   assert w1.front3('ab') == 'ababab'	
   assert w1.front3('a') == 'aaa'
   assert w1.front3('') == ''

def test_w2_string_times():
   assert w2.string_times('Hi', 2) == 'HiHi'	
   assert w2.string_times('Hi', 3) == 'HiHiHi'
   assert w2.string_times('Hi', 1) == 'Hi'	
   assert w2.string_times('Hi', 0) == ''
   assert w2.string_times('Hi', 5) == 'HiHiHiHiHi'	
   assert w2.string_times('Oh Boy!', 2) == 'Oh Boy!Oh Boy!'	
   assert w2.string_times('x', 4) == 'xxxx'	
   assert w2.string_times('', 4) == ''
   assert w2.string_times('code', 2) == 'codecode'	
   assert w2.string_times('code', 3) == 'codecodecode'

def test_w2_front_times():
   assert w2.front_times('Chocolate', 2) == 'ChoCho'	
   assert w2.front_times('Chocolate', 3) == 'ChoChoCho'	
   assert w2.front_times('Abc', 3) == 'AbcAbcAbc'	
   assert w2.front_times('Ab', 4) == 'AbAbAbAb'	
   assert w2.front_times('A', 4) == 'AAAA'	
   assert w2.front_times('', 4) == ''
   assert w2.front_times('Abc', 0) == ''

def test_w2_string_bits():
   assert w2.string_bits('Hello') == 'Hlo'
   assert w2.string_bits('Hi') == 'H'		
   assert w2.string_bits('Heeololeo') == 'Hello'	
   assert w2.string_bits('HiHiHi') == 'HHH'	
   assert w2.string_bits('') == ''	''	
   assert w2.string_bits('Greetings') == 'Getns'	
   assert w2.string_bits('Chocoate') == 'Coot'	
   assert w2.string_bits('pi') == 'p'	
   assert w2.string_bits('Hello Kitten') == 'HloKte'	
   assert w2.string_bits('hxaxpxpxy') == 'happy' 

def test_w2_string_splosion():
   assert w2.string_splosion('Code') == 'CCoCodCode'		
   assert w2.string_splosion('abc') == 'aababc'	
   assert w2.string_splosion('ab') == 'aab'
   assert w2.string_splosion('x') == 'x'	
   assert w2.string_splosion('fade') == 'ffafadfade'	
   assert w2.string_splosion('There') == 'TThTheTherThere'	
   assert w2.string_splosion('Kitten') == 'KKiKitKittKitteKitten'	
   assert w2.string_splosion('Bye') == 'BByBye'	
   assert w2.string_splosion('Good') == 'GGoGooGood'	
   assert w2.string_splosion('Bad') == 'BBaBad'	

def test_w2_last2():
   assert w2.last2('hixxhi') == 1	
   assert w2.last2('xaxxaxaxx') == 1	
   assert w2.last2('axxxaaxx') == 2	
   assert w2.last2('xxaxxaxxaxx') == 3	
   assert w2.last2('xaxaxaxx') == 0	
   assert w2.last2('xxxx') == 2	
   assert w2.last2('13121312') == 1	
   assert w2.last2('11212') == 1	
   assert w2.last2('13121311') == 0	
   assert w2.last2('1717171') == 2	
   assert w2.last2('hi') == 0	
   assert w2.last2('h') == 0	
   assert w2.last2('') == 0

def test_w2_array_count9():
   assert w2.array_count9([1, 2, 9]) == 1	
   assert w2.array_count9([1, 9, 9]) == 2	
   assert w2.array_count9([1, 9, 9, 3, 9]) == 3	
   assert w2.array_count9([1, 2, 3]) == 0	
   assert w2.array_count9([]) == 0	
   assert w2.array_count9([4, 2, 4, 3, 1]) == 0	
   assert w2.array_count9([9, 2, 4, 3, 1]) == 1

def test_2_array_front9():
   assert w2.array_front9([1, 2, 9, 3, 4]) == True	
   assert w2.array_front9([1, 2, 3, 4, 9]) == False	
   assert w2.array_front9([1, 2, 3, 4, 5]) == False	
   assert w2.array_front9([9, 2, 3]) == True	
   assert w2.array_front9([1, 9, 9]) == True	
   assert w2.array_front9([1, 2, 3]) == False	
   assert w2.array_front9([1, 9]) == True	
   assert w2.array_front9([5, 5]) == False	
   assert w2.array_front9([2]) == False	
   assert w2.array_front9([9]) == True	
   assert w2.array_front9([]) == False	
   assert w2.array_front9([3, 9, 2, 3, 3]) == True

def test_w2_array123():
   assert w2.array123([1, 1, 2, 3, 1]) == True
   assert w2.array123([1, 1, 2, 4, 1]) == False	
   assert w2.array123([1, 1, 2, 1, 2, 3]) == True
   assert w2.array123([1, 1, 2, 1, 2, 1]) == False	
   assert w2.array123([1, 2, 3, 1, 2, 3]) == True
   assert w2.array123([1, 2, 3]) == True
   assert w2.array123([1, 1, 1]) == False	
   assert w2.array123([1, 2]) == False	
   assert w2.array123([1]) == False	
   assert w2.array123([]) == False	

def test_w2_string_match():
   assert w2.string_match('xxcaazz', 'xxbaaz') == 3	
   assert w2.string_match('abc', 'abc') == 2	
   assert w2.string_match('abc', 'axc') == 0	
   assert w2.string_match('hello', 'he') == 1	
   assert w2.string_match('he', 'hello') == 1	
   assert w2.string_match('h', 'hello') == 0	
   assert w2.string_match('', 'hello') == 0	
   assert w2.string_match('aabbccdd', 'abbbxxd') == 1	
   assert w2.string_match('aaxxaaxx', 'iaxxai') == 3	
   assert w2.string_match('iaxxai', 'aaxxaaxx') == 3

def test_lst1_first_last6():
   assert lst1.first_last6([1, 2, 6]) == True
   assert lst1.first_last6([6, 1, 2, 3]) == True
   assert lst1.first_last6([13, 6, 1, 2, 3]) == False	
   assert lst1.first_last6([13, 6, 1, 2, 6]) == True
   assert lst1.first_last6([3, 2, 1]) == False	
   assert lst1.first_last6([3, 6, 1]) == False	
   assert lst1.first_last6([3, 6]) == True
   assert lst1.first_last6([6]) == True
   assert lst1.first_last6([3]) == False	
   assert lst1.first_last6([5, 6]) == True
   assert lst1.first_last6([5, 5]) == False	
   assert lst1.first_last6([1, 2, 3, 4, 6]) == True
   assert lst1.first_last6([1, 2, 3, 4]) == False

def test_lst1_same_first_last():
   assert lst1.same_first_last([1, 2, 3]) == False	
   assert lst1.same_first_last([1, 2, 3, 1]) == True
   assert lst1.same_first_last([1, 2, 1]) == True
   assert lst1.same_first_last([7]) == True
   assert lst1.same_first_last([]) == False	
   assert lst1.same_first_last([1, 2, 3, 4, 5, 1]) == True
   assert lst1.same_first_last([1, 2, 3, 4, 5, 13]) == False	
   assert lst1.same_first_last([13, 2, 3, 4, 5, 13]) == True
   assert lst1.same_first_last([7, 7]) == True

def test_lst1_rotate_left3():
   assert lst1.rotate_left3([1, 2, 3]) == [2, 3, 1]	
   assert lst1.rotate_left3([5, 11, 9]) == [11, 9, 5]	
   assert lst1.rotate_left3([7, 0, 0]) == [0, 0, 7]
   assert lst1.rotate_left3([1, 2, 1]) == [2, 1, 1]
   assert lst1.rotate_left3([0, 0, 1]) == [0, 1, 0]

def test_lst1_reverse3():
   assert lst1.reverse3([1, 2, 3]) == [3, 2, 1]
   assert lst1.reverse3([5, 11, 9]) == [9, 11, 5]	
   assert lst1.reverse3([7, 0, 0]) == [0, 0, 7]
   assert lst1.reverse3([2, 1, 2]) == [2, 1, 2]
   assert lst1.reverse3([1, 2, 1]) == [1, 2, 1]
   assert lst1.reverse3([2, 11, 3]) == [3, 11, 2]	
   assert lst1.reverse3([0, 6, 5]) == [5, 6, 0]
   assert lst1.reverse3([7, 2, 3]) == [3, 2, 7]

def test_lst1_max_end3():
   assert lst1.max_end3([1, 2, 3]) == [3, 3, 3]
   assert lst1.max_end3([11, 5, 9]) == [11, 11, 11]	
   assert lst1.max_end3([2, 11, 3]) == [3, 3, 3]
   assert lst1.max_end3([11, 3, 3]) == [11, 11, 11]	
   assert lst1.max_end3([3, 11, 11]) == [11, 11, 11]
   assert lst1.max_end3([2, 2, 2]) == [2, 2, 2]
   assert lst1.max_end3([2, 11, 2]) == [2, 2, 2]
   assert lst1.max_end3([0, 0, 1]) == [1, 1, 1]

def test_lst1_sum2():
   assert lst1.sum2([1, 2, 3]) == 3	
   assert lst1.sum2([1, 1]) == 2	
   assert lst1.sum2([1, 1, 1, 1]) == 2	
   assert lst1.sum2([1, 2]) == 3	
   assert lst1.sum2([1]) == 1	
   assert lst1.sum2([]) == 0	
   assert lst1.sum2([4, 5, 6]) == 9	
   assert lst1.sum2([4]) == 4	

def test_lst1_has23():
   assert lst1.has23([2, 5]) == True
   assert lst1.has23([4, 3]) == True
   assert lst1.has23([4, 5]) == False	
   assert lst1.has23([2, 2]) == True
   assert lst1.has23([3, 2]) == True
   assert lst1.has23([3, 3]) == True
   assert lst1.has23([7, 7]) == False	
   assert lst1.has23([3, 9]) == True
   assert lst1.has23([9, 5]) == False

def test_lst2_count_evens():
   assert lst2.count_evens([2, 1, 2, 3, 4]) == 3	
   assert lst2.count_evens([2, 2, 0]) == 3	
   assert lst2.count_evens([1, 3, 5]) == 0	
   assert lst2.count_evens([]) == 0	
   assert lst2.count_evens([11, 9, 0, 1]) == 1	
   assert lst2.count_evens([2, 11, 9, 0]) == 2	
   assert lst2.count_evens([2]) == 1	
   assert lst2.count_evens([2, 5, 12]) == 2	

def test_lst2_sum13():
   assert lst2.sum13([1, 2, 2, 1]) == 6	
   assert lst2.sum13([1, 1]) == 2	
   assert lst2.sum13([1, 2, 2, 1, 13]) == 6	
   assert lst2.sum13([1, 2, 13, 2, 1, 13]) == 4	
   assert lst2.sum13([13, 1, 2, 13, 2, 1, 13]) == 3	
   assert lst2.sum13([]) == 0	
   assert lst2.sum13([13]) == 0	
   assert lst2.sum13([13, 13]) == 0	
   assert lst2.sum13([13, 0, 13]) == 0	
   assert lst2.sum13([13, 1, 13]) == 0	
   assert lst2.sum13([5, 7, 2]) == 14	
   assert lst2.sum13([5, 13, 2]) == 5	
   assert lst2.sum13([0]) == 0	
   assert lst2.sum13([13, 0]) == 0	

def test_lst2_sum67():
   assert lst2.sum67([1, 2, 2]) == 5	
   assert lst2.sum67([1, 2, 2, 6, 99, 99, 7]) == 5	
   assert lst2.sum67([1, 1, 6, 7, 2]) == 4	
   assert lst2.sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) == 2	
   assert lst2.sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) == 2	
   assert lst2.sum67([2, 7, 6, 2, 6, 7, 2, 7]) == 18	
   assert lst2.sum67([2, 7, 6, 2, 6, 2, 7]) == 9	
   assert lst2.sum67([1, 6, 7, 7]) == 8	
   assert lst2.sum67([6, 7, 1, 6, 7, 7]) == 8	
   assert lst2.sum67([6, 8, 1, 6, 7]) == 0	
   assert lst2.sum67([]) == 0	
   assert lst2.sum67([6, 7, 11]) == 11	
   assert lst2.sum67([11, 6, 7, 11]) == 22	
   assert lst2.sum67([2, 2, 6, 7, 7]) == 11	

def test_lst2_has22():
   assert lst2.has22([1, 2, 2]) == True
   assert lst2.has22([1, 2, 1, 2]) == False	
   assert lst2.has22([2, 1, 2]) == False	
   assert lst2.has22([2, 2, 1, 2]) == True
   assert lst2.has22([1, 3, 2]) == False	
   assert lst2.has22([1, 3, 2, 2]) == True
   assert lst2.has22([2, 3, 2, 2]) == True
   assert lst2.has22([4, 2, 4, 2, 2, 5]) == True
   assert lst2.has22([1, 2]) == False	
   assert lst2.has22([2, 2]) == True
   assert lst2.has22([2]) == False	
   assert lst2.has22([]) == False	
   assert lst2.has22([3, 3, 2, 2]) == True
   assert lst2.has22([5, 2, 5, 2]) == False	

