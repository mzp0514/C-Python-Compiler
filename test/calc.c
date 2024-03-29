#include <stdio.h>
#include <string.h>

int main(){
	char toDec[1000];
    gets(toDec);
    char expr[1000];
	int len_ = strlen(toDec);
	for (int i = 0; i < len_; i++){
		expr[i] = toDec[i];
	}


    int st_num[1000];
    char st_op[1000];

    int st_num_pt = -1;
    int st_op_pt = -1;

    for(int i = len_-1; i >= 0; i = i - 1) {
        expr[i + 1] = expr[i];
    }
    expr[0] = '(';
    expr[len_+1] = ')';
    len_ = len_ + 2;

    int i = len_ - 1;
    int num = 0;
    int k = 1;
    while(i >= 0){
        if(expr[i] == '+'){
            while(st_op_pt >= 0 && ((st_op[st_op_pt] == '*') || (st_op[st_op_pt] == '/'))){
                if(st_op[st_op_pt] == '*') {
                    st_num[st_num_pt - 1] = st_num[st_num_pt] * st_num[st_num_pt - 1];
                }
                else {
                    st_num[st_num_pt - 1] = st_num[st_num_pt] / st_num[st_num_pt - 1];
                }
                st_num_pt--;
                st_op_pt--;
            }
            st_op_pt++;
            st_op[st_op_pt] = '+';
            i--;
        }else if(expr[i] == '-'){
            while(st_op_pt >= 0 && ((st_op[st_op_pt] == '*') || (st_op[st_op_pt] == '/'))){
                if(st_op[st_op_pt] == '*'){
                    st_num[st_num_pt - 1] = st_num[st_num_pt] * st_num[st_num_pt - 1];
                }
                else{
                    st_num[st_num_pt - 1] = st_num[st_num_pt] / st_num[st_num_pt - 1];
                }
                st_num_pt = st_num_pt - 1;
                st_op_pt = st_op_pt - 1;
            }
            st_op_pt++;
            st_op[st_op_pt] = '-';
            i--;
        }else if(expr[i] == '*'){
            st_op_pt++;
            st_op[st_op_pt] = '*';
            i--;
        }else if(expr[i] == '/'){
            st_op_pt++;
            st_op[st_op_pt] = '/';
            i--;
        }else if(expr[i] == ')'){
            st_op_pt++;
            st_op[st_op_pt] = ')';
            i--;
        }else if(expr[i] == '('){
            while(st_op[st_op_pt] != ')'){
                char ch = st_op[st_op_pt];
                st_op_pt--;
                if(ch == '+'){
                    st_num[st_num_pt - 1] = st_num[st_num_pt] + st_num[st_num_pt - 1];
                }
                else if(ch == '-'){
                    st_num[st_num_pt - 1] = st_num[st_num_pt] - st_num[st_num_pt - 1];
                }
                else if(ch == '*'){
                    st_num[st_num_pt - 1] = st_num[st_num_pt] * st_num[st_num_pt - 1];
                }
                else if(ch == '/'){
                    st_num[st_num_pt - 1] = st_num[st_num_pt] / st_num[st_num_pt - 1];
                }
                st_num_pt = st_num_pt - 1;
            }
            st_op_pt--;
            i--;
        }else{
            num = 0;
            k = 1;
            while(i >= 0 && expr[i] >= '0' && expr[i] <= '9'){
                num = num + (float(expr[i]) - float('0')) * k;
                k = k * 10;
                i--;
            }
            st_num_pt++;
            st_num[st_num_pt] = num;
        }
    }
    printf("%d\n", st_num[0]);
    return 0;
}
