#include <string.h>
#include <stdlib.h>

int main() {
	char s[] = "12345654321";
	int len_, i=0, flag = 0;
	len_ = strlen(s);
	while (i < len_/2){
		if (s[i] != s[len_ - 1 - i]) {
            printf("False\n");
            flag = 1;
			break;
        }
		i = i + 1
	}
    if (flag == 0) {
        printf("True\n");
    }
	return 0;
}