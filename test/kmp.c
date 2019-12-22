#include  <string.h>
#include  <stdlib.h>

int main() {
	printf("enter two strings, the first is src, and the next is pattern");
	char src[1000];
	char pattern[1000];
	gets(src);
	gets(pattern);
	int prefix[1000];
	int n=strlen(src);
	int m=strlen(pattern);

	int flag = 0;
	int k = 0;
	/* Compute prefix*/
	for (int q = 2; q < m+1; q=q+1)
	{
		while (k > 0 && pattern[k] != pattern[q - 1]) {
			k = prefix[k - 1];
		}
			
		if (pattern[k] == pattern[q - 1]) {
			k=k+1;
		}
		prefix[q - 1] = k;
	}
	/* Match!*/
	int q = 0;
	for (int j = 0; j < n; j=j+1)
	{
		while (q > 0 && pattern[q] != src[j]) {
			q = prefix[q - 1];
		}
		if (pattern[q] == src[j]) {
			q=q+1;
		}
			
		if (q == m)
		{
			if (flag == 0) {
			    int temp1 = j - m +1;
				printf("%d", temp1);
			}
			else {
			    int temp2 = j - m +1;
				printf(",%d", temp2);
			}
			flag = 1;
			/* next match */
			q = prefix[q - 1];
		}
	}
	if (flag == 0) {
		printf("False");
	}
	return 0;
}
