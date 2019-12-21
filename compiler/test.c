#include  <string.h>
#include  <stdlib.h>

int main() {
	char S[1024];
	char T[1024];
	int nxt[1024];
	int lenS, lenT;
	int flag = 0;

	gets(S);
	gets(T);
	lenS = strlen(S);
	lenT = strlen(T);

	nxt[0] = -1;
    int j = -1;
	for (int i = 1; i < lenT;  i++) {
		while(j >= 0 && T[i] != T[j+1]){
            j = nxt[j];
        }
		if (T[i] == T[j+1]) {
            j++;
        }
		nxt[i] = j;
	}
    j = -1;
	for (int i = 0; i < lenS; i++) {
		while(j >= 0 && S[i] != T[j+1]){
            j = nxt[j];
        }
		if (S[i] == T[j+1]) {
            j++;
        }
		if (j == lenT-1) {
			printf("%d\n", i - j);
			flag = 1;
			j = nxt[j];
		}
	}
	if (flag == 0){
		printf("False\n");
    }

	return 0;
}