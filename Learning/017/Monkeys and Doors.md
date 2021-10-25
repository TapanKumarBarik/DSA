Monkeys and Doors
There are 100 doors, all closed. In a nearby cage are 100 monkeys.

The first monkey is let out, and runs along the doors opening every one. The second monkey is then let out, and runs along the doors closing the 2nd, 4th, 6th,… - all the even-numbered doors. The third monkey is let out. He attends only to the 3rd, 6th, 9th,… doors (every third door, in other words), closing any that is open and opening any that is closed, and so on. After all 100 monkeys have done their work in this way, what state are the doors in after the last pass?

Answer with the number of open doors.

 Answer is a integer. Just put the number without any decimal places if its an integer. If the answer is Infinity, output Infinity. Feel free to get in touch with us if you have any questions 
 
 
 
 Solution: 
A door is toggled in ith walk if i divides door number. For example, door number 45 is toggled in 1st, 3rd, 5th, 9th,15th, and 45th walk.
The door is switched back to an initial stage for every pair of divisors. For example, 45 is toggled 6 times for 3 pairs (5, 9), (15, 3), and (1, 45). 
It looks like all doors would become closed at the end. But there are door numbers which would become open, for example, 16, the pair (4, 4) means only one walk. Similarly all other perfect squares like 4, 9,… 

So the answer is 1, 4, 9, 16, 25, 36, 49, 64, 81 and 100. 
