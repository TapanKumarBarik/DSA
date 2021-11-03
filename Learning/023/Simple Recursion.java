What will be the output of following program ?

C++
Java
Python
#include 
using namespace std;

int bar(int x, int y){
    if (y == 0)   return 0;
    return (x + bar(x, y-1));
}

int foo(int x, int y){
    if (y == 0) return 1;
    return bar(x, foo(x, y-1));
}

int main(){
    cout << foo(3, 5);
}

class solve {

    static int bar(int x, int y){
        if (y == 0)   return 0;
        return (x + bar(x, y-1));
    }

    static int foo(int x, int y){
        if (y == 0) return 1;
        return bar(x, foo(x, y-1));
    }
    public static void main (String[] args)
    {
         System.out.println(foo(3,5));
    }

}
def bar(x, y):
    if y == 0:
        return 0
    return (x + bar(x, y-1))

def foo(x, y):
    if(y == 0):
        return 1
    return bar(x, foo(x, y-1))

print(foo(3, 5))

          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          //243
