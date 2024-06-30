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

def test_lg1_cigar_party():
   assert lg1.cigar_party(30, False) == False	
   assert lg1.cigar_party(50, False) == True
   assert lg1.cigar_party(70, True) == True
   assert lg1.cigar_party(30, True) == False	
   assert lg1.cigar_party(50, True) == True
   assert lg1.cigar_party(60, False) == True
   assert lg1.cigar_party(61, False) == False	
   assert lg1.cigar_party(40, False) == True
   assert lg1.cigar_party(39, False) == False	
   assert lg1.cigar_party(40, True) == True
   assert lg1.cigar_party(39, True) == False	

def test_lg1_date_fashion():
   assert lg1.date_fashion(5, 10) == 2	
   assert lg1.date_fashion(5, 2) == 0	
   assert lg1.date_fashion(5, 5) == 1	
   assert lg1.date_fashion(3, 3) == 1	
   assert lg1.date_fashion(10, 2) == 0	
   assert lg1.date_fashion(2, 9) == 0	
   assert lg1.date_fashion(9, 9) == 2	
   assert lg1.date_fashion(10, 5) == 2	
   assert lg1.date_fashion(2, 2) == 0	
   assert lg1.date_fashion(3, 7) == 1	
   assert lg1.date_fashion(2, 7) == 0	
   assert lg1.date_fashion(6, 2) == 0	

def test_lg1_squirrel_play():
   assert lg1.squirrel_play(70, False) == True
   assert lg1.squirrel_play(95, False) == False	
   assert lg1.squirrel_play(95, True) == True
   assert lg1.squirrel_play(90, False) == True
   assert lg1.squirrel_play(90, True) == True
   assert lg1.squirrel_play(50, False) == False	
   assert lg1.squirrel_play(50, True) == False	
   assert lg1.squirrel_play(100, False) == False	
   assert lg1.squirrel_play(100, True) == True
   assert lg1.squirrel_play(105, True) == False	
   assert lg1.squirrel_play(59, False) == False	
   assert lg1.squirrel_play(59, True) == False	
   assert lg1.squirrel_play(60, False) == True

def test_lg1_caught_speeding():
   assert lg1.caught_speeding(60, False) == 0	
   assert lg1.caught_speeding(65, False) == 1	
   assert lg1.caught_speeding(65, True) == 0	
   assert lg1.caught_speeding(80, False) == 1	
   assert lg1.caught_speeding(85, False) == 2	
   assert lg1.caught_speeding(85, True) == 1	
   assert lg1.caught_speeding(70, False) == 1	
   assert lg1.caught_speeding(75, False) == 1	
   assert lg1.caught_speeding(75, True) == 1	
   assert lg1.caught_speeding(40, False) == 0	
   assert lg1.caught_speeding(40, True) == 0	
   assert lg1.caught_speeding(90, False) == 2	

def test_lg1_sorta_sum():
   assert lg1.sorta_sum(3, 4) == 7
   assert lg1.sorta_sum(9, 4) == 20	
   assert lg1.sorta_sum(10, 11) == 21	
   assert lg1.sorta_sum(12, -3) == 9
   assert lg1.sorta_sum(-3, 12) == 9
   assert lg1.sorta_sum(4, 5) == 9
   assert lg1.sorta_sum(4, 6) == 20	
   assert lg1.sorta_sum(14, 7) == 21	
   assert lg1.sorta_sum(14, 6) == 20

def test_lg1_alarm_clock():
   assert lg1.alarm_clock(1, False) == '7:00'	
   assert lg1.alarm_clock(5, False) == '7:00'	
   assert lg1.alarm_clock(0, False) == '10:00'	
   assert lg1.alarm_clock(6, False) == '10:00'	
   assert lg1.alarm_clock(0, True) == 'off'
   assert lg1.alarm_clock(6, True) == 'off'
   assert lg1.alarm_clock(1, True) == '10:00'	
   assert lg1.alarm_clock(3, True) == '10:00'	
   assert lg1.alarm_clock(5, True) == '10:00'	

def test_lg1_love6():
   assert lg1.love6(6, 4) == True
   assert lg1.love6(4, 5) == False	
   assert lg1.love6(1, 5) == True
   assert lg1.love6(1, 6) == True
   assert lg1.love6(1, 8) == False	
   assert lg1.love6(1, 7) == True
   assert lg1.love6(7, 5) == False	
   assert lg1.love6(8, 2) == True
   assert lg1.love6(6, 6) == True
   assert lg1.love6(-6, 2) == False	
   assert lg1.love6(-4, -10) == True
   assert lg1.love6(-7, 1) == False	
   assert lg1.love6(7, -1) == True
   assert lg1.love6(-6, 12) == True
   assert lg1.love6(-2, -4) == False	
   assert lg1.love6(7, 1) == True
   assert lg1.love6(0, 9) == False	
   assert lg1.love6(8, 3) == False	
   assert lg1.love6(3, 3) == True
   assert lg1.love6(3, 4) == False

def test_lg1_in1to10():
   assert lg1.in1to10(5, False) == True	
   assert lg1.in1to10(11, False) == False	
   assert lg1.in1to10(11, True) == True	
   assert lg1.in1to10(10, False) == True	
   assert lg1.in1to10(10, True) == True	
   assert lg1.in1to10(9, False) == True	
   assert lg1.in1to10(9, True) == False	
   assert lg1.in1to10(1, False) == True	
   assert lg1.in1to10(1, True) == True	
   assert lg1.in1to10(0, False) == False	
   assert lg1.in1to10(0, True) == True	
   assert lg1.in1to10(-1, False) == False	
   assert lg1.in1to10(-1, True) == True	
   assert lg1.in1to10(99, False) == False	
   assert lg1.in1to10(-99, True) == True

def test_lg1_near_ten():
   assert lg1.near_ten(12) == True	
   assert lg1.near_ten(17) == False	
   assert lg1.near_ten(19) == True	
   assert lg1.near_ten(31) == True	
   assert lg1.near_ten(6) == False	
   assert lg1.near_ten(10) == True	
   assert lg1.near_ten(11) == True	
   assert lg1.near_ten(21) == True	
   assert lg1.near_ten(22) == True	
   assert lg1.near_ten(23) == False	
   assert lg1.near_ten(54) == False	
   assert lg1.near_ten(155) == False	
   assert lg1.near_ten(158) == True	
   assert lg1.near_ten(3) == False	
   assert lg1.near_ten(1) == True

def test_lg2_make_bricks():
   assert lg2.make_bricks(3, 1, 8) == True
   assert lg2.make_bricks(3, 1, 9) == False	
   assert lg2.make_bricks(3, 2, 10) == True
   assert lg2.make_bricks(3, 2, 8) == True
   assert lg2.make_bricks(3, 2, 9) == False	
   assert lg2.make_bricks(6, 1, 11) == True
   assert lg2.make_bricks(6, 0, 11) == False	
   assert lg2.make_bricks(1, 4, 11) == True
   assert lg2.make_bricks(0, 3, 10) == True
   assert lg2.make_bricks(1, 4, 12) == False	
   assert lg2.make_bricks(3, 1, 7) == True
   assert lg2.make_bricks(1, 1, 7) == False	
   assert lg2.make_bricks(2, 1, 7) == True
   assert lg2.make_bricks(7, 1, 11) == True
   assert lg2.make_bricks(7, 1, 8) == True
   assert lg2.make_bricks(7, 1, 13) == False	
   assert lg2.make_bricks(43, 1, 46) == True
   assert lg2.make_bricks(40, 1, 46) == False	
   assert lg2.make_bricks(40, 2, 47) == True
   assert lg2.make_bricks(40, 2, 50) == True
   assert lg2.make_bricks(40, 2, 52) == False	
   assert lg2.make_bricks(22, 2, 33) == False	
   assert lg2.make_bricks(0, 2, 10) == True
   assert lg2.make_bricks(1000000, 1000, 1000100) == True
   assert lg2.make_bricks(2, 1000000, 100003) == False	
   assert lg2.make_bricks(20, 0, 19) == True
   assert lg2.make_bricks(20, 0, 21) == False	
   assert lg2.make_bricks(20, 4, 51) == False	
   assert lg2.make_bricks(20, 4, 39) == True

def test_lg2_lone_sum():
   assert lg2.lone_sum(1, 2, 3) == 6
   assert lg2.lone_sum(3, 2, 3) == 2
   assert lg2.lone_sum(3, 3, 3) == 0
   assert lg2.lone_sum(9, 2, 2) == 9
   assert lg2.lone_sum(2, 2, 9) == 9
   assert lg2.lone_sum(2, 9, 2) == 9
   assert lg2.lone_sum(2, 9, 3) == 14	
   assert lg2.lone_sum(4, 2, 3) == 9
   assert lg2.lone_sum(1, 3, 1) == 3

def test_lg2_lucky_sum():
   assert lg2.lucky_sum(1, 2, 3) == 6
   assert lg2.lucky_sum(1, 2, 13) == 3
   assert lg2.lucky_sum(1, 13, 3) == 1
   assert lg2.lucky_sum(1, 13, 13) == 1
   assert lg2.lucky_sum(6, 5, 2) == 13	
   assert lg2.lucky_sum(13, 2, 3) == 0
   assert lg2.lucky_sum(13, 2, 13) == 0
   assert lg2.lucky_sum(13, 13, 2) == 0
   assert lg2.lucky_sum(9, 4, 13) == 13	
   assert lg2.lucky_sum(8, 13, 2) == 8
   assert lg2.lucky_sum(7, 2, 1) == 10	
   assert lg2.lucky_sum(3, 3, 13) == 6

def test_lg2_no_teen_sum():
   assert lg2.no_teen_sum(1, 2, 3) == 6
   assert lg2.no_teen_sum(2, 13, 1) == 3
   assert lg2.no_teen_sum(2, 1, 14) == 3
   assert lg2.no_teen_sum(2, 1, 15) == 18	
   assert lg2.no_teen_sum(2, 1, 16) == 19	
   assert lg2.no_teen_sum(2, 1, 17) == 3
   assert lg2.no_teen_sum(17, 1, 2) == 3
   assert lg2.no_teen_sum(2, 15, 2) == 19	
   assert lg2.no_teen_sum(16, 17, 18) == 16	
   assert lg2.no_teen_sum(17, 18, 19) == 0
   assert lg2.no_teen_sum(15, 16, 1) == 32	
   assert lg2.no_teen_sum(15, 15, 19) == 30	
   assert lg2.no_teen_sum(15, 19, 16) == 31	
   assert lg2.no_teen_sum(5, 17, 18) == 5
   assert lg2.no_teen_sum(17, 18, 16) == 16	
   assert lg2.no_teen_sum(17, 19, 18) == 0

def test_lg2_round_sum():
   assert lg2.round_sum(16, 17, 18) == 60	
   assert lg2.round_sum(12, 13, 14) == 30	
   assert lg2.round_sum(6, 4, 4) == 10	
   assert lg2.round_sum(4, 6, 5) == 20	
   assert lg2.round_sum(4, 4, 6) == 10	
   assert lg2.round_sum(9, 4, 4) == 10	
   assert lg2.round_sum(0, 0, 1) == 0
   assert lg2.round_sum(0, 9, 0) == 10	
   assert lg2.round_sum(10, 10, 19) == 40	
   assert lg2.round_sum(20, 30, 40) == 90	
   assert lg2.round_sum(45, 21, 30) == 100	
   assert lg2.round_sum(23, 11, 26) == 60	
   assert lg2.round_sum(23, 24, 25) == 70	
   assert lg2.round_sum(25, 24, 25) == 80	
   assert lg2.round_sum(23, 24, 29) == 70	
   assert lg2.round_sum(11, 24, 36) == 70	
   assert lg2.round_sum(24, 36, 32) == 90	
   assert lg2.round_sum(14, 12, 26) == 50	
   assert lg2.round_sum(12, 10, 24) == 40

def test_lg2_close_far():
   assert lg2.close_far(1, 2, 10) == True
   assert lg2.close_far(1, 2, 3) == False	
   assert lg2.close_far(4, 1, 3) == True
   assert lg2.close_far(4, 5, 3) == False	
   assert lg2.close_far(4, 3, 5) == False	
   assert lg2.close_far(-1, 10, 0) == True
   assert lg2.close_far(0, -1, 10) == True
   assert lg2.close_far(10, 10, 8) == True
   assert lg2.close_far(10, 8, 9) == False	
   assert lg2.close_far(8, 9, 10) == False	
   assert lg2.close_far(8, 9, 7) == False	
   assert lg2.close_far(8, 6, 9) == True

def test_lg2_make_chocolate():
   assert lg2.make_chocolate(4, 1, 9) == 4
   assert lg2.make_chocolate(4, 1, 10) == -1	
   assert lg2.make_chocolate(4, 1, 7) == 2
   assert lg2.make_chocolate(6, 2, 7) == 2
   assert lg2.make_chocolate(4, 1, 5) == 0
   assert lg2.make_chocolate(4, 1, 4) == 4
   assert lg2.make_chocolate(5, 4, 9) == 4
   assert lg2.make_chocolate(9, 3, 18) == 3
   assert lg2.make_chocolate(3, 1, 9) == -1	
   assert lg2.make_chocolate(1, 2, 7) == -1	
   assert lg2.make_chocolate(1, 2, 6) == 1
   assert lg2.make_chocolate(1, 2, 5) == 0
   assert lg2.make_chocolate(6, 1, 10) == 5
   assert lg2.make_chocolate(6, 1, 11) == 6
   assert lg2.make_chocolate(6, 1, 12) == -1	
   assert lg2.make_chocolate(6, 1, 13) == -1	
   assert lg2.make_chocolate(6, 2, 10) == 0
   assert lg2.make_chocolate(6, 2, 11) == 1
   assert lg2.make_chocolate(6, 2, 12) == 2
   assert lg2.make_chocolate(60, 100, 550) == 50	
   assert lg2.make_chocolate(1000, 1000000, 5000006) == 6
   assert lg2.make_chocolate(7, 1, 12) == 7
   assert lg2.make_chocolate(7, 1, 13) == -1	
   assert lg2.make_chocolate(7, 2, 13) == 3

