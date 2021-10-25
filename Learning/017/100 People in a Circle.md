100 People in a Circle
100 people standing in a circle in an order 1 to 100.

No.1 has a sword. He kills next person (i.e. no. 2) and gives sword to next to next (i.e no.3). All person does the same until only 1 survives.

Which number survives at the last?

 Answer is a integer. Just put the number without any decimal places if its an integer. If the answer is Infinity, output Infinity. Feel free to get in touch with us if you have any questions 
 
 
 Steps-
 
 let N =num;//100
 
 int x=log(N) //base 2  //6
 
 int y=Math.pow(2,x)//64
 
 kill=N=y//100-64=36
 winner=2*kill+1  //73
 
