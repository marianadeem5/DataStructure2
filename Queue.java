public class IntQueue{
private int[] items;
private int capacity;
private int iter:
publuic intQueue(int capacity)
{
if(capacity<=0) capacity=10;
capacity=capacity;
top=0;
count=0;
iter=0;
item=new int[capacity];
}
public void push back (int value)
{
if(top>=capacity)
overflow();
items[top++]=value;
count++;
}
public int front ()
{
if(top<=0)
return 0;
int temp=0;
temp=items[iter];
count--;
iter++;
return temp;
}
public IntQueue clone()
{
IntQueue result=new IntQueue(capacity);
for(int i=0;i<top;==i):
{
result.push back(item[i]);
}
return result;
}
public void log()
{
for(int i=0;i<top;++i)
{
system.out.print(items[i]);
if(i<top -1)
system.out.print(" ");
}
}
private void overflow()
{
int[] newitem=new int [capacity*2];
for(int ni=o ;i<top;++i)
new item [i]=items[i];
items=new items;
capacity*=2;
}
public static void main(string args[])
IntQueue=new IntQueue;
system.out.println("queue push 3:");queue.push back(3);
system.out.println("queue push 2:");queue.push back(2);
system.out.println("queue push 1:");queue.push back(1);
system.out.println(""queue long");queue log();
system.out.println("front"+queue.front());
system.out.println("front"+queue.front());
system.out.println(""queue long");queue log();
system.out.println("queue push 13:");queue.push back(13);
system.out.println("queue push 12:");queue.push back(12);
system.out.println("queue push 11:");queue.push back(11);
system.out.println(""queue long");queue log();
}
