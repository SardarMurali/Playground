#include <stdio.h>
int main() {int n,count=1,n1,sum=0;
            scanf("%d",&n);
            n1=n;
            while(n!=0)
            {int  last=n%10;
             sum=sum+(last*last*last);
              n=n/10;
             
             
            }if(sum==n1)
              printf("Armstrong Number");
            else
              printf("Not an Armstrong Number");
            
	//Type your code
	return 0;
}